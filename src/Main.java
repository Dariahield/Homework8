import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] arr = new int[]{1, 2, 3};
        double[] arr1 = {1.57, 7.654, 9.986};
        int[] arr2 = {11, 12, 13, 16};

    }

    public static void task2() {
        int[] weights = {1, 2, 3};
        for (int i = 0; i < weights.length - 1; i++) {
            System.out.print(weights[i] + ", ");
        }
        System.out.println(weights[weights.length - 1]);

        double[] color = {1.57, 7.654, 9.986};
        for (int j = 0; j < color.length - 1; j++) {
            System.out.print(color[j] + ", ");
        }
        System.out.println(color[color.length - 1]);

        int[] arr1 = {10, 12, 13, 16};
        for (int h = 0; h < arr1.length - 1; h++) {
            System.out.print(arr1[h] + ", ");
        }
        System.out.print(arr1[arr1.length - 1]);
    }

    public static void task3() {
        System.out.println();
        int[] weights = {1, 2, 3};
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }

        double[] color = {1.57, 7.654, 9.986};
        for (int j = color.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(color[j]);
                break;
            }
            System.out.print(color[j] + ", ");

        }
        System.out.println();
        int[] arr1 = {10, 12, 13, 16};
        for (int h = arr1.length - 1; h >= 0; h--) {
            if (h == 0) {
                System.out.print(arr1[h]);
                break;
            }
            System.out.print(arr1[h] + ", ");
        }

    }

    public static void task4() {
        System.out.println();
        int[] weights = new int[3];
        for (int i = 0; i < weights.length; i++){
            weights[i] = i + 1;}
            System.out.print(Arrays.toString(weights));

        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 == 1) {
                weights [i] = weights [i] + 1;
            }
        }
        System.out.print(Arrays.toString(weights));

    }
    }
