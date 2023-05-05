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
public class Mahasiswa {
    private String npm, nama;
    public Mahasiswa(String npm, String Nama){
        this.npm = npm;
        this.nama = nama;
    }
    public String getNpm(){
        return npm;
    }
    public String getNama(){
        return nama;
    }
}
