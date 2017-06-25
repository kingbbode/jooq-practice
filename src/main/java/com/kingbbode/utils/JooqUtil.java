package com.kingbbode.utils;

import org.jooq.Field;
import org.jooq.TableLike;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Jooq 사용시 필요한 유틸리티.
 */
public class JooqUtil {
    /**
     * 
     * underscore 표기법을 준수하여 테이블의 모든 필드에 
     * prefix alias 를 붙인다.
     * 
     * @param prefix the prefix alias
     * @param table the jooq table 
     * @return the field array
     */
    public static <T extends TableLike> Field<?>[] prefixAlias(String prefix, T table){
        return Arrays.stream(table.fields())
                .map(field -> prefixAlias(prefix, field))
                .toArray(Field[]::new);
    }

    /**
     * 
     * underscore 표기법을 준수하여 테이블의 선택된 필드에 
     * prefix alias 를 붙인다.
     * 
     * @param prefix the prefix alias
     * @param table the jooq table 
     * @param fields the jooq table field name string
     * @return the field array
     */
    public static <T extends TableLike> Field<?>[] prefixAlias(String prefix, T table, String... fields){
        Set<String> candidateFields = new HashSet<>(Arrays.asList(fields));
        return Arrays.stream(table.fields())
                .filter(field -> candidateFields.contains(field.getName()))
                .map(field -> prefixAlias(prefix, field))
                .toArray(Field[]::new);
    }

    /**
     *
     * underscore 표기법을 준수하여 필드에 
     * prefix alias 를 붙인다.
     * 
     * @param prefix the prefix alias
     * @param field the jooq field 
     * @return the field
     */
    public static Field<?> prefixAlias(String prefix, Field<?> field){
        return field.as(prefix + field.getName());
    }
}