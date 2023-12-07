import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        int[ ] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ +=arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n",summ);
    }

    public static void task2(){
        int[ ] arr = generateRandomArray();
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n",min,max);
    }

    public static void task3(){
        int[ ] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ +=arr[i];
        }
        double average = (double) summ / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n",average);
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

}