package org.example;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseHW {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int a = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
