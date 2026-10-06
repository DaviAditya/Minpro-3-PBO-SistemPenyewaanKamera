/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.DigiCam;
import model.Kamera;
import model.KameraDslr;
import model.KameraMirorrless;
import model.Penyewaan;
import model.TipeSewa;
/**
 *
 * @author Dovs
 */
public class Service {
    private final ArrayList<Penyewaan> daftarSewa = new ArrayList<>();
    private final ArrayList<Kamera> daftarKamera = new ArrayList<>();

    public Service() {
        initDummyData();
    }

    private void initDummyData() {
        Kamera dslr1 = new KameraDslr(101, "Canon EOS 80D", 75000, "18-135mm IS USM");
        Kamera dslr2 = new KameraDslr(102, "Canon EOS 600D", 50000, "18-35mm IS II");
        Kamera mirrorless1 = new KameraMirorrless(103, "Sony A6400", 90000, true);
        Kamera digicam1 = new DigiCam(104, "Canon IXY 650", 40000, "Vintage Film Warm");
        Kamera digicam2 = new DigiCam(105, "Sony Cyber-shot WX350", 45000, "Retro Soft");

        daftarKamera.add(dslr1);
        daftarKamera.add(dslr2);
        daftarKamera.add(mirrorless1);
        daftarKamera.add(digicam1);
        daftarKamera.add(digicam2);

        daftarSewa.add(new Penyewaan("S001", "C01", "Davi Aditya", "081234567890", dslr1, TipeSewa.PER_3_JAM, 2));
        daftarSewa.add(new Penyewaan("S002", "C02", "Riaz Ramadhan", "089876543210", mirrorless1, TipeSewa.PER_3_JAM, 1));
        daftarSewa.add(new Penyewaan("S003", "C03", "Indah Marlina", "089822113412", digicam1, TipeSewa.HARIAN, 1));
    }

    // Getter
    public ArrayList<Kamera> getDaftarKamera() {
        return daftarKamera;
    }

    public ArrayList<Penyewaan> getDaftarSewa() {
        return daftarSewa;
    }

    // Pencarian
    public Kamera cariKamera(int idKamera) {
        for (Kamera k : daftarKamera) {
            if (k.getIdKamera() == idKamera) {
                return k;
            }
        }
        return null;
    }

    public Penyewaan cariSewa(String kodeSewa) {
        for (Penyewaan p : daftarSewa) {
            if (p.getKodeSewa().equalsIgnoreCase(kodeSewa)) {
                return p;
            }
        }
        return null;
    }

    // Create
    public Penyewaan tambahPenyewaan(String kodeSewa, String idCust, String namaCust, String noTelp,
                                 int idKamera, TipeSewa tipeSewa, int durasi) {
    Kamera kameraDipilih = cariKamera(idKamera);
    if (kameraDipilih == null) {
        throw new IllegalArgumentException("ID Kamera tidak ditemukan!");
    }
    Penyewaan sewaBaru = new Penyewaan(kodeSewa, idCust, namaCust, noTelp, kameraDipilih, tipeSewa, durasi);
    daftarSewa.add(sewaBaru);
    return sewaBaru;
}

    // Delete
    public boolean batalPenyewaan(String kodeSewa) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p == null) {
            return false;
        }
        daftarSewa.remove(p);
        return true;
    }
    
    // Update
    public boolean updateIdCustomer(String kodeSewa, String idCustBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p == null) {
            return false;
        }
        p.setIdCust(idCustBaru);
        return true;
    }

    public boolean updateNamaCustomer(String kodeSewa, String namaCustBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p == null) {
            return false;
        }
        p.setNamaCust(namaCustBaru);
        return true;
    }

    public boolean updateNoTelepon(String kodeSewa, String noTelpBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p == null) {
            return false;
        }
        p.setNoTelp(noTelpBaru);
        return true;
    }

    public boolean updateKamera(String kodeSewa, int idKameraBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        Kamera kameraBaru = cariKamera(idKameraBaru);
        if (p == null || kameraBaru == null) {
            return false;
        }
        p.setKamera(kameraBaru);
        return true;
    }

    public boolean updateDurasi(String kodeSewa, TipeSewa tipeBaru, int durasiBaru) {
        Penyewaan p = cariSewa(kodeSewa);
        if (p == null) {
            return false;
        }
        p.setTipeSewa(tipeBaru);
        p.setDurasi(durasiBaru);
        return true;
    }
}