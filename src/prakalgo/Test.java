/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakalgo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cent
 */
/*no 2 perhitungan masih ada yang salah*/
public class Test {
    public static void main(String[] args) {
        System.out.printf("| %s | %s | %s | %s | %s | %s | %s |%n", "NO", "NIM", "JURUSAN", "BiayaTetap", "BiayaSKS", "TotalSKS", "Bayar");
        for (int i = 1; i <= 3; i++) {
            int SKS = 20, totalSKS = 0, biayaSKS = 0, biayaTetap = 0;
            String nim = JOptionPane.showInputDialog(null, "masukan nim", "Input", JOptionPane.QUESTION_MESSAGE);
            String jurusan = JOptionPane.showInputDialog(null, "masukan jurusan", "Input", JOptionPane.QUESTION_MESSAGE);
            int tahunMasuk = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Tahun Masuk", "Input", JOptionPane.QUESTION_MESSAGE));

            if (jurusan.equalsIgnoreCase("mg")) {
                biayaSKS = 200000;
                totalSKS = biayaSKS * SKS;
            } else if (jurusan.equalsIgnoreCase("ti")) {
                biayaSKS = 225000;
                totalSKS = biayaSKS * SKS;
            } else if (jurusan.equalsIgnoreCase("if") || jurusan.equalsIgnoreCase("si")) {
                biayaSKS = 275000;
                totalSKS = biayaSKS * SKS;
            }

            if (tahunMasuk > 2021) {
                biayaTetap = 3000000;
            } else if (tahunMasuk >= 2019) {
                biayaTetap = 2000000;
            } else if (tahunMasuk >= 2014) {
                biayaTetap = 1500000;
            } else {
                biayaTetap = 1000000;
            }
            System.out.printf("| %d | %s | %s | %d | %d | %d | %d |", i, nim, jurusan, biayaTetap, biayaSKS, totalSKS, biayaTetap + totalSKS);
            System.out.println("");

        }
        System.out.printf("--------------------------------------------------------------%n");
    }
}
