
package mir9;

import java.io.IOException;
import static java.lang.Math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.lang.Math.*;

public class Mir9 {


    public static void main(String[] args) {
        
        int n = 0;    //Количество елементов в исходном массиве
        int[] Arr;    //Исходный массив
        int i = 0, xn = 0;
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
        System.out.print(" Input: ");
        for (i = 0; i < n; i++) {
            el = Math.random() * 100;
            Arr[i] = 1 + (int) el;
            System.out.print(Arr[i] + " "); //Генерируем и сразу выводим исходный массив
        }
        
        xn = Arr[n-1];
        
        for (i = n-1; i>0; i--) {
            Arr[i] = Arr[i-1];
        }
        Arr[0] = xn;
        System.out.print("\n\n Output: ");
        for (i = 0; i<n; i++)
            System.out.print(Arr[i]+" ");
    }
    
}
