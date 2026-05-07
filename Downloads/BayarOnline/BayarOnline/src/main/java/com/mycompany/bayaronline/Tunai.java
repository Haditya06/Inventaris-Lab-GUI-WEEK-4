/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bayaronline;

/**
 *
 * @author dit
 */
public class Tunai extends Pembayaran {
    public Tunai(double jumlah){
        super(jumlah);
    }
    
    public void verifikasiPembayaran(){
        System.out.println("Verifikasi Pembayaran Tunai Berhasil");
    }
}
