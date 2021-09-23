package com.java;

public class Students implements Man{
    public String name;
    public int age;
    public double rollNo;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }

    public Students(String name, int age, double rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}
