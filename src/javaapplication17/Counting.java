package javaapplication17;

public class Counting {

    public String ss = "CHECKING CONSONENT ";
    public Integer vcount = 0;
    public Integer ccount = 0;
    public Integer scount = 0;

    String meth() {
        ss = ss.toLowerCase();

        for (int i = 0; i < ss.length() - 1; i++) {
            if (ss.charAt(i) == 'a' || ss.charAt(i) == 'e' || ss.charAt(i) == 'i' || ss.charAt(i) == 'o' || ss.charAt(i) == 'u') {
                ++vcount;
            } else if (ss.charAt(i) == 'b' || ss.charAt(i) == 'c' || ss.charAt(i) == 'd' || ss.charAt(i) == 'f' || ss.charAt(i) == 'g'
                    || ss.charAt(i) == 'h' || ss.charAt(i) == 'j' || ss.charAt(i) == 'k' || ss.charAt(i) == 'l' || ss.charAt(i) == 'm'
                    || ss.charAt(i) == 'n' || ss.charAt(i) == 'p' || ss.charAt(i) == 'q' || ss.charAt(i) == 'r' || ss.charAt(i) == 's'
                    || ss.charAt(i) == 't' || ss.charAt(i) == 'v' || ss.charAt(i) == 'w' || ss.charAt(i) == 'x' || ss.charAt(i) == 'y'
                    || ss.charAt(i) == 'z') {
                ++ccount;
            } else {
                ++scount;
            }
        }
        System.out.println("  Number of vowel in the program  =  " + vcount);
        System.out.println("  Number of Consonent in the program  =  " + ccount);
        System.out.println("  Number of Special Character  in the program  =  " + scount);

        return "Executed";
    }

}
