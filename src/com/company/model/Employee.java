package com.company.model;

/**
 * Created by djha5 on 5/28/2017.
 */


public class Employee {

    private String name;
    private int age;
    private BloodGroup bloodGrp;

    public Employee(String name, int age, BloodGroup bloodGrp) {
        this.name = name;
        this.age = age;
        this.bloodGrp = bloodGrp;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodGroup getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(BloodGroup bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (!name.equals(employee.name)) return false;
        return bloodGrp == employee.bloodGrp;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + bloodGrp.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  name;
    }
}
