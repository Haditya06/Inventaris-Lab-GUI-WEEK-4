/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bayaronline;

/**
 *
 * @author dit
 */
public class Pembayaran {

    double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public void tampilkanJumlahTransaksi() {
        System.out.println("Jumlah Transaksi :" + jumlah);
    }
}
