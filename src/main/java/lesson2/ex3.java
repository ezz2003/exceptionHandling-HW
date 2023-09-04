package lesson2;

public class ex3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");    // обощённо, и не понятно,что не так
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");  // если код выше будет именно таким
                                                                            //
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) /*throws FileNotFoundException*/ { // файл?
        System.out.println(a + b);
    }

}
