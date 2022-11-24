package javaapplication17;

public class Palindrom {

    public String str = "2552";
    public String tr = "";

    void palindrom() {
        for (int i = str.length() - 1; i >= 0; i--) {
            tr = tr + str.charAt(i);
        }
        if (tr.equals(str)) {
            System.out.println("Yes It Is Palindrom ");
        } else {
            System.out.println("Sorry Its Not A Palindrom ");
        }
    }

}
