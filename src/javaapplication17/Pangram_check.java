package javaapplication17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pangram_check {

    String sen = "A quick brown fox jumps over the lazy dog";
    int[] arr = new int[26];
    boolean flag = true;

    void meth() {
        sen = sen.toLowerCase();
    char[] cha = sen.toCharArray();
        for (int i = 0; i < sen.length(); i++) {
            if (!(sen.charAt(i) == ' ')) {
                arr[sen.charAt(i) - 97]++;
            }
        }
        String str = Arrays.toString(arr);
        if(str.contains("0")||sen.length()<0)
            flag=false;
        System.out.println((flag ? "Panagram " : " Non Pangram  "));
    }
}
