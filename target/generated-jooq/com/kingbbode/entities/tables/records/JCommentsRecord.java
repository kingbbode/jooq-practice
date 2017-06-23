/*
 * This file is generated by jOOQ.
*/
package com.kingbbode.entities.tables.records;


import com.kingbbode.entities.tables.JComments;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JCommentsRecord extends UpdatableRecordImpl<JCommentsRecord> implements Record6<Integer, Integer, String, String, String, Timestamp> {

    private static final long serialVersionUID = 1509243890;

    /**
     * Setter for <code>jooq-practice.COMMENTS.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq-practice.COMMENTS.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq-practice.COMMENTS.POST_ID</code>.
     */
    public void setPostId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq-practice.COMMENTS.POST_ID</code>.
     */
    public Integer getPostId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jooq-practice.COMMENTS.NAME</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq-practice.COMMENTS.NAME</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq-practice.COMMENTS.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq-practice.COMMENTS.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jooq-practice.COMMENTS.CONTENT</code>.
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq-practice.COMMENTS.CONTENT</code>.
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jooq-practice.COMMENTS.CREATED_ON</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jooq-practice.COMMENTS.CREATED_ON</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JComments.COMMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JComments.COMMENTS.POST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JComments.COMMENTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JComments.COMMENTS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JComments.COMMENTS.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JComments.COMMENTS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getPostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord value2(Integer value) {
        setPostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCommentsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JCommentsRecord
     */
    public JCommentsRecord() {
        super(JComments.COMMENTS);
    }

    /**
     * Create a detached, initialised JCommentsRecord
     */
    public JCommentsRecord(Integer id, Integer postId, String name, String email, String content, Timestamp createdOn) {
        super(JComments.COMMENTS);

        set(0, id);
        set(1, postId);
        set(2, name);
        set(3, email);
        set(4, content);
        set(5, createdOn);
    }
}