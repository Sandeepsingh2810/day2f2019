package com.lambton;

public class CollegeExample
{
    public static void main(String[] args)
    {
    Arithmetic a1 = new Arithmetic();

        System.out.println("Add " + a1.add(10,10));
        System.out.println("Sub " + a1.sub(10,20));
        System.out.println("Mul " + a1.mul(10,20));
        System.out.println("Div " + a1.div(20,3));
        System.out.println("Mod " + a1.mod(10,20));

        Student s1=new Student();

        s1.setFirstName("Sandeep");
        s1.setLastName("Jangra");

        s1.setMarks1(70);
        s1.setMarks2(85);
        s1.setMarks3(60);
        s1.setMarks4(75);
        s1.setMarks5(80);

        s1.calculateTotal();
        s1.calculatePercentage();

        System.out.println(s1.getFullName());
        System.out.println(s1.getMarks1());
        System.out.println(s1.getMarks2());
        System.out.println(s1.getMarks3());
        System.out.println(s1.getMarks4());
        System.out.println(s1.getMarks5());

        System.out.println(s1.getTotal());
        System.out.println(s1.getPercentage());
        s1.generateResult();
        System.out.println(s1.getResult());
    }

}
