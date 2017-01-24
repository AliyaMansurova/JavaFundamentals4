package Task4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * created by Aliya Mansurova
 */
public class Array4 {
    public static void main(String[] args) {
        int length;
        int max=0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        length = scanner.nextInt();
        int[] a = new int[length];
        if (length % 2 == 0) {
            System.out.println("Введите элементы массива");
            for (int i = 0; i < length; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < length/2; i++) {
                if (a[i]+a[length-1-i]>max)
                    max=a[i]+a[length-1-i];
            }

            System.out.println("max="+max);



        } else {
            System.out.println("Количество элементов в массиве должно быть четным.Попробуйте снова");
        }
    }

}
