import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Дамашняя работа: Массивы 2");
        int[] arr = new int[15];
        fillRandom(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Задание 1");
        /* Задание 1
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
         */
        int sumExpenses=0;
        for (int i = 0; i < arr.length; i++) {
            sumExpenses += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей.\n");
        /* Задание 2
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        System.out.println("Минимальная сумма трат за день составила " + min(arr) + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max(arr) + " рублей.");
        /*### Задание 3
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, адробным числом).
        */
        float averageMonthlyExpenditure = sumExpenses/30;
        System.out.println("Средняя сумма трат за месяц составила "+averageMonthlyExpenditure+" рублей");
        System.out.printf("%.2f",averageMonthlyExpenditure);
    }
    public static int max(int[] arr){
        int x=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x<arr[i]) x=arr[i];
        }return x;
    }
    public static int min(int[] arr){
        int x=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x>arr[i]) x=arr[i];
        }return x;
    }
    private static void fillRandom(int[] arr) { //заполнение массива случайными числами
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(100)+100;  //диапазон значений от 100_000 до 200_000
        }
    }
}
