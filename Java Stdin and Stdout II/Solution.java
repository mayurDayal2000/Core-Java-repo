/*
There are three lines of input:

    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.

There are three lines of output:

    On the first line, print String: followed by the unaltered String read from stdin.
    On the second line, print Double: followed by the unaltered double read from stdin.
    On the third line, print Int: followed by the unaltered integer read from stdin.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; 
because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() 
will be reading the remainder of the integer line (which is empty).
*/

import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
        
        scan.close();
        
    }
}
