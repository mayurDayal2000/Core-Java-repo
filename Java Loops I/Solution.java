/*
Given an integer, n , print its first 10 multiples. Each multiple  n * i (where i>=1 && i<=10 ) should be printed on a new line in the form: N x i = result.
*/

import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=1; i<=10; i++){
            int result = num*i;
            System.out.println(num + " x " + i +" = " + result);
        }

        scan.close();
    }
}
