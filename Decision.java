public class Decision {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int largest = 0;

        if (num1 > num2){
            if (num1 > num3) {
                largest = num1;
            }
            else {
                largest = num3;
            }
        }
        else {
            if (num2 > num3){
                largest = num2;
            }
            else {
                largest = num3;
            }
        }
        System.out.println("\n The largest of three numbers is: " + largest);
    }
}
