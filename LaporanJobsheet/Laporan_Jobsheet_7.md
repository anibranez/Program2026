# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** [Ibranez Unggul Pranata]
* **NIM:** [264107020037]
* **Kelas / No. Presensi:** [1D / 17]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while, dan do-while)
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan bahasa pemrograman Java

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

Dosen ingin mencari nilai tertinggi dan terendah Kuis dari 10 mahasiswa dalam satu kelas. Dosen memasukkan nilai setiap mahasiswa, lalu program menampilkan nilai tertinggi dan terendah. Repository yang digunakan: `daspro-jobsheet7`.

#### 2.1.1 Kode Program Java
Kode berikut sudah termasuk modifikasi Pertanyaan 4 (menghitung jumlah mahasiswa lulus dan tidak lulus dengan batas nilai minimal 60).

```java
// File: SiakadFor17.java
import java.util.Scanner;
public class SiakadFor17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,tertinggi=0,terendah=100;
        for (int i=1;i<=10;i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+"=");
            nilai = sc.nextInt();
            if (nilai>tertinggi){
                tertinggi=nilai;
            }
            if (nilai<terendah){
                terendah=nilai;
            }

        }
        System.out.println("Nilai tertinggi="+tertinggi);
        System.out.println("Terendah="+terendah);
    }
}

```

#### 2.1.2 Hasil Running / Screenshot Output
Data uji: 76.5, 82.3, 62.1, 88.4, 65.9, 67.9, 90.1, 55.3, 73.7, 78.6

```
Nilai tertinggi: 90.1
Nilai terendah: 55.3
Jumlah mahasiswa lulus: 9
Jumlah mahasiswa tidak lulus: 1
```



#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
  * **Jawab:** Pada `for (int i = 1; i <= 10; i++)`, komponennya adalah:
    1. **Inisialisasi:** `int i = 1`, yaitu nilai awal variabel penghitung.
    2. **Kondisi:** `i <= 10`, perulangan berjalan selama kondisi bernilai true.
    3. **Update (increment):** `i++`, yaitu penambahan nilai `i` setiap akhir iterasi.
    4. **Badan perulangan:** blok `{ ... }` berisi input nilai dan dua pengecekan `if`.
* **Pertanyaan 2:** Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
  * **Jawab:** Rentang nilai adalah 0–100. Dengan `tertinggi = 0`, nilai pertama yang dimasukkan pasti lebih besar atau sama dengan 0 sehingga bisa menggantikannya. Dengan `terendah = 100`, nilai pertama pasti kurang dari atau sama dengan 100 sehingga bisa menggantikannya. Jika dibalik (`tertinggi = 100`, `terendah = 0`), kondisi `nilai > 100` dan `nilai < 0` tidak pernah terpenuhi untuk nilai valid. Hasilnya, nilai tertinggi selalu 100 dan terendah selalu 0, sehingga tidak sesuai data yang dimasukkan.
* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
  ```java
  if (nilai > tertinggi) {
      tertinggi = nilai;
  }
  if (nilai < terendah) {
      terendah = nilai;
  }
  ```
  * **Jawab:** Potongan kode ini mencari nilai maksimum dan minimum. Setiap nilai baru dibandingkan dengan `tertinggi`. Jika lebih besar, `tertinggi` diperbarui. Nilai yang sama juga dibandingkan dengan `terendah`. Jika lebih kecil, `terendah` diperbarui. Kedua `if` ditulis terpisah karena satu nilai bisa memenuhi dua kondisi sekaligus (misalnya nilai pertama). Setelah 10 iterasi, `tertinggi` dan `terendah` menyimpan nilai ekstrem dari seluruh data.
* **Pertanyaan 4:** Modifikasi kode untuk menghitung jumlah mahasiswa lulus dan tidak lulus (nilai minimal 60).
  * **Jawab:** Ditambahkan variabel `lulus` dan `tidakLulus` bernilai awal 0 di luar perulangan. Di dalam perulangan ditambahkan `if (nilai >= 60) lulus++; else tidakLulus++;`. Hasilnya ditampilkan setelah nilai tertinggi dan terendah (lihat kode 2.1.1).
* **Pertanyaan 5:** Commit dan push kode program ke GitHub.
  * **Jawab:** Sudah dilakukan.



---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE

Dosen memasukkan nilai beberapa mahasiswa untuk ditentukan kategori huruf. Nilai tidak valid (negatif atau lebih dari 100) diabaikan dan dosen diminta mengulang input.

Kategori: A (80 < nilai ≤ 100), B+ (73 < nilai ≤ 80), B (65 < nilai ≤ 73), C+ (60 < nilai ≤ 65), C (50 < nilai ≤ 60), D (39 < nilai ≤ 50), E (nilai ≤ 39).

#### 2.2.1 Kode Program Java
Kode berikut sudah termasuk modifikasi Pertanyaan 4 (pesan tambahan untuk nilai A).

```java
// File: SiakadWhile17.java
import java.util.Scanner;
public class SiakadWhile17 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int nilai,jml;
        int i=0;
        System.out.print("Masukkan jumlah mahasiswa =");
        jml = sc.nextInt();

        while (i < jml) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai = sc.nextInt();
        if (nilai < 0 || nilai > 100) {
        System.out.print("Nilai tidak valid.Masukkan lagi nilai yang valid");
        continue;
        }
        if (nilai > 80 && nilai <= 100) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " A");
        } else if (nilai > 73 && nilai <= 80) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " B+");
        } else if (nilai > 65 && nilai <= 73) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " B");
        } else if (nilai > 60 && nilai <= 65) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " C+");
        } else if (nilai > 50 && nilai <= 60) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " C");
        } else if (nilai > 39 && nilai <= 50) {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " D");
        } else {
        System.out.print("Nilai mahasiswa ke- " + (i + 1) + " E");
        }
        i++;
        }
    }


}
```

#### 2.2.2 Hasil Running / Screenshot Output
Data uji: jumlah mahasiswa 5, dengan nilai 85, 63, 101 (tidak valid) lalu 23, -15 (tidak valid) lalu 70, dan 55.

```
Masukkan jumlah mahasiswa: 5
Masukkan nilai mahasiswa ke-1: 85
Nilai mahasiswa ke-1 adalah A
Bagus, pertahankan nilainya
Masukkan nilai mahasiswa ke-2: 63
Nilai mahasiswa ke-2 adalah C+
Masukkan nilai mahasiswa ke-3: 101
Nilai tidak valid. Masukkan lagi nilai yang valid!
Masukkan nilai mahasiswa ke-3: 23
Nilai mahasiswa ke-3 adalah E
Masukkan nilai mahasiswa ke-4: -15
Nilai tidak valid. Masukkan lagi nilai yang valid!
Masukkan nilai mahasiswa ke-4: 70
Nilai mahasiswa ke-4 adalah B
Masukkan nilai mahasiswa ke-5: 55
Nilai mahasiswa ke-5 adalah C
```



#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Tentukan maksud dan kegunaan dari sintaks berikut: (a) `nilai < 0 || nilai > 100` dan (b) `continue`.
  * **Jawab:**
    * **(a)** Kondisi ini mengecek nilai tidak valid. Operator `||` (OR) membuat kondisi bernilai true jika nilai negatif **atau** lebih dari 100. Nilai valid berada di rentang 0–100.
    * **(b)** `continue` melewati sisa perintah di badan perulangan dan langsung kembali ke pengecekan kondisi `while`. Karena `i++` ada di akhir badan perulangan dan ikut terlewati, nilai `i` tidak bertambah, sehingga mahasiswa yang sama diminta memasukkan nilai lagi.
* **Pertanyaan 2:** Mengapa `i++` dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya di awal?
  * **Jawab:** `i++` ditulis di akhir agar `i` hanya bertambah setelah satu nilai valid selesai diproses. Jika input tidak valid, `continue` melewati `i++` sehingga input diulang untuk mahasiswa yang sama. Jika `i++` ditulis di awal, `i` bertambah setiap kali masuk perulangan, termasuk saat input tidak valid. Akibatnya, input tidak valid tetap dihitung sebagai satu mahasiswa. Jumlah data valid menjadi kurang dari `jml`, dan penomoran `(i + 1)` yang ditampilkan juga bergeser satu angka.
* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
  * **Jawab:** Nilai `i` berjalan dari 0 sampai 18, sehingga ada **19 kali** perulangan untuk data valid. Jika ada input tidak valid, badan perulangan berjalan lebih banyak, yaitu 19 ditambah jumlah input yang tidak valid, karena setiap input tidak valid mengulang pengecekan tanpa menaikkan `i`.
* **Pertanyaan 4:** Modifikasi kode agar nilai A menampilkan pesan "Bagus, pertahankan nilainya"!
  * **Jawab:** Pada blok `if (nilai > 80 && nilai <= 100)` ditambahkan `System.out.println("Bagus, pertahankan nilainya");` (lihat kode 2.2.1).
* **Pertanyaan 5:** Commit dan push kode program ke GitHub.
  * **Jawab:** Sudah dilakukan.



---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE

Kasir kafe memproses transaksi beberapa pelanggan. Harga: kopi Rp12.000, teh Rp7.000, roti Rp20.000. Kasir terus memasukkan pembelian sampai nama pelanggan yang dimasukkan adalah "batal".

#### 2.3.1 Kode Program Java
```java
// File: KafeDoWhile17.java
import java.util.Scanner;
public class KafeDoWhile17{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int kopi,roti,teh;
        String namPel;
        int harKopi = 12000;
        int harTeh = 7000;
        int harRoti = 20000;
        int totHarga;

        do {
        System.out.print("Massukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namPel = sc.nextLine();
        if (namPel.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan.");
        break;
        }
        System.out.print("jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("jumlah teh: ");
        teh = sc.nextInt();
        System.out.print("jumlah roti: ");
        roti = sc.nextInt();
        totHarga = (kopi * harKopi) + (teh * harTeh) + (roti * harRoti);
        System.out.println("Total yang harus dibayar: Rp " + totHarga);
        sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
```

#### 2.3.2 Hasil Running / Screenshot Output
```
Masukkan nama pelanggan (ketik 'batal' untuk keluar): Rena
Jumlah kopi: 3
Jumlah teh: 0
Jumlah roti: 1
Total yang harus dibayar: Rp 56000
Masukkan nama pelanggan (ketik 'batal' untuk keluar): Yuni
Jumlah kopi: 1
Jumlah teh: 4
Jumlah roti: 2
Total yang harus dibayar: Rp 80000
Masukkan nama pelanggan (ketik 'batal' untuk keluar): BATAL
Transaksi dibatalkan.
Semua transaksi selesai.
```



#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", berapa kali perulangan dilakukan?
  * **Jawab:** **1 kali.** DO-WHILE menjalankan badan perulangan terlebih dahulu sebelum mengecek kondisi. Program meminta nama, mendapati "batal", lalu `break` menghentikan perulangan pada iterasi pertama itu.
* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
  * **Jawab:** Kondisi `while (true)` tidak pernah bernilai false. Perulangan berhenti oleh pernyataan `break` yang dijalankan ketika `namaPelanggan.equalsIgnoreCase("batal")` bernilai true.
* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai `true` pada kondisi DO-WHILE?
  * **Jawab:** Nilai `true` membuat perulangan tak terbatas (*infinite loop*). Kasir bisa memproses pelanggan sebanyak apa pun karena jumlah pelanggan tidak diketahui di awal. Berhenti atau tidaknya perulangan ditentukan oleh `break` di dalam badan perulangan.
* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
  * **Jawab:** Perulangan ini tidak bergantung pada variabel penghitung. Kondisinya selalu `true`, sehingga tidak perlu inisialisasi untuk menentukan awal dan tidak perlu update untuk mengubah kondisi. Perulangan dikendalikan oleh masukan pengguna melalui `break`.

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Program total penjualan tiket bioskop dalam satu hari dengan diskon dan validasi input.
- [x] **Tugas 2:** Implementasi flowchart perhitungan total parkir kendaraan ke dalam program Java.

### 3.1 Implementasi Kode Tugas 1

Program meminta jumlah tiket setiap pelanggan. Input negatif diabaikan dan diminta ulang, sedangkan input **0** menandakan penjualan hari itu selesai. Aturan diskon: lebih dari 4 tiket mendapat diskon 10%, lebih dari 10 tiket mendapat diskon 15%.

```java
// File: TiketBioskop17.java
import java.util.Scanner;

public class TiketBioskop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan ulang!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            int diskonPersen = 0;
            if (jumlah > 10) {
                diskonPersen = 15;
            } else if (jumlah > 4) {
                diskonPersen = 10;
            }

            int harga = jumlah * hargaTiket;
            int bayar = harga - (harga * diskonPersen / 100);

            System.out.println("Diskon " + diskonPersen + "%, total bayar: Rp " + bayar);

            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
        sc.close();
    }
}
```

#### Hasil Running / Screenshot Output
```
Masukkan jumlah tiket pelanggan (0 untuk selesai): 3
Diskon 0%, total bayar: Rp 150000
Masukkan jumlah tiket pelanggan (0 untuk selesai): -2
Input tidak valid. Masukkan ulang!
Masukkan jumlah tiket pelanggan (0 untuk selesai): 5
Diskon 10%, total bayar: Rp 225000
Masukkan jumlah tiket pelanggan (0 untuk selesai): 12
Diskon 15%, total bayar: Rp 510000
Masukkan jumlah tiket pelanggan (0 untuk selesai): 0
Total tiket terjual : 20
Total penjualan     : Rp 885000
```



### 3.2 Implementasi Kode Tugas 2

Flowchart: program meminta jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar). Jika jenis 1 atau 2, program meminta durasi lalu menambahkan tarif ke total (mobil Rp3.000/jam, motor Rp2.000/jam). Perulangan berlanjut selama jenis bukan 0.

```java
// File: Parkir17.java
import java.util.Scanner;
public class ParkirWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total=0;
        do{
            System.out.print("Masukkan jenis kendaraan (1/2/0) :"); //1=mobil ;2=motor ;0=keluar
            jenis = sc.nextInt();
            if (jenis==1||jenis==2){
                System.out.print("Masukkan durasi:");
                durasi = sc.nextInt();
                if (jenis==1){
                total += durasi*3000;
                System.out.print(total);
                System.out.println();
                }else{
                total += durasi*2000;
                System.out.print(total);
                System.out.println();
                }
            }else{
                System.out.println("keluar");
                break;
            }
           

        }while(jenis != 0);
    }
}
```

#### Hasil Running / Screenshot Output
```
Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): 1
Masukkan durasi (jam): 3
Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): 2
Masukkan durasi (jam): 4
Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): 0
Total pembayaran parkir: Rp 17000
```



---

## 4: KESIMPULAN

Berdasarkan praktikum yang telah dilakukan, perulangan digunakan untuk menjalankan blok perintah secara berulang tanpa menulis kode yang sama berkali-kali. Perulangan **FOR** cocok untuk jumlah iterasi yang sudah diketahui (misalnya 10 mahasiswa). Perulangan **WHILE** cocok ketika kondisi dicek terlebih dahulu dan jumlah iterasi bisa dinamis, serta dapat dikombinasikan dengan `continue` untuk mengulang input tidak valid. Perulangan **DO-WHILE** menjalankan badan perulangan minimal satu kali dan cocok untuk proses yang diulang sampai pengguna menghentikannya, misalnya dengan `break`. Penentuan nilai awal variabel (seperti `tertinggi` dan `terendah`), posisi `i++`, dan kondisi berhenti sangat memengaruhi kebenaran hasil program.
