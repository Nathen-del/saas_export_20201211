package cn.nathen.domain.company;

import java.util.Date;


/**
 * Copyright (C), 2018-2020
 * FileName: Company
 * Author:   pdven
 * Date:     2020/12/13 15:23
 * Description:
 */
//��ҵʵ����
public class Company {

    /**
     * ����Ψһ��ǣ���Ӧ���ݿ�����
     */
    private String id;
    /**
     * ��˾����
     */
    private String name;

    /**
     * ����ʱ��
     */
    private Date expirationDate;

    /**
     * ��˾��ַ
     */
    private String address;
    /**
     * Ӫҵִ��
     */
    private String licenseId;
    /**
     * ���˴���
     */
    private String representative;
    /**
     * ��˾�绰
     */
    private String phone;
    /**
     * ��˾��ģ
     */
    private String companySize;
    /**
     * ������ҵ
     */
    private String industry;
    /**
     * ��ע
     */
    private String remarks;

    /**
     * ״̬
     */
    private Integer state;
    /**
     * ��ǰ���
     */
    private Double balance;
    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * ����
     */
    private String city;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", expirationDate=" + expirationDate +
                ", address='" + address + '\'' +
                ", licenseId='" + licenseId + '\'' +
                ", representative='" + representative + '\'' +
                ", phone='" + phone + '\'' +
                ", companySize='" + companySize + '\'' +
                ", industry='" + industry + '\'' +
                ", remarks='" + remarks + '\'' +
                ", state=" + state +
                ", balance=" + balance +
                ", createTime=" + createTime +
                ", city='" + city + '\'' +
                '}';
    }
}
