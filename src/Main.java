import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Введите первое число:");
       int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
       int number2 = new Scanner(System.in).nextInt();
       //сложение
       int sum = number+number2;
       //вычитание
        int vichet = number-number2;
        //умножение (произведение)
        int result = number * number2;
        //частное чисел (quotient)
        double quotient = (double) number / number2;
       System.out.println("Сумма:" + sum);
       System.out.println("Разность:" + vichet);
       System.out.println("Произведение:" + result);
       System.out.println("Частное:" + quotient);
    }
}



