package lesson2;

public class ex2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8};
        try {
            int d = 0;      // int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){                     // если точно так, как в задании,
                                                                        // то до этого исключения не дойдёт
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
