package JAVA_LESSON_TOTURAIL.IfElseStatements;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        /*

        Ask user to enter annual salary, if the salary is more than or equal
            to $80.000 output will be “I accept the offer”, if the salary is between
            $60.000 and $80.000 out put will be “I negotiate to increase”,
            otherwise output will be “I do not accept the offer.”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter annual Salary:");
        int salary=scan.nextInt();
        if (salary>=80000){
            System.out.println("I accept the offer");
        }else if(salary<=80000 && salary>=60000){
            System.out.println("I negotiate to increase");
        }else if(salary<60000){
            System.out.println("I do not accept the offer");
        }
    }
}
