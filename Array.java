import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myInts = {1, 2, 3};
        for (int i = 0; i < 3; i++){
            System.out.println("myInts[" + i + "]");
        }

        int[] myNewInts = new int[5];
        System.out.println("Please enter five integers...");
        for (int i = 0; i < 5; i++){
            myNewInts[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Your " + i + "st integer is: " + myNewInts[i]);
        }

    }
}
