/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
 
    static void patternPrinter(int n) {
    // write your code here
        int len=n*n;
        
        for(int i=n;i>=1;i--){
            int p=n;
            
            for(int j=1;j<=len;j++){
                System.out.print(p+" ");
                if(j%i==0){
                    p--;
                }
            }
            System.out.println(" ");
            len=len-n;
        }
    }
}
