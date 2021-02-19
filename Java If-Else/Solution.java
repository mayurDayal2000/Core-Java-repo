/* 
  Given an integer, perform the following conditional actions:
  If n is odd, print Weird
  If n is even and in the inclusive range of 2 to 5, print Not Weird
  If n is even and in the inclusive range of 6 to 20, print Weird
  If n is even and greater than 20, print Not Weird
*/

import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        String msg;
        
        // conditions
        if(n%2 == 0 && (n>2 && n<5)){
            msg = "Not Weird";
        }
        else if(n%2 == 0 && (n>6 && n<20)){
            msg = "Weird";
        }
        else if(n%2 == 0 && n>20){
            msg = "Not Weird";
        }
        else{
            msg = "Weird";
        }
        
        System.out.println(msg);
        scan.close();
    }
}
