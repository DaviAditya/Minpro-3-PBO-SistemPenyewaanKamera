/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author Dovs
 */
public abstract class Kamera implements Disewakan {
    public static final int PENGALI_HARIAN = 3;

    private final int idKamera;
    private String namaKamera;
    private double hargaSewa; 

    public Kamera(int idKamera, String namaKamera, double hargaSewa) {
        this.idKamera = idKamera;
        this.namaKamera = namaKamera;
        setHargaSewa(hargaSewa);
    }

    // Getter dan Setter
    public int getIdKamera() {
        return idKamera;
    }

    public String getNamaKamera() {
        return namaKamera;
    }

    public void setNamaKamera(String namaKamera) {
        this.namaKamera = namaKamera;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        if (hargaSewa < 0) {
            throw new IllegalArgumentException("Harga sewa tidak boleh negatif!");
        }
        this.hargaSewa = hargaSewa;
    }

    public abstract String getJenisKamera();
    public abstract String getSpesifikasi();

    public double hitungBiayaSewa(int durasi3Jam) {
        return hitungBiayaSewa(durasi3Jam, TipeSewa.PER_3_JAM);
    }

    @Override
    public double hitungBiayaSewa(int durasi, TipeSewa tipe) {
        if (tipe == TipeSewa.HARIAN) {
            return hargaSewa * PENGALI_HARIAN * durasi;
        }
        return hargaSewa * durasi;
    }

    @Override
    public String getInfo() {
        return "ID: " + idKamera + " | Nama: " + namaKamera;
    }

    @Override
    public String toString() {
        return "[" + getJenisKamera() + "] ID: " + idKamera
                + " | " + namaKamera
                + " | Rp" + hargaSewa + " / 3 jam"
                + " | " + getSpesifikasi();
    }
}
