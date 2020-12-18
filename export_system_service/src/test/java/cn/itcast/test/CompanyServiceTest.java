package cn.itcast.test;

import cn.nathen.domain.company.Company;
import cn.nathen.service.company.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//注意： 我们的service是依赖dao的时候，所以我们加载配置文件的时候一定需要把dao的配置文件也要加载进来。
//注意： 如果加载多个配置文件的时候需要使用classpath*:
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
