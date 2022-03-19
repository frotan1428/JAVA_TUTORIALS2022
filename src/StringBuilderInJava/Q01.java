package StringBuilderInJava;

public class Q01 {


    public static void main(String[] args) {


        // create a StringBuilder object
        // using StringBuilder() constructor

        StringBuilder sb=new StringBuilder();
            sb.append("GFG");
        // print string
        System.out.println(sb);
        System.out.println(sb.toString());

        // using StringBuilder(CharSequence) constructor

        StringBuilder sb1=new StringBuilder("AAABBBCCC");
        System.out.println(sb1.toString());

        // using StringBuilder(capacity) constructor

        StringBuilder sb2=new StringBuilder(10);
        System.out.println(sb2.capacity());

        // using StringBuilder(String) constructor
        StringBuilder sb3=new StringBuilder(sb1.toString());
        System.out.println(sb3.toString());





    }
}
