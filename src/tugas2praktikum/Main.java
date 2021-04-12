/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2praktikum;

import java.util.Scanner;

/**
 *
 * @author mumta
 */
public class Main {
    public static void main(String[] args){
        double p,l,t,r, tinggi;
        int pilih;
        
        Scanner input = new Scanner (System.in);
        do {
        System.out.println("Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Keluar");
        System.out.print("Pilih : "); pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.print("Masukkan panjang : "); p = input.nextDouble();
            System.out.print("Masukkan lebar : "); l = input.nextDouble();
            System.out.print("Masukkan tinggi : "); t = input.nextDouble();
            
            Balok balok = new Balok(p,l,t);

            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Luas persegi panjang : " + balok.luas());
            
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());
            System.out.println("Volume Balok : " + balok.volume());

            
        }
        else if(pilih == 2){
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            System.out.print("Masukkan tinggi : "); tinggi = input.nextDouble();
            
            Kerucut kerucut = new Kerucut(r, tinggi);

            System.out.println("Keliling lingkaran : " + kerucut.keliling());            
            System.out.println("Luas lingkaran : " + kerucut.luas());
            
            System.out.println("Luas permukaan Kerucut : " + kerucut.luasPermukaan());
            System.out.println("Volume Kerucut : " + kerucut.volume());

        }
        
        }while(pilih<3);
    }

}
