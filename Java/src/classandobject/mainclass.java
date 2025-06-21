package classandobject;

import java.sql.SQLOutput;

public class mainclass {
    public static void main(String[] args){
        System.out.println("Hello Everyone, Welcome to Spring Boot !");


        //create the object or student class
        student student1=new student();
        System.out.println("Before assigning the values of student1:"+student1);

        //assigning the value

        student1.id=123;
        student1.name="Ram";
        student1.address="west of T academy";
        student1.gender="Male";
        student1.grade="A+";

        System.out.println("After assigning the values of student1:"+student1);


        System.out.println("Exmaple of static");
        sample sample1=new sample();
        System.out.println("abc is:"+sample1.abc);  //non static using object name accesssing it
        System.out.println("pqr is:"+sample.pqr);  //static using class name accessing it

        sample1.demo1(); //non static using object name accesssing it
        sample.demo2(); //static using class name accessing it



    }
}
