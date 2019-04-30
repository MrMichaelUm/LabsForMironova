
package mir23;

import java.io.IOException;
import static java.lang.Math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.lang.Math.*;

public class Mir23 {

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
        
        int n = 5;
        int[] Arr = new int[n];    //Исходный массив
        int i = 0, flag = 0, index = 0, answer = 0;
        double el = 0;

        

        for (i = 0; i < n; i++) {
            el = Math.random() * 13;
            Arr[i] = 1 + (int) el;
            System.out.print(+Arr[i] + " "); //Генерируем и сразу выводим исходный массив
        }
        System.out.println("");
        bubbleSort(Arr, n);
        for (i = 0; i<n; i++)
            System.out.print(Arr[i]+" ");
        System.out.println("");
        System.out.println("");
        
        if ((Arr[0] == Arr[1])&&(Arr[0] == Arr[2])&&(Arr[0]==Arr[3])&&(Arr[0] == Arr[4])) 
            System.out.println("Impossible");
        else if (((Arr[0] == Arr[1])&&(Arr[0]==Arr[2])&&(Arr[0]==Arr[3]))||((Arr[1] == Arr[2])&&(Arr[1]==Arr[3])&&(Arr[1]==Arr[4])))
            System.out.println("Four of a Kind");
        else if (((Arr[0] == Arr[1])&&(Arr[0]==Arr[2])&&(Arr[3]==Arr[4]))||((Arr[0] == Arr[1])&&(Arr[2]==Arr[3])&&(Arr[2]==Arr[4])))
            System.out.println("Full House");
        else if((Arr[0] == (Arr[1]+1))&&(Arr[0] == (Arr[2]+2))&&(Arr[0] == (Arr[3]+3))&&(Arr[0] == (Arr[4]+4)))
            System.out.println("Straight");
        else if(((Arr[0] == Arr[1])&&(Arr[0]==Arr[2]))||((Arr[1] == Arr[2])&&(Arr[1]==Arr[3]))||((Arr[2] == Arr[3])&&(Arr[2]==Arr[4])))
            System.out.println("Three of a Kind");
        else if(((Arr[0]==Arr[1])&&(Arr[2]==Arr[3]))||((Arr[1]==Arr[2])&&(Arr[3]==Arr[4]))||((Arr[0]==Arr[1])&&(Arr[3]==Arr[4])))
            System.out.println("Two Pairs");
        else if((Arr[0]==Arr[1])||(Arr[1]==Arr[2])||(Arr[2]==Arr[3])||(Arr[3]==Arr[4]))
            System.out.println("One Pair");
        else System.out.println("Nothing");
    }
    
}
