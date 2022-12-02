import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Дамашняя работа: Массивы 2");
        int [] arr=new int[5];
        fillRandom(arr);
        System.out.println(Arrays.toString(arr));
        /*### Задание 1
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
         */
        int sumExpenses=0;
        for (int i = 0; i < arr.length; i++) {
            sumExpenses+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+sumExpenses+" рублей.");
    }

    private static void fillRandom(int[] arr) { //заполнение массива случайными числами
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(100)+100;  //диапазон значений от 100_000 до 200_000
        }
    }
}
