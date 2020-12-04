package uts.if2.pkg10119049.nursasongko.no1;

public class Age {
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String pesan = "";
        
        if(0 <= umur && umur <= 5){
            pesan = red + "LAGI LUCU LUCUNYA";
        }
        else if(5 < umur && umur <= 10){
            pesan = red + "MASIH ANAK-ANAK";
        }
        else if(10 < umur && umur <= 13){
            pesan = red + "MASIH REMADJA";
        }
        else if(13 < umur && umur <= 19){
            pesan = red + "ALAY";
        }
        else if(19 < umur && umur <= 29){
            pesan = red + "LAGI GALAU NYARI JODOH";
        }
        else if(25 < umur && umur <= 35){
            pesan = red + "LAGI SIBUK NYARI UANG";
        }
        else if(35 < umur && umur <= 150){
            pesan = red + "SUDAH TUA";
        }
        else{
            pesan = red + "Tidak Terdeteksi dari Kehidupan";
        }
        return pesan;
    }
}
