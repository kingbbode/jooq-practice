/*
 * This file is generated by jOOQ.
*/
package com.kingbbode.entities.tables;


import com.kingbbode.entities.JJooqPractice;
import com.kingbbode.entities.Keys;
import com.kingbbode.entities.tables.records.JCommentsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JComments extends TableImpl<JCommentsRecord> {

    private static final long serialVersionUID = 55168588;

    /**
     * The reference instance of <code>jooq-practice.COMMENTS</code>
     */
    public static final JComments COMMENTS = new JComments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JCommentsRecord> getRecordType() {
        return JCommentsRecord.class;
    }

    /**
     * The column <code>jooq-practice.COMMENTS.ID</code>.
     */
    public final TableField<JCommentsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq-practice.COMMENTS.POST_ID</code>.
     */
    public final TableField<JCommentsRecord, Integer> POST_ID = createField("POST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq-practice.COMMENTS.NAME</code>.
     */
    public final TableField<JCommentsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>jooq-practice.COMMENTS.EMAIL</code>.
     */
    public final TableField<JCommentsRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>jooq-practice.COMMENTS.CONTENT</code>.
     */
    public final TableField<JCommentsRecord, String> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jooq-practice.COMMENTS.CREATED_ON</code>.
     */
    public final TableField<JCommentsRecord, Timestamp> CREATED_ON = createField("CREATED_ON", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>jooq-practice.COMMENTS</code> table reference
     */
    public JComments() {
        this("COMMENTS", null);
    }

    /**
     * Create an aliased <code>jooq-practice.COMMENTS</code> table reference
     */
    public JComments(String alias) {
        this(alias, COMMENTS);
    }

    private JComments(String alias, Table<JCommentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private JComments(String alias, Table<JCommentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JJooqPractice.JOOQ_PRACTICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JCommentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JCommentsRecord> getPrimaryKey() {
        return Keys.KEY_COMMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JCommentsRecord>> getKeys() {
        return Arrays.<UniqueKey<JCommentsRecord>>asList(Keys.KEY_COMMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JCommentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JCommentsRecord, ?>>asList(Keys.COMMENTS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JComments as(String alias) {
        return new JComments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JComments rename(String name) {
        return new JComments(name, null);
    }
}