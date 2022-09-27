/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakalgo;

import java.util.Scanner;

/**
 *
 * @author Cent
 */
/*no 2 perhitungan masih ada yang salah*/
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = baris; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("");
        if (baris == 1) {
            System.out.println("1");
        } else if (baris == 2) {
            System.out.println("12");
        } else {
            System.out.println("1");
            System.out.println("12");
            for (int i = 1; i <= baris - 3; i++) {
                System.out.print("1");
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                System.out.print(i + 2);
                System.out.println();
            }
            for (int i = 1; i <= baris; i++) {
                System.out.print(i);
            }
        }
        System.out.println("");
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < (i * 2) - 1; k++) {
                System.out.print(k);
            }
            for (int k = (i * 2) - 1; k >= i; k--) {
                System.out.print(k);
            }
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = 1; i <= baris - 1; i++) {
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            System.out.print("1");
            for (int k = 0; k < (i * 2) - 3; k++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print(i);
            }
            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= baris; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 1; i <= baris; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 2; i <= baris; i++) {
            System.out.print(i);
            for (int j = 0; j < baris - (i + 1); j++) {
                System.out.print(" ");
            }
            if (i != baris) {
                System.out.print(baris);
            }
            System.out.println();
        }
    }
}
