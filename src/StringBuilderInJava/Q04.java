package StringBuilderInJava;

public class Q04 {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();

        sb1.append("Mohammad ");
        Integer in=new Integer(1427);
        sb1.append(in);
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder();
        sb2.append("My birth Date : ");
        Long ln=new Long(1992);
        sb2.append(ln);
        System.out.println(sb2);

        StringBuilder sb3=new StringBuilder();
        sb3.append("We  love you  ");
        String s="XHafasa";
        sb3.append(s,1,7);
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);


        StringBuilder sb6=new StringBuilder();
            sb6.append("Slamam");

        sb6.substring(4);
        System.out.println(sb6);

        StringBuilder str = new StringBuilder("GeeksForGeeks");
        System.out.println("SubSequence = " + str.substring(6,12));

        int len=sb6.length();
        System.out.println(len);











    }
}
