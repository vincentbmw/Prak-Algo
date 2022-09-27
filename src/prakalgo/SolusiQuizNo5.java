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
public class SolusiQuizNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int biayaSKS, biayaTetap;
        int bayar, totalSKS = 20;
        
        for (int i = 0; i < 3; i++) {
            bayar = 0;
            System.out.print("Masukkan NIM MHS "+(i+1)+":\t");
            String nim = scan.next();
            System.out.print("Masukkan Nama MHS "+(i+1)+":\t");
            String nama = scan.next();
            System.out.print("Masukkan Jurusan MHS "+(i+1)+":\t");
            String jurusan = scan.next().toLowerCase();
            System.out.print("Masukkan Tahun Masuk MHS "+(i+1)+":\t");
            int tahunMasuk = scan.nextInt();
            if (jurusan.equals("mg")) {
                biayaSKS = 200000;
                bayar+= biayaSKS * totalSKS;
            }else if(jurusan.equals("ti")){
                biayaSKS = 225000;
                bayar+= biayaSKS * totalSKS;
            }else{
                biayaSKS = 275000;
                bayar+= biayaSKS * totalSKS;
            }
            if(tahunMasuk > 2021){
                bayar += 3000000;
                biayaTetap = 3000000;
            }else if(tahunMasuk > 2018){
                bayar+=2000000;
                biayaTetap = 2000000;
            }else if(tahunMasuk > 2013){
                bayar+=1500000;
                biayaTetap = 1500000;
            }else{
                bayar+=1000000;
                biayaTetap = 1000000;
            }
            System.out.print("\n------------------------------------------------------------------------------------------------------------------------\n");
            System.out.print("No.\t\tNIM\t\tNama\t\tJurusan\t\tBiayaTetap\tBiayaSKS\tTotalSKS\tBayar\n");
            System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
            System.out.print((i+1)+"\t\t"+nim+"\t\t"+nama+"\t\t"+jurusan+"\t\t"+biayaTetap+"\t\t"+biayaSKS+"\t\t"+totalSKS+"\t\t"+bayar+"\n");
            System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
        }
    }
}
