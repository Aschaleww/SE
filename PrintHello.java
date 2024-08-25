/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

/**
 *
 * @author asche
 */
import java.util.Scanner;
public class PrintHello {
    public static void printHelloWorld(int[] arr){ 
      for(int i=0; i< arr.length; i++){ 
      if(arr[i]%5 ==0){
      System.out.println("Hello");
      }
      else if(arr[i]%7 ==0){
      System.out.println("World");
      }
      else if( arr[i]%5 ==0&& arr[i]%7 ==0){
      System.out.println("HelloWorld");
      }else{
      System.out.println("Nothing");
      }
      }
    }
  public static void main(String []args){
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array");
      int N = sc.nextInt();
      
      System.out.println("Enter the number");
      int[] n = new int[N];
      
      for(int i=0; i<n.length; i++){
      n[i] = sc.nextInt();
      }
      printHelloWorld(n);
      }
}
