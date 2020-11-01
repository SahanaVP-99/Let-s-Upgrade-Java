package com.inheritance;
import java.util.Scanner;

public class Employee {
        Scanner sc = new Scanner(System.in);
        String name , designation ;
        int age;
        double salary ;
        public void getDetails()
        {
          System.out.println("enter name");
          name = sc.next();
          System.out.println("enter age");
          age = sc.nextInt();
          System.out.println("enter designation ");
          designation = sc.next();
          System.out.println("enter  salary");
          salary = sc.nextDouble();
        }
        
        public void displayDetails()
        {
          System.out.println(name+" " +age+" "+designation +" "+salary);
        }
        


}
