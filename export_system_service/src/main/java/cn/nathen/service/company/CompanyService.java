package cn.nathen.service.company;

import cn.nathen.domain.company.Company;

import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: CompanyService
 * Author:   pdven
 * Date:     2020/12/13 20:48
 * Description:
 */
public interface CompanyService {

    /**
     * ��ѯ������ҵ
     * @return
     */
    public List<Company> findAll();

}
