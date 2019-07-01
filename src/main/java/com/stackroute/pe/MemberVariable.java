package com.stackroute.pe;

public class MemberVariable {
    public static void main(String [] args)
    {
        Member object=new Member();
        object.setAge(30);
        object.setName("Harry Potter");
        object.setSalary(2500.3);

        System.out.println(object.getName());
        System.out.println(object.getAge());
        System.out.println(object.getSalary());
    }
}
