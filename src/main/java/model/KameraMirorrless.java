/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dovs
 */
public class KameraMirorrless extends Kamera {
    private boolean adaFitur4K;
    
    public KameraMirorrless(int idKamera, String namaKamera, double hargaSewa, boolean adaFitur4K){
        super(idKamera, namaKamera, hargaSewa);
        this.adaFitur4K = adaFitur4K;
        }
    public boolean isAdaFitur4K() {
        return adaFitur4K;
    }

    public void setAdaFitur4K(boolean adaFitur4K) {
        this.adaFitur4K = adaFitur4K;
    }
    @Override
    public String getJenisKamera() {
        return "Mirrorless";
    }

    @Override
    public String getSpesifikasi() {
        return "Fitur 4K: " + (adaFitur4K ? "Ya" : "Tidak");
    }
}
