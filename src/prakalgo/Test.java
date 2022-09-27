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

        int nim = 0;
        int sks ;
        int tahunMasuk = 0;
        int biayaSKS = 0;
        int biayaTetap = 0;
        int count = 0;
        String jurusan = null;
        while (count <= 2) {

            System.out.println("Dari Prodi manakah Anda :");
            jurusan = input.next();
            System.out.println("Tahun Masuk Anda :");
            tahunMasuk = input.nextInt();
            System.out.println("Jumlah SKS yang akan Anda Ambil :");
            sks  = input.nextInt();
            System.out.println("Masukkan Nim");
            nim = input.nextInt();

            if (jurusan.equals("manajemen")) {
                biayaSKS = 200000 * sks;
            } else if (jurusan.equals("teknik industri")) {
                biayaSKS = 225000 * sks;
            } else if (jurusan.equals("informatika")) {
                biayaSKS = 275000 * sks;
            } else if (jurusan.equals("sistem informasi")) {
                biayaSKS = 275000 * sks;
            }
            if (tahunMasuk <= 2013) {
                biayaTetap = 1000000;
            } else if (tahunMasuk <= 2018) {
                biayaTetap = 1500000;
            } else if (tahunMasuk < 2021) {
                biayaTetap = 2000000;
            } else if (tahunMasuk > 2021) {
                biayaTetap = 3000000;
            }
            count++;
        }
        System.out.println("------------------------------");
        System.out.println("No   Nim   Jurusan   BiayaTetap   BiayaSKS   TotalSKS   Bayar");
        System.out.println(count + "   " + nim + "   " + jurusan + "   " + biayaTetap + "   " + biayaSKS);
    }
}
