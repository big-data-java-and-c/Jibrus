package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl   {
    private TestDao testDao;

    @Autowired
    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }


    public String getTest() {
        return testDao.getTest();
    }
}
