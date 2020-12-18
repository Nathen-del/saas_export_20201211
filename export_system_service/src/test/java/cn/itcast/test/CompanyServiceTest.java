package cn.itcast.test;

import cn.nathen.domain.company.Company;
import cn.nathen.service.company.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//ע�⣺ ���ǵ�service������dao��ʱ���������Ǽ��������ļ���ʱ��һ����Ҫ��dao�������ļ�ҲҪ���ؽ�����
//ע�⣺ ������ض�������ļ���ʱ����Ҫʹ��classpath*:
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class CompanyServiceTest {

    @Autowired
    private CompanyService companyService;

    @Test
    public void test01(){
        List<Company> list = companyService.findAll();
        list.forEach(System.out::println);
    }


}
