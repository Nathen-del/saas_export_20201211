package cn.nathen.dao.company;

import cn.nathen.domain.company.Company;
import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: Company
 * Author:   pdven
 * Date:     2020/12/13 15:26
 * Description:
 */
public interface CompanyDao {

    //查询所有企业
    List<Company> findAll();

}
