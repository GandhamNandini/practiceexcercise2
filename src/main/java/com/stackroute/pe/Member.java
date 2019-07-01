package com.stackroute.pe;

public class Member {
    public String Name;
    public int Age;
    public double Salary;
    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public double getSalary()
    {
        return Salary;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
