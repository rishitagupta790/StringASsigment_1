
package javaapplication17;

import java.util.Arrays;

public class UniquwCharac {
    String ssc="+qlabcdefgh";
    boolean flag=true;
    void umeth()
    {
         int[] ar=new int[126];
        for(int i=0 ;i<ssc.length();i++)
        {
          ar[ssc.charAt(i)-31]++; 
        }
       for(int i=0;i<126;i++)
       {
           if(ar[i]>1)
           {
               flag=false;
               break;
           }
           else flag=true;
       }
       if(flag==true)
            System.out.println("String contain unique character");
       else
           System.out.println("String does not contain unique character");
       
    }
}
