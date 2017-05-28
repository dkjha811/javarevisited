package com.company;

import com.company.model.BloodGroup;
import com.company.model.Employee;

import java.util.ArrayList;

public class CompanyProfile {
    public static void main(String[] args) {
        // write your code
//        System.out.println("asfds");
        Employee employee = new Employee();
        employee.setAge(23);
        employee.setName("dj");
        employee.setBloodGrp(BloodGroup.fromString("A+ve"));
//        System.out.println(employee.toString());
//
//        System.out.println("Name: " + employee.getName()
//        + "\nAge: " + employee.getAge()
//        + "\nBloodGroup: " + employee.getBloodGrp());

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SapientEmployee("Sapientdj", 80, BloodGroup.A_NEGATIVE, "kjk"));
        employees.add(new CtsEmployee("CTSdj", 50, BloodGroup.A_NEGATIVE, "jhgf"));
        employees.add(new AccentureEmployee("Accenturedj", 44, BloodGroup.A_NEGATIVE, "jhgf"));
        employees.add(new Employee("sp", 80, BloodGroup.O_NEGATIVE));
        employees.add(new Employee("na", 8, BloodGroup.B_NEGATIVE));

        Employee tempEmployee1 = new Employee();
        tempEmployee1.setName("CTSdj");
        tempEmployee1.setBloodGrp(BloodGroup.A_NEGATIVE);
        tempEmployee1.setAge(50);
        System.out.println(employees.contains(tempEmployee1)? "Exists" : "Not Exists");


//        for (Employee emp : employees) {
//            if ("na".equalsIgnoreCase(emp.getName())) {
//                System.out.println("Exists");
//                break;
//            } else {
//                System.out.println("Not Exists");
//            }
//        }

       /* for (Employee emp : employees) {
            System.out.print(emp.getName()+ ", ");
        }*/

//        System.out.println(employees.toString());
    }
}


