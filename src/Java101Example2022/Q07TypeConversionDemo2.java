package Java101Example2022;

public class Q07TypeConversionDemo2 {
    public static void main(String[] args) {

        int i,j;
        double d1 = 0.5, d2 = 0.5, d3,d4;
        i = (int)d1+(int)8.735f;
        j = (int)(d1+d2);
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        d3 = (double)i-(double)j;
        d4 = (double)(i-j);
        System.out.println("d3= "+d3);
        System.out.println("d4= "+d4);
    }
}
