package javaapplication17;

public class Duplicate {

    public void meth() {

        System.out.println("");
        String s = "Riissshiita ";
        String p = "  ";
        String sp = "  ";
        for (int i = 0; i < s.length() - 1; i++) {
            // logic to print duplicate value from a string
            if (s.charAt(i) == s.charAt(i + 1)) {
                sp = sp + s.charAt(i);
            } else // logic to print string after removing the duplicate value
            {
                p = p + s.charAt(i);
            }
        }
        System.out.println("After removing duplicate  ----->   " + p);

    }

    void meth2() {
        String s = "Riissshiita ";
        String p = "  ";
        String sp = "  ";
        for (int i = 0; i < s.length() - 1; i++) {
            // logic to print duplicate value from a string
            if (s.charAt(i) == s.charAt(i + 1)) {
                sp = sp + s.charAt(i);
            } else // logic to print string after removing the duplicate value
            {
                p = p + s.charAt(i);
            }
        }
        System.out.println("Duplicate Value in the String     ----->  " + sp);
    }

}
