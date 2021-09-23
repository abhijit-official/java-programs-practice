package com.java;

public class Teachers implements Man {
    public String name;
    public int age;
    public double salary;

    public Teachers(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

