package com.withWahib;
import java.util.Scanner;
import java.lang.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("   \n - الجمع  (+) \n - الطرح (-) \n - الضرب (*) \n - القسمة (/) \n - الجذر التربيعي (#) \n  - حساب الاس (^) \n");
        for( ; ; ) {
            System.out.print( "أدخل رمز العملية الحسابية : ");
            char process = v.next().charAt(0);
            switch (process) {
                case '+':
                    System.out.print("أدخل الرقم الاول : ");
                    double num1 = v.nextDouble();
                    System.out.print("أدخل الرقم الثاني : ");
                    double num2 = v.nextDouble();
                    System.out.printf("%.2f + %.2f = %.2f \n \n", num1, num2, num1 + num2);
                    break;
                case '-':
                    System.out.print("أدخل الرقم الاول : ");
                    num1 = v.nextDouble();
                    System.out.print("أدخل الرقم الثاني : ");
                    num2 = v.nextDouble();
                    System.out.printf("%.2f- %.2f= %.2f \n \n", num1, num2, num1 - num2);
                    break;
                case '*':
                    System.out.print("أدخل الرقم الاول : ");
                    num1 = v.nextDouble();
                    System.out.print("أدخل الرقم الثاني : ");
                    num2 = v.nextDouble();
                    System.out.printf("%.2f * %.2f = %.2f\n\n", num1, num2, num1 * num2);
                    break;
                case '/':
                    System.out.print("أدخل الرقم الاول : ");
                    num1 = v.nextDouble();
                    System.out.print("أدخل الرقم الثاني : ");
                    num2 = v.nextDouble();
                    System.out.printf("%.2f / %.2f= %.2f\n\n", num1, num2, num1 / num2);
                    break;
                case '#':
                    System.out.print("أدخل الرقم لحساب الجذر التربيعي  : ");
                    num1 = v.nextDouble();
                    System.out.printf("%.2f = %.2f\n\n", num1, Math.sqrt(num1));
                    break;
                case '^':
                    System.out.print("أدخل الاساس  : ");
                    num1 = v.nextDouble();
                    System.out.print("أدخل الرقم الاس : ");
                    num2 = v.nextDouble();
                    System.out.printf("%.2f ^ %.2f= %.2f\n\n", num1, num2, Math.pow(num1,num2));
                    break;

                default:
                    System.out.println(" لقد أدخلت رمزا خارج العمليات الحسابية الموضحة في الأعلا ");
            }
        }

    }
}