public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(" i = " + i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(" i = " + i + " j = " + j);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
            }
        }

        int theLCV = 0;
        int i = 0;
        int j = 0;

        while (theLCV < 8) {
            System.out.println("theLCV is: " + theLCV);
            theLCV++;
        }


        i = 0;
        while (i < 8) {
            j = 0;
            while (j < 8) {
                System.out.println(i + "," + j);
                j++;
            }
            i++;
        }


    }

}
