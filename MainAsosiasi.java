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
public class MainAsosiasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Ciptakan Objek
        Waktu JamMulai = new Waktu(15,26,34);
        Waktu JamSelesai = new Waktu(17,8,45);
        PenghitungPulsa PC = new PenghitungPulsa(JamMulai, JamSelesai);
        
        //Cetak Informasi Jumlah Pulsa
        System.out.println("Jumlah Pulsa : "+ PC.GetJmlPulsa());
    }
    
}
