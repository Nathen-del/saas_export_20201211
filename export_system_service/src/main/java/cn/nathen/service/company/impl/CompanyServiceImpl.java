package cn.nathen.service.company.impl;

import cn.nathen.dao.company.CompanyDao;
import cn.nathen.domain.company.Company;
import cn.nathen.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//加入spring容器
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyDao companyDao;



    /**
     * 查询所有企业
     * @return
     */
    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}
