package lesson2;

import java.util.Scanner;

public class ex4 {
//    Разработайте программу, которая выбросит Exception,
//    когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение,
//    что пустые строки вводить нельзя.
    public static String noEmptyString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a STRING: ");
        String str = in.nextLine();
        if (str.isEmpty()){
            throw new RuntimeException("Нельзя вводить пустую строку");
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            System.out.println(noEmptyString());
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(noEmptyString());
        }
    }
}
