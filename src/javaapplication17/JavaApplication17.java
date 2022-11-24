package javaapplication17;

public class JavaApplication17 {

    public static void main(String[] args) {

        Duplicate d = new Duplicate();
        d.meth();
        d.meth2();
        System.out.println("=========================================================");
        Palindrom p = new Palindrom();
        p.palindrom();
         System.out.println("=========================================================");
        Counting c = new Counting();
        String s = c.meth();
        System.out.println(s);
         System.out.println("=========================================================");
        Anagram an=new Anagram();
        an.ana();
        Pangram_check pkoip=new Pangram_check();
        pkoip.meth();
         System.out.println("=========================================================");
        UniquwCharac  uc=new UniquwCharac();
        uc.umeth();
         System.out.println("=========================================================");
        MaxOccCharacter moc=new MaxOccCharacter();
        moc.checking();
    }

}
