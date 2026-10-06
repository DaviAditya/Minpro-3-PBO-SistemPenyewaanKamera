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
Dokumentasi dibawah merupakan output yang akan tertampil ketika file dijalankan (Run File).  Tampilan dibawah merupakan tampilan awal dari Sistem Penyewaan Kamera. Menu yang ada pada sistem ini antara lain: 
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
     <img width="366" height="706" alt="image" src="https://github.com/user-attachments/assets/20233748-f76c-4786-9abd-588d3b1a970f" />  
     Pilihan menu ini berfungsi untuk menampilkan seluruh riwayat transaksi penyewaan yang tersimpan di dalam sistem (ArrayList). Informasi yang ditampilkan seperti nama customer, kamera yang disewa dan tipe sewa yang dipilih serta total biaya penyewaan.    
  3. Batal Penyewaan  
     <img width="502" height="128" alt="image" src="https://github.com/user-attachments/assets/50aba7eb-00a7-42f4-bcb7-4cd878d33d17" />  
     Pilihan menu ini berfungsi untuk pembatalan sewa. Pengguna cukup memasukkan kode sewa yang ingin dibatalkan penyewaannya, lalu sistem akan mencari data tersebut dan menghapusnya.   
      <img width="342" height="565" alt="image" src="https://github.com/user-attachments/assets/fbc101b2-480c-4914-b210-89a7ec9d0875" />  
       Terlihat pada dokumentasi diatas bahwa penghapusan data sewa dengan kode S005 dengan nama Fikri sudah tidak ada dalam data penyewaan.  
  4. Update Penyewaan    
     <img width="696" height="422" alt="Screenshot 2026-10-06 185023" src="https://github.com/user-attachments/assets/f5948636-34b8-45d2-a3fb-277858ac2eeb" />   
      Pilihan menu ini berfungsi untuk memperbarui data penyewaan, di mana pengguna memasukkan kode sewa, memilih bagian data yang ingin diubah (seperti ID, nama, nomor telepon, kamera, atau durasi), lalu memasukkan data baru hingga sistem berhasil mengupdate transaksi tersebut.  
     <img width="348" height="183" alt="image" src="https://github.com/user-attachments/assets/647dad4e-b1df-47f6-a824-cf7ceefdb19c" />  
     Terlihat pada dokumentasi diatas, untuk data dengan kode sewa S003 dibagian kamera udah terganti sesuai pembaruan yang dimasukkan sebelumnya.  
  5. Keluar  
     <img width="620" height="137" alt="image" src="https://github.com/user-attachments/assets/7c66cdeb-dc16-4d9a-8f33-b32b858658c1" />  
      Pilihan menu ini berfungsi untuk mengakhiri program, di mana pengguna memilih opsi nomor 5 lalu sistem akan menampilkan pesan penutup dan menghentikan jalannya aplikasi.

## Nilai Tambah ➕  

    public interface Disewakan {
       double hitungBiayaSewa(int durasi, TipeSewa tipe);

       String getInfo();
       }
Nilai tambah interface, Disewakan adalah sebuah interface yang memuat aturan bagi semua kamera yang dapat disewakan artinya, setiap kamera wajib memiliki metode 'hitungBiayaSewa()' untuk menghitung biaya serta 'getInfo()' untuk menampilkan informasi kamera.

Interface ini diimplementasikan oleh kelas abstrak 'Kamera', sehingga seluruh kelas turunannya ('KameraDslr', 'KameraMirrorless', 'DigiCam') secara otomatis mengikuti aturan yang sama. Jika nanti ada kamera sewaan baru, cukup menambahkan label 'Disewakan' tanpa perlu mengubah kode yang sudah ada.
