/*

  Array is the list of elements of same type places in a contiguous memory location.
  Syntax : dataType arrName = new dataType[size]

  Operations
  1) Create
  2) Input
  3) Output
  4) Update
  5) Array Length
 
*/

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[10];  //array creation --> Arrays statically typed hota hai matlab rumtime arrays ka size hum change nahi kr payenge.

        //Array Length --> variableName.length
        System.out.println("Array Length : " + marks.length);

        int number[] = {1 ,2, 3}; //array ceation

        //Input
        marks[0] = sc.nextInt(); //Physics
        marks[1] = sc.nextInt(); //Chemistry
        marks[2] = sc.nextInt(); //Maths

        //Output
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        //Update
        marks[2] = 100;
        System.out.println("Maths : " + marks[2]);

        //Percentage
        int Percentage = (marks[0] + marks[1] + marks[2]) / 3 ;
        System.out.println("Percentage = " + Percentage + "%");
        
    }
}