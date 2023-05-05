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
public class PenghitungPulsa {
    private double JmlPulsa;
    
    public PenghitungPulsa(Waktu c1, Waktu c2){
        this.JmlPulsa = (c2.Convert2Sec() - c1.Convert2Sec())/100;
    }
    public double GetJmlPulsa(){
      return (JmlPulsa);  
    }
}
