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
        int biayaSKS1, biayaSKS2, biayaSKS3, biayaTetap1, biayaTetap2, biayaTetap3;
        int bayar1, bayar2, bayar3, totalSKS = 20;
        
        String jurusan1 = "mg";
        String jurusan2 = "if";
        String jurusan3 = "ti";
        String nim1 = "4214231";
        String nim2 = "4214252";
        String nim3 = "4214286";
        String nama1 = "Vincent";
        String nama2 = "Benedic";
        String nama3 = "Manaluu";
        if (jurusan1.equals("mg")) {
            biayaSKS1 = 200000;
        }else if(jurusan1.equals("ti")){
            biayaSKS1 = 225000;
        }else{
            biayaSKS1 = 275000;
        }
        if (jurusan2.equals("mg")) {
            biayaSKS2 = 200000;
        }else if(jurusan2.equals("ti")){
            biayaSKS2 = 225000;
        }else{
            biayaSKS2 = 275000;
        }
        if (jurusan3.equals("mg")) {
            biayaSKS3 = 200000;
        }else if(jurusan3.equals("ti")){
            biayaSKS3 = 225000;
        }else{
            biayaSKS3 = 275000;
        }
        bayar1 = biayaSKS1 * totalSKS;
        bayar2 = biayaSKS2 * totalSKS;
        bayar3 = biayaSKS3 * totalSKS;
        
        int tahunMasuk1 = 2014;
        int tahunMasuk2 = 2018;
        int tahunMasuk3 = 2022;
        if(tahunMasuk1 > 2021){
            bayar1 += 3000000;
            biayaTetap1 = 3000000;
        }else if(tahunMasuk1 > 2018){
            bayar1 +=2000000;
            biayaTetap1 = 2000000;
        }else if(tahunMasuk1 > 2013){
            bayar1 +=1500000;
            biayaTetap1 = 1500000;
        }else{
            bayar1 +=1000000;
            biayaTetap1 = 1000000;
        }
        if(tahunMasuk2 > 2021){
            bayar2 += 3000000;
            biayaTetap2 = 3000000;
        }else if(tahunMasuk2 > 2018){
            bayar2 +=2000000;
            biayaTetap2 = 2000000;
        }else if(tahunMasuk2 > 2013){
            bayar2 +=1500000;
            biayaTetap2 = 1500000;
        }else{
            bayar2 +=1000000;
            biayaTetap2 = 1000000;
        }
        if(tahunMasuk3 > 2021){
            bayar3 += 3000000;
            biayaTetap3 = 3000000;
        }else if(tahunMasuk3 > 2018){
            bayar3 +=2000000;
            biayaTetap3 = 2000000;
        }else if(tahunMasuk3 > 2013){
            bayar3 +=1500000;
            biayaTetap3 = 1500000;
        }else{
            bayar3 +=1000000;
            biayaTetap3 = 1000000;
        }
        System.out.print("\n------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("No.\t\tNIM\t\tNama\t\tJurusan\t\tBiayaTetap\tBiayaSKS\tTotalSKS\tBayar\n");
        System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("1"+"\t\t"+nim1+"\t\t"+nama1+"\t\t"+jurusan1+"\t\t"+biayaTetap1+"\t\t"+biayaSKS1+"\t\t"+totalSKS+"\t\t"+bayar1+"\n");
        System.out.print("2"+"\t\t"+nim2+"\t\t"+nama2+"\t\t"+jurusan2+"\t\t"+biayaTetap2+"\t\t"+biayaSKS2+"\t\t"+totalSKS+"\t\t"+bayar2+"\n");
        System.out.print("3"+"\t\t"+nim3+"\t\t"+nama3+"\t\t"+jurusan3+"\t\t"+biayaTetap3+"\t\t"+biayaSKS3+"\t\t"+totalSKS+"\t\t"+bayar3+"\n");
        System.out.print("------------------------------------------------------------------------------------------------------------------------\n");
    }
}
