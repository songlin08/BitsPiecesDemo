package com.lin.io.对象流;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -279877755998553771L;

    private String name;

    private String sex;

    private String salary;

    public Employee() {
    }

    public Employee(String name, String sex, String salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }
}
