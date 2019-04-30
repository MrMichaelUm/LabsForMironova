package mir17;

import java.io.IOException;
import static java.lang.Math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.lang.Math.*;

public class Mir17 {

    public static void bubbleSort(int[] data, int lenD) {
        int tmp = 0;
        for (int i = 0; i < lenD; i++) {
            for (int j = (lenD - 1); j >= (i + 1); j--) {
                if (data[j] < data[j - 1]) {
                    tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 0;
        int[] Arr;    //Исходный массив
        int i = 0, flag = 0, index = 0, el_min = 30000, el_max = -30000, answer = 0;
        double el = 0;

        try {
            System.out.println("Enter size: ");
            Scanner sN = new Scanner(System.in);
            n = sN.nextInt();
        } catch (Exception ex) {
            System.out.println("Error.. Please, enter correct number.");
            main(args);
        }

        Arr = new int[n];

        for (i = 0; i < n; i++) {
            el = Math.random() * 15;
            Arr[i] = 10 + (int) el;
            System.out.print(+Arr[i] + " "); //Генерируем и сразу выводим исходный массив
        }
        System.out.println("");

        bubbleSort(Arr, n);
        for (i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
        System.out.println("");

        for (i = 0; i < n; i++) {
            if (Arr[i] < el_min) {
                el_min = Arr[i];
            }
            if (Arr[i] > el_max) {
                el_max = Arr[i];
            }
        }

        if (el_min > 10) {
            answer = 10;
            flag = 1;
        }
        if (el_max == 10) {
            answer = 10;
            flag = 1;
        }

        while ((el_min <= el_max) && (flag == 0)) {
            el_min++;
            for (i = 0; i < n; i++) {
                if (Arr[i] == el_min) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                flag = 0;
            } else if (flag == 0) {
                answer = el_min;
                flag = 1;
            }

        }
        System.out.println("Output: " + answer);

    }

}
