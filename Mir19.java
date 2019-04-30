package mir19;

import java.io.IOException;
import static java.lang.Math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.lang.Math.*;

public class Mir19 {

    public static void main(String[] args) {

        int n = 6;
        int[] Arr = new int[n];    //Исходный массив
        int i = 0, k = 0;
        double el = 0;

        for (i = 0; i < n; i++) {
            el = Math.random() * 10;
            Arr[i] = 1 + (int) el;
            //System.out.print(+Arr[i] + " "); //Генерируем и сразу выводим исходный массив
        }

        while ((Arr[0] + Arr[1] + Arr[2]) != (Arr[3] + Arr[4] + Arr[5])) {

            for (i = 0; i < n; i++) {
                el = Math.random() * 10;
                Arr[i] = 1 + (int) el;
                //System.out.print(+Arr[i] + " "); //Генерируем и сразу выводим исходный массив
            }
            //System.out.println("");
            k++;
        }
        for (i = 0; i < n; i++) {
            System.out.print(+Arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Lucky one! " + k);

    }

}
