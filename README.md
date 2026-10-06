# Sistem Penyewaan Kamera 📸
### Nama: Muhammad Davi Aditya Pratama
### NIM: 2509116070

## Deskripsi Singkat Program 📝
Program ini merupakan sistem penyewaan kamera berbasis bahasa java yang dibuat untuk mempermudah proses pengelolaan pada Penyewaan Kamera. 
Program ini mengelola transaksi penyewaan kamera, katalog stok kamera, serta data pelanggan. Program ini ditulis dengan Java dan disusun menggunakan pola MVC 
(Model-View-Controller). Kode dipisah ke dalam beberapa package agar data, logika bisnis, dan tampilan tidak bercampur.

<img width="271" height="367" alt="image" src="https://github.com/user-attachments/assets/25b90b44-64a0-48d9-9e61-cddc86cde9a9" />  

1. Package model   
   Berisi entitas data, kontrak interface, enum, dan logika dasar objek yang digunakan dalam sistem:
   - Kamera.java:	Superclass utama yang mendefinisikan atribut umum kamera (ID, nama, dan harga sewa) serta method penghitungan biaya
   - KameraDslr.java:	Subclass turunan Kamera untuk kamera jenis DSLR, dengan atribut spesifik tipe lensa.
   - KameraMirorrless.java:	Subclass turunan Kamera untuk kamera mirrorless, dengan atribut spesifik ketersediaan fitur 4K.
   - DigiCam.java	Subclass: turunan Kamera untuk kamera digital (digicam), dengan atribut spesifik pilihan efek retro.
   - Penyewaan.java:	Class entitas yang menyimpan data transaksi penyewaan: kode sewa, data pelanggan, objek kamera yang disewa, dan durasi sewa.
   - Disewakan.java: adalah interface yang menentukan method-method yang harus dimiliki oleh objek yang dapat disewakan, sehingga memastikan bahwa proses
     penyewaan dapat dijalankan secara konsisten pada semua jenis kamera.
   - TipeSewa.java: Enumerasi yang mendefinisikan tipe sewa yang tersedia.

2. Package controller  
   Berisi logika bisnis dan pemrosesan data sistem.    
   Service.java	Mengelola seluruh operasi manipulasi data (CRUD) di dalam ArrayList: menyimpan daftar katalog kamera, menampilkan transaksi,
   menambah transaksi baru, membatalkan transaksi, serta memperbarui (update) data penyewaan.

3. Package view  
   Berisi tampilan antarmuka pengguna berbasis teks.  
   View.java Menampilkan menu interaktif, menerima inputan pengguna menggunakan Scanner, serta memanggil fungsi-fungsi dari Service.

4. Package main  
   Berisi kelas utama sebagai titik masuk (entry point) program.  
   Main.java	Method main() yang menjalankan program. Menjalankan menu dalam perulangan while hingga pengguna memilih keluar.

## Alur Program ⏳  
A. Dokumentasi dibawah merupakan output yang akan tertampil ketika file dijalankan (Run File).  Tampilan dibawah merupakan tampilan awal dari Sistem Penyewaan Kamera. Menu yang ada pada sistem ini antara lain: 
  1. Booking Kamera
  2. Data Penyewaan & Stok
  3. Batal Penyewaan
  4. Update Penyewaan
  5. Keluar  
<img width="423" height="365" alt="image" src="https://github.com/user-attachments/assets/46a434f5-9756-41d7-b593-16cbe96b9f0d" />

  1. Booking Kamera  
     <img width="703" alt="image" src="https://github.com/user-attachments/assets/30ce4d2d-3667-4154-9399-c325ea872faf" />  
     Pada pilihan menu ini, akan dilakukan inputasi mengenai booking kamera, mulai dari data customer hingga lama penyewaan.
     - Kode Sewa: Identitas unik untuk transaksi dengan format (S005).
     - ID Customer: Identitas unik pelanggan dengan format (C05).
     - Nama Customer: Identitas nama penyewa dengan contoh (Fikri)
     - No. Telepon: Nomor kontak yang bisa dihubungi.
     - Pilih id kamera: Pemilihan unit kamera yang ingin di sewa
     - Pilih jenis sewa: Pemilihan jenis sewa, per 3 jam atau per hari
     - Pilih paket: Pemilihan paket, jika per 3 jam cukup input 1 untuk 3 jam dan 2 untuk 6 jam. Jika per hari cukup input angka harinya.
      Setelah itu semua diinput, akan muncul pesan sukses transaksi telah ditambahkan disertai dengan struk penyewaannya.  
      <img width="352" height="321" alt="image" src="https://github.com/user-attachments/assets/2cb2a613-d798-4ba9-b516-2f3fa5e2ae54" />  

  2. Data Penyewaan & Stok
  4. Batal Penyewaan
  5. Update Penyewaan
  6. Keluar  
## Nilai Tambah ➕  

    ```java
    @Override
    public String toString() {
        return "Kamera{" +
                "idKamera=" + idKamera +
                ", namaKamera='" + namaKamera + '\'' +
                ", hargaSewa=" + hargaSewa +
                '}';
    }
    ```
    
    * **Letak Kode: Subclass `DigiCam.java`**
    ```java
    @Override
    public String toString() {
        return super.toString() + " | efekRetro: " + efekRetro;
    }
    ```
    
    * **Letak Kode: Subclass `KameraDslr.java`**
    ```java
    @Override
    public String toString() {
        return super.toString() + " | Tipe Lensa: " + tipeLensa;
    }
    ```
    
    * **Letak Kode: Subclass `KameraMirorrless.java`**
    ```java
    @Override
    public String toString() {
        return super.toString() + " | Fitur 4k: " + adaFitur4K;
    }
    ```
