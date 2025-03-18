package com.syifa.tugas6;

public class Tugas6 {

   public static void main(String[] args) {
    
    //persegi panjang 1 (konstruktor tanpa parameter)
    persegiPanjang objPp1 = new persegiPanjang();
    System.out.println("Panjang: " + objPp1.panjang + " & Lebar :" +objPp1.lebar);
    System.out.println("Luas: " + objPp1.getLuas());
    System.out.println("Keliling: " + objPp1.getKeliling());
    System.out.println();
    
    //persegi panjang 2 (konstruktor dengan parameter)
    persegiPanjang objPp2 = new persegiPanjang(30, 40);
    System.out.println("Panjang: " + objPp2.panjang + " & Lebar :" +objPp2.lebar);
    System.out.println("Luas: " + objPp2.getLuas());
    System.out.println("Keliling: " + objPp2.getKeliling());
    System.out.println();
    
    //persegi panjang 3 (mengubah panjang & lebar)
    persegiPanjang objPp3 = new persegiPanjang();
    objPp3.setPanjang(25);
    objPp3.setLebar(35);
    System.out.println("Panjang: " + objPp3.panjang + " & Lebar :" +objPp3.lebar);
    System.out.println("Luas: " + objPp3.getLuas());
    System.out.println("Keliling: " + objPp3.getKeliling());
    
    }
}