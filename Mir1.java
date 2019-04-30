package mir1;

import java.io.IOException;
import static java.lang.Math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.lang.Math.*;

public class Mir1 {

    /*
    Задача №5
    */
    
    
    public static void main(String[] args) {

        int n = 0;
        int[] Arr;    //Исходный массив
        int[] inArr;  //Массив для искомой последовательности
        int i = 0, k_max = -30000, k = 0, index = 0;
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
            el = Math.random() * 2;
            Arr[i] = 1 + (int) el;
            System.out.print(+Arr[i] + " "); //Генерируем и сразу выводим исходный массив
        }
        System.out.println("");

        for (i = 1; i < n; i++) {
            if (Arr[i] % Arr[i - 1] == 0) {
                k++;                                                    //Считаем длину последовательности
                //System.out.println("Entering.. " + i);
            } else if ((k >= 1) && (k > k_max)) {
                k_max = k + 1;                                          //Запоминаем длину послед. если она больше длины предыдущей
                index = i - k - 1;
                //System.out.println("New data.. " + index + " " + k_max);
                k = 0;
            } else if ((Arr[i] % Arr[i - 1] != 0) && (k <= k_max || k < 1)) {   //Обнуляем длину последовательности, если она все таки не больше длины предыдущей
                k = 0;
            }
        }

        if ((k > 1) && (k_max <= 0)) {          //Проверяем, вдруг весь массив был нужной нам последовательностью
            k_max = k;
            index = 0;
        }

        System.out.println(index + " " + k_max);

        if (k_max >= 1) {                   //Если в массиве нашлась наша послед.
            inArr = new int[k_max];
            System.out.print("Output: ");
            for (i = 0; i < k_max; i++) {   //Переписываем ее в отдельный массив и выводим
                inArr[i] = Arr[index];
                index++;
                System.out.print(inArr[i] + " ");
            }
        } else {
            System.out.println("Not found :( ");
        }

    }

}
