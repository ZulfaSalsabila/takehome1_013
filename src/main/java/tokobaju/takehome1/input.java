/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobaju.takehome1;

/**
 *
 * @author ROG
 */

public class input {
     public int totalBelanja(int harga, int jumlah){
        int totalbelanja = harga * jumlah;
        return totalbelanja;
    }
    public int diskon(int harga, int jumlah){
        int totalbelanja = harga * jumlah;
        int diskon;
        
        if(totalbelanja <= 10000){
            diskon = totalbelanja - (totalbelanja * 0/100);
        }
        else if((totalbelanja > 10000) && (totalbelanja <= 50000)){
            diskon = totalbelanja - (totalbelanja * 5/100);
        }
        else if((totalbelanja > 50000) && (totalbelanja <= 100000)){
            diskon = totalbelanja - (totalbelanja * 10/100);
        }
        else {
            diskon = totalbelanja - (totalbelanja * 15/100);
        }
        
        return diskon;
    }
    
    public int Getdiskon(int harga, int jumlah){
        int totalbelanja = harga * jumlah;
        int diskon;
        
        if(totalbelanja <= 10000){
            diskon = 0;
        }
        else if((totalbelanja > 10000) && (totalbelanja <= 50000)){
            diskon = 5;
        }
        else if((totalbelanja > 50000) && (totalbelanja <= 100000)){
            diskon = 10;
        }
        else {
            diskon = 15;
        }
        
        return diskon;
    }
    
}
