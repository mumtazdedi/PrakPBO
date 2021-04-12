/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2praktikum;

/**
 *
 * @author mumta
 */
public class Kerucut extends Lingkaran implements MenghitungRuang {
    
    double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.setJariJari(jariJari);
        this.tinggi = tinggi;
    }
    

    @Override
    public double volume() {
        return volume(this.luas(),this.tinggi);
    }
    
    public double volume(double luas, double tinggi){
        return luas*tinggi/3;
    }

    @Override
    public double luasPermukaan() {
        return luasPermukaan(this.getJariJari(), this.tinggi);
    }
    
    public double luasPermukaan(double jariJari, double tinggi){
        double garisPelukis;
        
        garisPelukis = Math.sqrt((jariJari*jariJari)+(tinggi*tinggi));
        
        return phi*jariJari*(jariJari + garisPelukis);
    }
    
}
