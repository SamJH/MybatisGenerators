package com.oracle.dao;

import com.oracle.po.person;
import java.math.BigDecimal;

public interface personMapper {
    int deleteByPrimaryKey(BigDecimal pid);

    int insert(person record);

    int insertSelective(person record);

    person selectByPrimaryKey(BigDecimal pid);

    int updateByPrimaryKeySelective(person record);

    int updateByPrimaryKey(person record);
}