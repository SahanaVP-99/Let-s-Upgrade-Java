package com.avenger;
import java.util.Scanner;
public class Avengers {




      String name,power,weapon,planet;
       int age;
       Scanner sc = new Scanner(System.in);
       public void getDetails(){
       System.out.println("enter avenger name");
        name = sc.next();
       System.out.println("enter avenger age");
       age = sc.nextInt();
       System.out.println("enter avenger power");
        power = sc.next();
       System.out.println("enter avenger weapon");
       weapon = sc.next();
       System.out.println("enter avenger planet");
       planet= sc.next();
       }
       public void displayDetails(){
          System.out.println("the name of avenger is"+name+ ", " + "age"+age+ "," +"power"+power+"," +"weapon"+weapon+ "," +"planet"+planet);
        }
          
  public static void main(String[] args){
       Avengers[] avengers= new Avengers[5];
       for(int i=0; i<5; i++){
         avengers[i] = new Avengers();
         avengers[i].getDetails();
         avengers[i].displayDetails();
       }
  }



}


