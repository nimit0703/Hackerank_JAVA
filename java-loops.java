//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans =a;
            for (int j =0;j<n;j++){
                int value = (int)Math.pow(2,j);
                ans= ans + (value*b);
                System.out.print(ans + " ");
             }
             System.out.println();
        }
        in.close();
        
    }
}
