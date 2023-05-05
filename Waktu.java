/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asosiasi;

/**
 *
 * @author Pustik_Teknokrat
 */
public class Waktu {
    private int Hour, Minute, Second;
    
    public Waktu(int H, int M, int S){
        this.Hour = H;
        this.Minute = M;
        this.Second = S;
    }
    public long Convert2Sec(){
        long Hasil;
        //Hitung hasil conversi jam ke detik
        Hasil = 3600*this.Hour + 60*this.Minute + this.Second;
        return (Hasil);
    }
}
