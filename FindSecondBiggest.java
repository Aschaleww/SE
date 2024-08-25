/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

/**
 *
 * @author asche
 */
import.java.util.*;
public class FindSecondBiggest {
    public static void findSecondLargest(int[] arr){
     if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest value.");
        } else {
            System.out.println("The second largest value is: " + secondLargest);
        }
    }
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array");
    int N = sc.nextInt();
    System.out.println("Enter the number");
    int[] n = new int[N];
    for(int i=0; i<n.length; i++){
   n[i]= sc.nextInt();
    }
    findSecondLargest(n);
    }
}
