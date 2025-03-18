package com.syifa.tugas6;

public class persegiPanjang {
    int panjang;
    int lebar;
    
    //konstruktor tanpa parameter
    persegiPanjang(){
        panjang = 1;
        lebar = 1;
    }
    
    //konstruktor dengan parameter
    persegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    //hitung luas
    int getLuas(){
        return panjang * lebar;
    }
    
    //hitung keliling
    int getKeliling(){
        return 2 * (panjang+lebar);
    }
    
    //mengubah nilai panjang
    void setPanjang(int panjangNew){
      panjang = panjangNew;
    }
    
    //mengubah nilai lebar
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    
}

