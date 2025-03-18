package com.syifa.tugas6;

public class Tugas6 {

    
public static class PersegiPanjang { 
    int panjang, lebar;
      
public PersegiPanjang() {
    panjang = 0;
    lebar = 0;
    }

public PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

//Method
public int getLuas() {
    return panjang * lebar;
    }
      
public int getKeliling() {
            return 2 * (panjang + lebar);
    }

public void setPanjang(int panjangBaru) {
      panjang = panjangBaru;
    }

 public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
       }
    }
 
   public static void main(String[] args) {
    
    // Membuat objek Persegi
    PersegiPanjang perpan1 = new PersegiPanjang(1, 1);
    PersegiPanjang perpan2 = new PersegiPanjang(30, 40);
    PersegiPanjang perpan3 = new PersegiPanjang(25, 35);
        
    // Menampilkan panjang, lebar, luas, dan keliling untuk masing-masing objek
    System.out.println("Persegi Panjang 1: ");
    System.out.println("Panjang: " + perpan1.panjang);
    System.out.println("Lebar: " + perpan1.lebar);
    System.out.println("Luas: " + perpan1.getLuas());
    System.out.println("Keliling: " + perpan1.getKeliling());
    System.out.println();

    System.out.println("Persegi Panjang 2: ");
    System.out.println("Panjang: " + perpan2.panjang);
    System.out.println("Lebar: " + perpan2.lebar);
    System.out.println("Luas: " + perpan2.getLuas());
    System.out.println("Keliling: " + perpan2.getKeliling());
    System.out.println();

    System.out.println("Persegi Panjang 3: ");
    System.out.println("Panjang: " + perpan3.panjang);
    System.out.println("Lebar: " + perpan3.lebar);
    System.out.println("Luas: " + perpan3.getLuas());
    System.out.println("Keliling: " + perpan3.getKeliling());
    }
}