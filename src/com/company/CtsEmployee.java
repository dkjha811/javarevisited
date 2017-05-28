package com.company;

import com.company.model.BloodGroup;
import com.company.model.Employee;

/**
 * Created by djha5 on 5/28/2017.
 */
public class CtsEmployee extends Employee{
   private String companyId;

    public CtsEmployee(String name, int age, BloodGroup bloodGrp, String companyId) {
        super(name, age, bloodGrp);
        this.companyId = companyId;
    }

    public CtsEmployee(String companyId) {
        this.companyId = companyId;
    }
}
