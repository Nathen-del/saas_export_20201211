package cn.nathen.controller;

import cn.nathen.domain.company.Company;
import cn.nathen.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;



    @RequestMapping("/list")
    @ResponseBody //����json ,�����첽
    public List<Company> companyList() {
        List<Company> list = companyService.findAll();
        return list;
    }

    //��ʽ2:ͬ��
    @RequestMapping("/list2")
    public String companyList2(HttpServletRequest request) {
        List<Company> List = companyService.findAll();
        request.setAttribute("companyList",List);

        return "company/company-list2";
    }
}
