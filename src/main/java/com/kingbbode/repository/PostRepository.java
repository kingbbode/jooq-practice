package com.kingbbode.repository;

import com.kingbbode.entities.tables.pojos.JPosts;
import com.kingbbode.entities.tables.records.JCommentsRecord;
import com.kingbbode.entities.tables.records.JPostsRecord;
import com.kingbbode.utils.JooqUtil;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static com.kingbbode.entities.Tables.COMMENTS;
import static com.kingbbode.entities.Tables.POSTS;

/**
 * Created by YG-MAC on 2017. 6. 24..
 */
@Repository
public class PostRepository {
    @Autowired
    private DSLContext dsl;

    public List<JPosts> findAll(){
        return dsl
                .selectFrom(POSTS)
                .fetch()
                .into(JPosts.class);
    }

    public List<JPosts> findAllForAliasTest(){
        return dsl
                .selectFrom(POSTS.asTable("post", field -> "test_"+field.getName()))
                .fetch()
                .into(JPosts.class);
    }

    public List<Map<String, Object>> findAllJoinUseJooqUtilForAliasTest(){
        return dsl
                .select(JooqUtil.prefixAlias("post_", POSTS, "ID", "TITLE"))
                .select(JooqUtil.prefixAlias("comments_", COMMENTS, "NAME", "EMAIL", "CONTENT"))
                .from(POSTS)
                .join(COMMENTS).on(COMMENTS.POST_ID.eq(POSTS.ID))
                .where(COMMENTS.EMAIL.isNotNull()
                        .and(POSTS.NAME.ne(COMMENTS.NAME))
                )
                .fetchMaps();
    }

    public List<Map<String, Object>> findAllJoinAsTableForAliasTest(){
        Table<JPostsRecord> posts = POSTS.as("POSTS", field -> "post_"+field.getName());
        Table<JCommentsRecord> comments = COMMENTS.as("COMMENTS", field -> "comments_"+field.getName());
        return dsl
                .select(posts.fields("post_ID", "post_TITLE"))
                .select(comments.fields("comments_NAME", "comments_EMAIL", "comments_CONTENT"))
                .from(posts)
                .join(comments).on(comments.field("comments_POST_ID", Integer.class).eq(posts.field("post_ID", Integer.class)))
                .where(comments.field("comments_EMAIL").isNotNull()
                        .and(posts.field("post_NAME", String.class).ne(comments.field("comments_NAME", String.class))))
                .fetchMaps();
    }
}
