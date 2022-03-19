package StringBuilderInJava;

public class Q03 {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        sb1.append("Mohammad ");
        System.out.println(sb1);
        int id=1427 ;

        sb1.append("FROTAN ").append(id);
        System.out.println(sb1);
        char arr[]={'a','a','d'};
        sb1.append(arr);
        System.out.println(sb1);
        Double sb11 = new Double(36.47);
        sb1.append(sb11);
        System.out.println(sb1);
        Float sbf=new Float(3.5);
        sb1.append(sbf);
        System.out.println(sb1);




    }
}
