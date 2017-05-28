package com.company;

import com.company.model.BloodGroup;
import com.company.model.Employee;

/**
 * Created by djha5 on 5/28/2017.
 */
public class AccentureEmployee extends Employee{
    private String companyId;

    public AccentureEmployee(String name, int age, BloodGroup bloodGrp, String employeeId) {
        super(name, age, bloodGrp);
        this.companyId = employeeId;
    }

    public AccentureEmployee(String employeeId) {
        this.companyId = employeeId;
    }
}
