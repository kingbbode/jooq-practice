package com.kingbbode;

import com.kingbbode.entities.tables.pojos.JPosts;
import com.kingbbode.repository.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JooqPracticeApplicationTests {

	@Autowired
	private PostRepository postRepository;

	@Test
	public void jooq_findAll() {
		List<JPosts> list = postRepository.findAll();
		assertThat(list, not(nullValue()));
		assertThat(list.size(), greaterThanOrEqualTo(1));
	}

	@Test
	public void jooq_alias_test_as() {
		List<Map<String, Object>> list = postRepository.findAllJoinAsTableForAliasTest();
		assertThat(list, not(nullValue()));
		assertThat(list.size(), greaterThanOrEqualTo(1));
	}

	@Test
	public void jooq_alias_test_util() {
		List<Map<String, Object>> list = postRepository.findAllJoinUseJooqUtilForAliasTest();
		assertThat(list, not(nullValue()));
		assertThat(list.size(), greaterThanOrEqualTo(1));
	}

	@Test
	public void verification() {
		Map<String, Object> one = postRepository.findAllJoinAsTableForAliasTest().get(0);
		Map<String, Object> other = postRepository.findAllJoinUseJooqUtilForAliasTest().get(0);
		one.entrySet().parallelStream().forEach(entry -> {
			assertThat(other.containsKey(entry.getKey()), is(true));
			assertThat(other.get(entry.getKey()), is(entry.getValue()));
		});
	}

}
