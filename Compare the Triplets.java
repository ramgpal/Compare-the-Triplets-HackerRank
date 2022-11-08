import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
        Scanner s = new Scanner(System.in);
//        int N = scan.nextInt();
        int alice[] = new int[3];
        int bob[] = new int[3];
        int comp1=0, comp3=0;
        for(int i=0;i<3;i++)
            alice[i]=s.nextInt();
       for(int i=0;i<3;i++)
            bob[i]=s.nextInt();
        for(int i=0;i<3;i++)
            if(alice[i]>bob[i])
                comp1++;
            else if(alice[i]<bob[i])
                comp3++;
        System.out.println(comp1+" "+comp3);
        s.close();
    }
}