package com.jibrus.jibrus.daos;

import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{
    @Override
    public String getTest() {
        return "TEST";
    }
}
