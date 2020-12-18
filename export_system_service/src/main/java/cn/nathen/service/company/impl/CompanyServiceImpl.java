package cn.nathen.service.company.impl;

import cn.nathen.dao.company.CompanyDao;
import cn.nathen.domain.company.Company;
import cn.nathen.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//����spring����
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyDao companyDao;



    /**
     * ��ѯ������ҵ
     * @return
     */
    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}
