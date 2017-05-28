package com.company;

import com.company.model.BloodGroup;
import com.company.model.Employee;

/**
 * Created by djha5 on 5/28/2017.
 */
public class SapientEmployee extends Employee{
    private String companyId;

    public SapientEmployee(String name, int age, BloodGroup bloodGrp, String companyId) {
        super(name, age, bloodGrp);
        this.companyId = companyId;
    }

    public SapientEmployee(String companyId) {
        this.companyId = companyId;
    }
}

