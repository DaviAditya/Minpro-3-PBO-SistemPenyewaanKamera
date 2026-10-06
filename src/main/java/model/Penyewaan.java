/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dovs
 */
public class Penyewaan {
    private final String kodeSewa;

    // Attribute Customer
    private String idCust;
    private String namaCust;
    private String noTelp;

    // Attribute Penyewaan
    private Kamera kamera;
    private TipeSewa tipeSewa;
    private int durasi;

    public Penyewaan(String kodeSewa, String idCust, String namaCust, String noTelp,
                     Kamera kamera, TipeSewa tipeSewa, int durasi) {
        this.kodeSewa = validasiTeks(kodeSewa, "Kode sewa");
        setIdCust(idCust);
        setNamaCust(namaCust);
        setNoTelp(noTelp);
        setKamera(kamera);
        setTipeSewa(tipeSewa);
        setDurasi(durasi);
    }

    // Validasi jangan null
    private static String validasiTeks(String nilai, String namaField) {
        if (nilai == null || nilai.trim().isEmpty()) {
            throw new IllegalArgumentException(namaField + " tidak boleh kosong!");
        }
        return nilai.trim();
    }

    // Getter dan Setter
    public String getKodeSewa() {
        return kodeSewa;
    }

    public String getIdCust() {
        return idCust;
    }

    public void setIdCust(String idCust) {
        this.idCust = validasiTeks(idCust, "ID customer");
    }

    public String getNamaCust() {
        return namaCust;
    }

    public void setNamaCust(String namaCust) {
        this.namaCust = validasiTeks(namaCust, "Nama customer");
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        if (noTelp == null || !noTelp.trim().matches("\\d+")) {
            throw new IllegalArgumentException("Nomor telepon harus berupa angka!");
        }
        this.noTelp = noTelp.trim();
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void setKamera(Kamera kamera) {
        if (kamera == null) {
            throw new IllegalArgumentException("Kamera tidak boleh kosong!");
        }
        this.kamera = kamera;
    }

    public TipeSewa getTipeSewa() {
        return tipeSewa;
    }

    public void setTipeSewa(TipeSewa tipeSewa) {
        if (tipeSewa == null) {
            throw new IllegalArgumentException("Tipe sewa tidak boleh kosong!");
        }
        this.tipeSewa = tipeSewa;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        if (durasi <= 0) {
            throw new IllegalArgumentException("Durasi sewa minimal 1!");
        }
        this.durasi = durasi;
    }

    public String getDeskripsiDurasi() {
        if (tipeSewa == TipeSewa.HARIAN) {
            return durasi + " hari";
        }
        return durasi + " paket (" + (durasi * 3) + " jam)";
    }

    public double hitungTotalBiaya() {
        return kamera.hitungBiayaSewa(durasi, tipeSewa);
    }
}