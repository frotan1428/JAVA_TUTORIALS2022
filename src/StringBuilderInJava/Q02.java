package StringBuilderInJava;

public class Q02 {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Welcome to Geeksforgeeks ");
        sb1.append("FROTAN ");
        System.out.println("Input: " + sb1);

        /* Here it appends the char argument as
        string to the StringBuilder */
        StringBuilder sb2=new StringBuilder();
        sb2.append('T');
        sb2.append('A');
        sb2.append('T');
        sb2.append('A');
        sb2.append('R');

        System.out.println(sb2);

        StringBuilder sb3=new StringBuilder();
        sb3.append("LOVE");
        System.out.println(sb3.toString());
        sb1.append(sb3);
        System.out.println(sb1);
            String s=" MUSLEH";

            sb1.append(s);
        System.out.println(sb1);



    }
}
