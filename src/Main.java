import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        int[] arr1 = new int[] {1,2,3};
        double[] arr2 = new double[] {1.57, 7.654, 9.986};
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }
    }
    public static void task2(){
        int[] arr1 = new int[] {1,2,3};
        double[] arr2 = new double[] {1.57, 7.654, 9.986};
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if(i!=arr1.length-1)
                System.out.print(",");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if(i!=arr2.length-1)
                System.out.print(",");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if(i!=arr3.length-1)
                System.out.print(",");
        }

    }
    public static void task3(){
        int[] arr1 = new int[] {1,2,3};
        double[] arr2 = new double[] {1.57, 7.654, 9.986};
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }
        System.out.println();
        for (int i = arr1.length-1; i >=0; i--) {
            System.out.print(arr1[i]);
            if(i!=0)
                System.out.print(",");
        }
        System.out.println();
        for (int i = arr2.length-1; i >=0; i--) {
            System.out.print(arr2[i]);
            if(i!=0)
                System.out.print(",");
        }
        System.out.println();
        for (int i = arr3.length-1; i >=0; i--) {
            System.out.print(arr3[i]);
            if(i!=0)
                System.out.print(",");
        }

    }

    public static void task4(){
        int[] arr1 = new int[] {1,2,3};
        for (int i = 0; i < arr1.length; i++) {
            if(i%2==0)
                arr1[i]++;
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if(i!=arr1.length-1)
                System.out.print(",");
        }
    }
}