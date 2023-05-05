/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi;

/**
 *
 * @author Pustik_Teknokrat
 */
public class MainAgregasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Ciptakan objek jurusan
        Jurusan j = new Jurusan("TI", "Teknik Informatika");
        
        //ciptakan objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("12312761", "Abdul");
        Mahasiswa m2 = new Mahasiswa("12312771", "Markum");
        Mahasiswa m3 = new Mahasiswa("12312212", "Kumkum");
        Mahasiswa m4 = new Mahasiswa("12312178", "Paijo");
        
        //tambahkan objek mahasiswa ke objek jurusan
        j.tambahMahasiswa(m1);
        j.tambahMahasiswa(m2);
        j.tambahMahasiswa(m3);
        j.tambahMahasiswa(m4);
        
        //Cetak informasi daftar mahasiswa
        j.cetakInfo();
    }
    
}
