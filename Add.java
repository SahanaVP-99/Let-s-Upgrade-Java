package com.add;
import java.util.Scanner;
public class Add {

  public static void main(String[] args) {
  
   int[] a=new int[5];
   int sum=0;
   Scanner sa=new Scanner(System.in);
   for(int i=0;i<a.length;i++){
     System.out.println("Enter the number ");
     a[i]=sa.nextInt();
   }
   for(int i=0;i<a.length;i++){
     sum+=a[i];
   }
   System.out.println("sum is "+sum);
   
  }

}

 
