/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotarget;

/**
 *
 * @author LENOVO
 */
public class Saldo {
    int Saldo =3500000;
     int Bunga;
     
     public void hitung(){
            
        for(int i =1; i <=12; i++){
            Bunga = Saldo * 8/100;
            Saldo = Bunga + Saldo;
            if(Saldo <= 6500000){
                System.out.println("Saldo Dibulan Ke-"+i+" Rp "+Saldo);
            }
        }
     }
}
