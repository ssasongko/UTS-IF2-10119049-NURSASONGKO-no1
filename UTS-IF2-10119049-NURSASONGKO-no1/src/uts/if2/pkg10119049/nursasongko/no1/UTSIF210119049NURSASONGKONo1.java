package uts.if2.pkg10119049.nursasongko.no1;

import java.util.Scanner;

/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program menghitung umur
**/

public class UTSIF210119049NURSASONGKONo1 {

    public static void main(String[] args) {
        int tahunNow,tahunLahir;
        Scanner scan = new Scanner(System.in); // object scanner
        tahunNow = 2020; // tidak auto
        Age age = new Age(tahunNow);
        
        System.out.printf("Masukkan Tahun Lahir Anda : ");
        
        age.setYearBirth(scan.nextInt());
        
        
        System.out.printf("=============================\n");
        System.out.printf("Tahun lahir anda : %d\n",age.getYearBirth());
        System.out.printf("Haari ini tahun : %d\n",age.getYearNow());
        System.out.printf("Umur kamu sampai hari ini adalah : %d \n", age.hitungUmur());
        System.out.printf("Tandanya Kamu %s\n", age.tandanyaKamu(age.hitungUmur()));

    }
    
}
