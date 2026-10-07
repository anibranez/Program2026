# JOBSHEET 5 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** [Ibranez Unggul Pranata]
* **NIM:** [264107020037]
* **Kelas / No. Presensi:** [1D / 17]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks
pemilihan bersarang
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Jawa
3. Mahasiswa mampu menerapkan operator logika &&, ||, dan ! pada struktur pemilihan


---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

Seorang mahasiswa akan mendaftar ujian skripsi. Sistem SIMTA akan memeriksa syarat
administrasi terlebih dahulu, yaitu mahasiswa harus bebas kompen. Jika syarat ini terpenuhi,
sistem kemudian memeriksa catatan log bimbingan. Untuk bisa mendaftar ujian, mahasiswa
harus memiliki minimal 8 kali bimbingan dengan pembimbing 1 dan minimal 4 kali bimbingan
dengan pembimbing 2. Jika semua syarat terpenuhi, mahasiswa dapat melanjutkan ke proses
pendaftaran ujian skripsi. Jika tidak, sistem akan menampilkan alasan kegagalan.

#### 2.1.1 Kode Program Java
```java
// Contoh kode program Percobaan 1
package week6;
import java.util.Scanner;
public class nestedUjianSkripsi17 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? ya/tidak = ");
        String bebasKompen = sc.nextLine();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1 = ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2 =");
        int bimbinganP2 = sc.nextInt();
        
        if (bebasKompen.equalsIgnoreCase("ya")){
            if(bimbinganP1>=8 && bimbinganP2>=4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1<8){
                pesan = "Gagal!! log bimbingan P1 kurang dari 8 kali";
            }else if (bimbinganP2<4){
                 pesan = "Gagal!! log bimbingan P2 kurang dari 4 kali";
            }else {
                pesan = "Gagal!! log bimbingan P1 belum mencapai 8 kali dan log bimbingan P2 belum mencapai 4 kali";
            }
            
        }else {
            pesan = "Gagal!! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

    }

    
}
```

#### 2.1.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 1](/OutNestedUjian.png)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
  * **Jawab:** Program akan memunculkan output "Gagal!! Mahasiswa masih memiliki tanggungan kompen" karena syarat untuk mendaftar ujian skripsi adalah jika mahasiswa bebas kompen dan memenuhi bimbinga dengan dosen
* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut!
```java
if (bimbinganP1 >= 8 && bimbinganP2 >= 4)
```
  * **Jawab:** Program mengecek syarat bimbingna bersama dosen pembimbing 1 dan dosen pembimbing 2 dengan menggunakan kondisi operator logika
* **Pertanyaan 3** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
  * **Jawab:** input mahasiswa bebas kompen "ya/tidak".jika "ya" maka selanjutnya pengecekan kondisi jika "tidak" maka pesan berisi "Gagal!! Mahasiswa masih memiliki tanggungan kompen".Selanjutnya jika mahasiswa sudah bimbingan pada pembimbing 1 mencapai minimal 8 kali dan pembimbing 2 mencapai minimal 4 kali terpenuhi maka isi pesan "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi".Jika salah satu tidak terpenuhi maka program akan menjalankan kondisi selanjutnya jika bimbingan pembimbing 1 kurang dari 8 maka isi pesan "Gagal!! log bimbingan P1 kurang dari 8 kali".Jika tidak kondisi berikutnya pembimbing 2 kurang dari 4 maka isi pesan "Gagal!! log bimbingan P2 kurang dari 4 kali".Jika kondisi salah maka program akan mengisi pesan "Gagal!! log bimbingan P1 belum mencapai 8 kali dan log bimbingan P2 belum mencapai 4 kali".Lalu yang terakhir program akan menampilkan isi pesan sesuai isi dari hasil perkondisian.

---
### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Sistem WiFi kampus hanya dapat digunakan oleh mahasiswa atau dosen yang akunnya
tidak diblokir. Program menerima informasi apakah pengguna merupakan mahasiswa, dosen,
dan apakah akun pengguna sedang diblokir. Akses diberikan apabila pengguna merupakan
mahasiswa atau dosen, dan akun pengguna tidak diblokir. Percobaan ini digunakan untuk
mempraktikkan operator logika && (AND), || (OR), dan ! (NOT).

#### 2.2.1 Kode Program Java
```java
package week6;
import java.util.Scanner;

public class operatorLogikaWifi17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

    }
}
```
#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 2](/OutAksesWifi.png)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jelaskan fungsi operator ||, &&, dan ! pada kondisi program tersebut.
  * **Jawab:**Operator || digunakan untuk mengecek apakah pengguna merupakan mahasiswa atau dosen. Salah satu kondisi bernilai true sudah cukup. Operator && digunakan untuk memastikan bahwa syarat pengguna mahasiswa/dosen dan akun tidak diblokir harus terpenuhi. Operator ! digunakan untuk membalik nilai akunDiblokir, sehingga true menjadi false dan sebaliknya.
* **Pertanyaan 2:** Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai mahasiswa = false?
  * **Jawab:**Karena menggunakan operator || yang berarti OR (atau). Jika mahasiswa = false tetapi dosen = true, maka kondisi mahasiswa || dosen tetap bernilai true. Selama akun tidak diblokir, pengguna tetap mendapatkan akses WiFi.
* **Pertanyaan 3:**Ubah operator || menjadi &&. Jalankan kembali program menggunakan data uji 1 dan 2.
Apa yang terjadi dan mengapa?
  * **Jawab:**Jika || diubah menjadi &&, maka pengguna harus berstatus mahasiswa dan dosen sekaligus agar dapat melewati kondisi pertama. Jika salah satu bernilai false, kondisi menjadi false sehingga akses WiFi ditolak. Hal ini berbeda dengan || yang hanya membutuhkan salah satu dari mahasiswa atau dosen bernilai true.
* **Pertanyaan 4:**Pada ekspresi mahasiswa || dosen, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan
berdasarkan short-circuit evaluation.
  * **Jawab:**Kondisi dosen tidak perlu dievaluasi ketika mahasiswa sudah bernilai true. Karena operator || hanya membutuhkan salah satu kondisi bernilai true, program langsung mengetahui hasilnya true tanpa mengevaluasi kondisi dosen.
* **Pertanyaan 5:**Pada ekspresi (mahasiswa || dosen) && !akunDiblokir, kapan kondisi !akunDiblokir tidak
perlu dievaluasi? Jelaskan.
  * **Jawab:**Kondisi !akunDiblokir tidak perlu dievaluasi ketika (mahasiswa || dosen) bernilai false. Karena menggunakan operator &&, jika kondisi pertama sudah false, hasil keseluruhan pasti false, sehingga Java tidak perlu mengevaluasi kondisi berikutnya. Ini disebut short-circuit evaluation.



---
### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

Mahasiswa dapat menggunakan laboratorium di luar jadwal kuliah apabila statusnya aktif
dan tidak sedang mendapatkan sanksi. Jika syarat tersebut terpenuhi, sistem melakukan
pemeriksaan kedua. Akses laboratorium diberikan apabila mahasiswa memiliki izin dosen
atau merupakan asisten laboratorium. Kasus ini menggabungkan pemilihan bersarang dengan
operator logika.

#### 2.2.1 Kode Program Java
```java
package week6;
import java.util.Scanner;

public class nestedAksesLab17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {

            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println(
                    "Akses ditolak: membutuhkan izin dosen atau status asisten lab"
                );
            }

        } else {
            System.out.println(
                "Akses ditolak: status mahasiswa tidak memenuhi syarat"
            );
        }
    }
}
```
#### 2.2.2 Hasil Running / Screenshot Output
Berikut adalah contoh tampilan *output* setelah program dijalankan:

![Contoh Gambar Output Percobaan 2](/OutAksesLab.png)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa pemeriksaan punyaIzinDosen || asistenLab ditempatkan di dalam IF pertama?
  * **Jawab:** Operator || digunakan untuk mengecek Karena pemeriksaan izin dosen atau status asisten lab hanya dilakukan jika mahasiswa sudah memenuhi syarat pertama, yaitu mahasiswa aktif dan tidak sedang disanksi. Dengan Nested IF, pemeriksaan dilakukan secara bertahap sehingga alur program lebih jelas.
* **Pertanyaan 2:** Jelaskan fungsi operator &&, ||, dan ! pada program tersebut.
  * **Jawab:** Operator && digunakan untuk memastikan mahasiswa aktif dan tidak sedang disanksi. Operator || digunakan untuk memberikan akses jika mahasiswa memiliki izin dosen atau merupakan asisten lab. Operator ! digunakan untuk membalik kondisi sedangDisanksi, sehingga !sedangDisanksi berarti mahasiswa tidak sedang disanksi.
* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: mahasiswaAktif &&
!sedangDisanksi && (punyaIzinDosen || asistenLab)? Jelaskan apakah keputusan akses
akhirnya sama.
  * **Jawab:**Ya, syarat tersebut dapat ditulis menjadi satu kondisi. Keputusan akses akhirnya akan sama, karena semua syarat yang diperlukan tetap diperiksa. Namun, Nested IF lebih mudah digunakan apabila program ingin memberikan alasan penolakan yang berbeda berdasarkan tahap pemeriksaannya.
* **Pertanyaan 4:** Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika
sistem perlu menampilkan alasan penolakan yang berbeda?
  * **Jawab:**Keuntungan Nested IF adalah program dapat melakukan pemeriksaan secara bertahap dan memberikan alasan penolakan yang lebih spesifik. Misalnya, jika mahasiswa tidak aktif atau sedang disanksi, program menampilkan alasan penolakan pada tahap pertama. Jika tahap pertama terpenuhi tetapi tidak memiliki izin dosen dan bukan asisten lab, program dapat menampilkan alasan penolakan pada tahap kedua.
* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan
satu kombinasi yang menyebabkan akses ditolak pada level kedua.
  * **Jawab:**
1. Ditolak pada level pertama:

mahasiswaAktif = false
sedangDisanksi = false
punyaIzinDosen = true
asistenLab = false

Hasil:

Akses ditolak: status mahasiswa tidak memenuhi syarat

2. Ditolak pada level kedua:

mahasiswaAktif = true
sedangDisanksi = false
punyaIzinDosen = false
asistenLab = false

Hasil:

Akses ditolak: membutuhkan izin dosen atau status asisten lab

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** 1. Implementasikan flowchart yang telah Anda buat pada Latihan 2 Pertemuan 6 terkait
sistem diskon toko buku ke dalam program Java. Program wajib menerapkan struktur
pemilihan bersarang (Nested IF). Gunakan operator logika apabila diperlukan.

- [x] **Tugas 2:** Buatlah program Java untuk sistem seleksi calon asisten praktikum berdasarkan
ketentuan berikut:
• Mahasiswa dapat mengikuti seleksi apabila berstatus aktif dan tidak sedang
mendapatkan sanksi akademik.
• Jika syarat tersebut terpenuhi, mahasiswa harus memenuhi syarat berikutnya yaitu
nilai Dasar Pemrograman minimal 80 atau memiliki sertifikat kompetensi
pemrograman.
• Jika lolos 2 syarat tersebut, mahasiswa akan dipanggil untuk mengikuti wawancara.
Mahasiswa diterima sebagai asisten apabila nilai wawancara minimal 75.
• Program harus menampilkan alasan apabila mahasiswa gagal pada setiap tahap
seleksi.
• Gunakan pemilihan bersarang dan operator logika. Simpan file dengan nama
tugas2SeleksiAsistenNoPresensi.java.

### 3.1 Implementasi Kode Tugas 1

```java
package week6;
import java.util.Scanner;
public class LatihanDiskonBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double diskon;
        String buku;
        int jumlahBuku;
        
        System.out.print("Masukkan jenis buku (kamus/novel): ");
        buku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if(buku.equalsIgnoreCase("kamus")){
            if(jumlahBuku < 2){
                diskon = 0.1;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }else{
                diskon = 0.12;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }
        }else if(buku.equalsIgnoreCase("novel"))
            {
            if(jumlahBuku <= 3){
                diskon = 0.08;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }else{
                diskon = 0.09;
                System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
            }
        }else if(jumlahBuku < 3){
            diskon = 0.05;
            System.out.print(String.format("anda mendapatkan diskon %.0f%%", diskon * 100));
        }else{
            System.out.print("anda tidak mendapatkan diskon");
        }
}
}
```
### 3.2 Implementasi Kode Tugas 2
```java
package week6;
import java.util.Scanner;
public class SeleksiCalonAsistenPraktikum17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isMahasiswaAktif;
        boolean isSedangDisanksi;
        int nilaiDaspro;
        boolean hasSertifikat;
        int nilaiWawancara;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        isMahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        isSedangDisanksi = sc.nextBoolean();

        if(isMahasiswaAktif && !isSedangDisanksi){
            
           System.out.print("Masukkan nilai Daspro: ");
           nilaiDaspro = sc.nextInt();
           System.out.print("Apakah memiliki sertifikat? (true/false): ");
           hasSertifikat = sc.nextBoolean();

           if(nilaiDaspro >= 80 || hasSertifikat){
               System.out.println("Anda akan di panggil untuk wawancara");
               System.out.print("Masukkan nilai wawancara: ");
               nilaiWawancara = sc.nextInt();
               if(nilaiWawancara >= 75){
                   System.out.println("Selamat anda diterima menjadi calon asisten praktikum");
               } else {
                   System.out.println("Maaf anda tidak diterima menjadi calon asisten praktikum");
               }
           } else {
               System.out.println("nilai Daspro kurang dari 80 atau tidak memiliki sertifikat");
           }
            
        }else{
            System.out.println("Anda tidak memenuhi syarat untuk menjadi calon asisten praktikum");
        }
        
    }
}
```

---

## 4: KESIMPULAN

Berdasarkan praktikum yang telah dilakukan, struktur pemilihan Nested IF digunakan untuk mengatur alur program secara bertahap berdasarkan beberapa kondisi. Operator logika &&, ||, dan ! digunakan untuk menggabungkan, memilih, dan membalik kondisi dalam program. Nested IF juga dapat membantu program memberikan alasan yang lebih jelas ketika suatu syarat tidak terpenuhi. Dengan menerapkan struktur pemilihan dan operator logika, program dapat mengambil keputusan sesuai dengan kondisi dan input yang diberikan oleh pengguna.