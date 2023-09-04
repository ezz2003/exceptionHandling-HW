package lesson2;

import java.util.Scanner;

public class ex1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
//    приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static float inputFloat(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a FLOAT number: ");
        String num = in.nextLine();
        float f = 0;
        try {
            f = Float.parseFloat(num);
            return f;
        } catch (NumberFormatException e) {
            System.out.println("incorrect input -> "+e.getMessage());
            System.out.println("try again");
            inputFloat();
        } finally {
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(inputFloat());
    }
}