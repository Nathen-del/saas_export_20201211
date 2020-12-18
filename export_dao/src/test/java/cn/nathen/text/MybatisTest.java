package cn.nathen.text;

import cn.nathen.dao.company.CompanyDao;
import cn.nathen.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: CompanyTest
 * Author:   pdven
 * Date:     2020/12/13 16:05
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-Dao.xml")
public class MybatisTest {

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test1() {
        List<Company> list = companyDao.findAll();
        list.forEach(System.out::println);
    }


}
