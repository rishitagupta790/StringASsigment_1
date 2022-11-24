package javaapplication17;

import java.util.Arrays;

public class Anagram {

    public String st = "heart";
    public String ts = "earth";

    void ana() {
        if (st.length() != ts.length()) {
            System.out.println("Not An Anagram");
        } 
        else {
          char[] ch=st.toCharArray();
          char[] hc=ts.toCharArray();
          Arrays.sort(ch);
          Arrays.sort(hc);
          boolean b=Arrays.equals(ch, hc);
          
          if(b)
                System.out.println("Yes It Is An Anagram");
           else
                System.out.println("NOt an Anagram");
        }
    }


}
