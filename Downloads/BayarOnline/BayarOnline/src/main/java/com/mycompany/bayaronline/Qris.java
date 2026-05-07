/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bayaronline;

/**
 *
 * @author dit
 */
class Qris  extends Pembayaran implements BayarOnline{
    public Qris(double jumlah){
        super(jumlah);
    }
    
    public void verifikasiPembayaran(){
        System.out.println("Verfikasi Pembayaran QRIS Berhasil");
    }
}
