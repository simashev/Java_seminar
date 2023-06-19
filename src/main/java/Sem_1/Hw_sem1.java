// задание
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
import java.util.Arrays;
import java.util.Random;

public class Hw_sem1 {
    public static void main(String[] args) {
       int i= 0;
//        int[] m1;
        System.out.println(i = random(0, 100));
        int n = MaxBit(i);
        System.out.println(n);
        int [] m1 = maxArr(i, Short.MAX_VALUE, n);
        System.out.println("Массив m1 =" +Arrays.toString(m1));
        System.out.println();
        int[] m2 = minArr(Short.MIN_VALUE, i, n);
        System.out.println("Массив m2 =" +Arrays.toString(m2));
    }

     public static int random(int min, int max) {
        return new Random().nextInt(min, max + 1);
        }
     public static int MaxBit(int number) {
        return Integer.toBinaryString(number).length();
        }


    static int[] maxArr(int lower, int upper, int divider) {
        int array = 0;
        for (int i = lower; i <= upper; i++) {
            if ((i % divider) == 0) array++;
        }
        int[] m1 = new int[array];
        for (int i = lower, j = 0; i <= upper; i++) {
            if ((i % divider) == 0) {
                m1[j] = i;
                j++;
            }
        }
        return m1;
    }

    static int[] minArr(int lower, int upper, int divider) {
        int Size = 0;
        for (int i = lower; i <= upper; i++) {
            if ((i % divider) != 0) Size++;
        }
        int[] m2 = new int[Size];
        for (int i = lower, j = 0; i <= upper; i++) {
            if ((i % divider) != 0) {
                m2[j] = i;
                j++;
            }
        }
        return m2;
    }
}

