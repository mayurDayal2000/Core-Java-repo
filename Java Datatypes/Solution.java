/* Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer 
values (byte, short, int, and long):

    A byte is an 8-bit signed integer -> whole numbers from -128 to 127
    A short is a 16-bit signed integer -> whole numbers from -32,768 to 32,767
    An int is a 32-bit signed integer -> whole numbers from -2,147,483,648 to 2,147,483,647
    A long is a 64-bit signed integer -> whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

Given an input integer, you must determine which primitive data types are capable of properly storing that input.

*/

import java.util.Scanner;
class Solution{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // enter the number of queries

        for(int i=0; i<num; i++){

            try {

                long num1 = scan.nextLong();

                System.out.println(num1 + " can be fitted in:");

                if((num1 >= -128) && (num1 <= 127)){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if((num1 >= -Math.pow(2, 15)) && (num1 <= Math.pow(2, 15) - 1)){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }

                else if((num1 >= -Math.pow(2, 31)) && (num1 <= Math.pow(2, 31) - 1)){
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if((num1 >= -Math.pow(2, 63)) && (num1 <= Math.pow(2, 63) - 1)){
                    System.out.println("* long");
                }
                    
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
            
        }
        scan.close();
    }
}
