package com.wyn.composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description:
 * @ Author     :wenyanni288
 * @ Date       :2023/10/22 10:46$
 */
public class HrDepartment extends Company{
    private List<Company> childen = new ArrayList<>();

    public HrDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company company) {
        childen.add(company);
    }

    @Override
    public void delete(Company company) {
        childen.add(company);
    }
}

    