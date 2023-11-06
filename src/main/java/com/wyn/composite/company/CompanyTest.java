package com.wyn.composite.company;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:48$
 */
public class CompanyTest {
    public static void main(String[] args) {
        ConCreteCompany root = new ConCreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
        ConCreteCompany company = new ConCreteCompany("上海分公司");
        company.add(new HrDepartment("上海分公司人力资源部"));
        company.add(new HrDepartment("上海分公司财务部"));
        root.add(company);
        ConCreteCompany creteCompany = new ConCreteCompany("南京办事处");
        creteCompany.add(new HrDepartment("南京办事处人力资源部"));
        creteCompany.add(new FinanceDepartment("南京办事处财务部"));
        company.add(creteCompany);
    }
}

    