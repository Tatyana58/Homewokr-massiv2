import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Дамашняя работа: Массивы 2");
        int [] arr=new int[5];
        fillRandom(arr,0);
        System.out.println(Arrays.toString(arr));
        fillRandom(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void fillRandom(int[] arr, int n) { //заполнение массива случайными числами
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(100)+100;  //диапазон значений от 100_000 до 200_000
        }
    }
}
