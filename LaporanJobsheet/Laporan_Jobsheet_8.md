# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**
* **Nama:** [Ibranez Unggul Pranata]
* **NIM:** [264107020037]
* **Kelas / No. Presensi:** [1D / 17]

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Memahami konsep perulangan bersarang pada algoritma
2. Memahami alur perulangan bersarang
3. Mengenal sintaks perulangan bersarang
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Review Perulangan 1

Program menampilkan karakter `*` sebanyak *n* kali secara mendatar dengan perulangan FOR. Repository yang digunakan: `daspro-jobsheet8`.

#### 2.1.1 Kode Program Java
```java
// File: Star17.java

import java.util.Scanner;
public class Star17 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Masukkan nilai n = ");
 int n = sc.nextInt();
 for (int i = 1; i <= n; i++) {
 System.out.print("*");
 }
 System.out.println();
 sc.close();
 }
}

```

#### 2.1.2 Hasil Running / Screenshot Output
```
Masukkan nilai n = 5
*****
```

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi `i = 1` diubah menjadi `i = 0` tanpa mengubah kondisi, berapa karakter `*` yang tercetak ketika n = 5?
  * **Jawab:** Tercetak **6 karakter** (`******`). Dengan `i = 0` dan kondisi `i <= 5`, nilai `i` yang dijalankan adalah 0, 1, 2, 3, 4, 5, yaitu 6 iterasi, sehingga lebih banyak satu dari seharusnya.
* **Pertanyaan 2:** Jika kondisi `i <= n` diganti menjadi `i < n`, berapa kali perulangan dijalankan saat n = 5? Mengapa berbeda?
  * **Jawab:** Perulangan berjalan **4 kali** (`i` = 1, 2, 3, 4). Operator `<` tidak menyertakan nilai `i = 5`, sedangkan `<=` menyertakannya. Perbedaan satu operator ini mengubah batas akhir perulangan.
* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika n = 9, lalu buktikan. Modifikasi agar mencetak bilangan ganjil positif yang tidak melebihi n.
  ```java
  for (int i = 2; i <= n; i += 2) {
      System.out.print(i + " ");
  }
  ```
  * **Jawab:** Prediksi dan hasil pembuktian: `2 4 6 8 ` (bilangan genap, karena mulai dari 2 dengan loncatan 2; `i = 10` tidak dicetak karena melebihi 9). Modifikasi untuk bilangan ganjil:
  ```java
  for (int i = 1; i <= n; i += 2) {
      System.out.print(i + " ");
  }
  ```
  Output untuk n = 9: `1 3 5 7 9 `
* **Pertanyaan 4:** Jelaskan mengapa perubahan `i++` menjadi `i--` (kondisi tetap `i <= n`) membuat perulangan berjalan terus-menerus.
  * **Jawab:** Nilai awal `i = 1` lalu terus berkurang (0, -1, -2, ...), sehingga `i` selalu lebih kecil dari `n` dan kondisi `i <= n` selalu true. Kondisi tidak pernah menjadi false, sehingga perulangan tidak berhenti dalam waktu wajar dan terus mencetak `*`. Nilai `i` baru berubah menjadi positif besar setelah melewati batas bawah tipe `int` (*overflow*) sekitar dua miliar iterasi kemudian. Versi ini tidak dijalankan.

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

Program mencetak persegi panjang bintang. *Outer loop* mengatur baris dan *inner loop* mengatur kolom.

#### 2.2.1 Kode Program Java
Kode berikut sudah menggunakan karakter `#` sesuai modifikasi Pertanyaan 5.

```java
// File: Rectangle17.java
package week10;
import java.util.Scanner;
public class Rectangle17 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Masukkan jumlah baris: ");
 int baris = sc.nextInt();
 System.out.print("Masukkan jumlah kolom: ");
 int kolom = sc.nextInt();
 for (int i = 1; i <= baris; i++) {
 for (int j = 1; j <= kolom; j++) {
 System.out.print("*");
 }
 System.out.println("");
 }
 sc.close();
 }
}

```
Versi awal sebelum modifikasi menggunakan `System.out.print("*");` pada baris yang sama.

#### 2.2.2 Hasil Running / Screenshot Output
Input (baris, kolom) = (3, 6) dengan karakter `*` (versi awal):
```
******
******
******
```
Input (4, 2) dan (1, 5):
```
**        *****
**
**
**
```
(Output (4, 2) menjadi 4 baris berisi 2 karakter, sedangkan (1, 5) menjadi 1 baris berisi 5 karakter.)



#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Tentukan fungsi variabel `i` dan `j`.
  * **Jawab:** `i` adalah penghitung *outer loop* yang menyatakan nomor baris. `j` adalah penghitung *inner loop* yang menyatakan nomor kolom pada baris yang sedang dicetak.
* **Pertanyaan 2:** Berapa kali *outer loop*, *inner loop*, dan `print("*")` dijalankan untuk baris = 4 dan kolom = 7?
  * **Jawab:** *Outer loop* berjalan **4 kali**. *Inner loop* dimulai 4 kali, dan setiap mulai berjalan 7 iterasi, sehingga totalnya **28 iterasi**. Perintah `print("*")` dijalankan **28 kali** (4 × 7).
* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar? Gunakan baris = 3 dan kolom = 6.
  * **Jawab:** *Outer loop* berjalan 6 kali (batas `kolom`) dan *inner loop* 3 kali per baris (batas `baris`). Output menjadi 6 baris berisi 3 karakter, bukan 3 baris berisi 6 karakter. Bentuknya berubah (rotasi), tetapi jumlah total karakter tetap 18.
* **Pertanyaan 4:** Jelaskan akibat penghapusan `System.out.println();` setelah *inner loop*.
  * **Jawab:** Karakter tidak pindah ke baris baru, sehingga semua karakter tercetak dalam satu baris panjang. Contoh untuk (3, 6): `******************` (18 karakter), bukan persegi panjang.
* **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah `#`, lalu commit dan push.
  * **Jawab:** `System.out.print("*");` diganti `System.out.print("#");` (lihat kode 2.2.1). Perubahan sudah di-*commit* dan di-*push*.



---

### 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE

Kode awal sengaja dibuat salah. Tugasnya mengidentifikasi kesalahan dan memperbaikinya tanpa mengganti WHILE menjadi FOR.

#### 2.3.1 Kode Awal (Salah)
```java
int i = 0;
while (i <= n) {
    int j = 0;
    while (j < i) {
        System.out.print("*");
        j++;
    }
    i++;
}
```
Output aktual: n = 3 menghasilkan `******` (6 bintang dalam satu baris), n = 5 menghasilkan `***************` (15 bintang dalam satu baris). Output target adalah segitiga bertingkat.

#### 2.3.2 Hasil Debugging
Dengan baris debug `System.out.print("[i=" + i + "] ");` setelah `while (i <= n) {` dan n = 5:
```
[i=0] [i=1] *[i=2] **[i=3] ***[i=4] ****[i=5] *****
```
* *Outer loop* berjalan **6 kali** (i = 0 sampai 5), padahal baris yang diinginkan hanya 5.
* Saat `i = 0` tercetak **0** bintang.
* Semua karakter ada dalam satu baris karena tidak ada `println()`.

Perbaikan bertahap:
1. Menambahkan `System.out.println();` setelah *inner loop*, sebelum `i++`. Masih ada **baris kosong** di awal (saat `i = 0`).
2. Mengubah inisialisasi *outer loop* menjadi `int i = 1;` sehingga berjalan tepat n kali tanpa baris kosong.
3. Menghapus baris debug.

#### 2.3.3 Kode Program Java (Setelah Perbaikan + Segitiga Terbalik)
```java
// File: Triangle17.java
import java.util.Scanner;

public class Triangle17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga bertingkat
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Segitiga terbalik
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close();
    }
}
```

#### 2.3.4 Hasil Running / Screenshot Output
n = 5:
```
*
**
***
****
*****
*****
****
***
**
*
```



#### 2.3.5 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan.
  * **Jawab:** Ketidaksesuaian: (1) semua bintang tercetak dalam satu baris, dan (2) *outer loop* berjalan n + 1 kali sehingga ada iterasi kosong untuk `i = 0`. Perbaikan: (1) menambahkan `System.out.println();` setelah *inner loop*, dan (2) mengubah inisialisasi `i` dari 0 menjadi 1 agar *outer loop* berjalan tepat n kali.
* **Pertanyaan 2:** Jelaskan peran variabel `i` dan `j`. Mengapa `j` harus diinisialisasi kembali ke 0 pada setiap iterasi *outer loop*? Apa yang terjadi jika `j` tidak di-*reset*?
  * **Jawab:** `i` menyatakan nomor baris sekaligus jumlah bintang yang harus dicetak pada baris itu, sedangkan `j` menghitung bintang yang sudah dicetak pada baris tersebut. `j` harus di-*reset* ke 0 karena setiap baris baru mulai menghitung bintang dari awal. Jika tidak di-*reset*, `j` masih bernilai `i` dari baris sebelumnya, sehingga baris berikutnya hanya mencetak 1 bintang saja (karena `j < i` hanya benar sekali). Hasilnya bukan segitiga.
* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan update pada *outer loop* untuk segitiga terbalik.
  * **Jawab:** Inisialisasi diubah dari `i = 1` menjadi `i = n` (mulai dari baris terpanjang). Kondisi diubah dari `i <= n` menjadi `i >= 1`. Update diubah dari `i++` menjadi `i--` agar jumlah bintang berkurang setiap baris.

---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

Program menerima jumlah kelompok dan jumlah penilai, menghitung rata-rata nilai tiap kelompok, dan menentukan kelompok dengan rata-rata tertinggi. Struktur: **WHILE** (kelompok), **FOR** (penilai), **DO-WHILE** (validasi input nilai 0–100).

#### 2.4.1 Kode Program Java
```java
// File: NilaiKelompok17.java
package week10;

import java.util.Scanner;

public class NilaiKelompok17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();

        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");

        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("\nKelompok " + nomorKelompok);

                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;

                    do {
                        System.out.print("Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();

                        if (nilai < 0 || nilai > 100) {
                            System.out.println(
                                "Nilai harus 0-100. Ulangi input!"
                            );
                        }

                    } while (nilai < 0 || nilai > 100);

                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;

                System.out.println(
                    "Kelompok " + nomorKelompok
                    + ": nilai rata-rata = " + rataNilai
                );

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("\n==============================");
            System.out.println("Kelompok terbaik: " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi: " + rataTertinggi);
            System.out.println("==============================");
        }

        sc.close();
    }
}
```

#### 2.4.2 Hasil Running / Screenshot Output
```
Masukkan jumlah kelompok : 3
Masukkan jumlah penilai  : 2
Kelompok 1
  Nilai dari Penilai 1: 80
  Nilai dari Penilai 2: 90
Kelompok 1: nilai rata-rata = 85.0
Kelompok 2
  Nilai dari Penilai 1: 75
  Nilai dari Penilai 2: 105
  Nilai harus 0-100. Ulangi input!
  Nilai dari Penilai 2: 85
Kelompok 2: nilai rata-rata = 80.0
Kelompok 3
  Nilai dari Penilai 1: 90
  Nilai dari Penilai 2: 96
Kelompok 3: nilai rata-rata = 93.0
==============================
Kelompok terbaik    : 3
Rata-rata tertinggi : 93.0
```


#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa `totalNilai` perlu di-*reset* di dalam *outer loop*, tetapi `rataTertinggi` tidak boleh di-*reset*?
  * **Jawab:** `totalNilai` hanya berlaku untuk satu kelompok. Jika tidak di-*reset*, nilai kelompok sebelumnya ikut terjumlah dan rata-ratanya salah. `rataTertinggi` menyimpan rata-rata terbaik dari **seluruh** kelompok yang sudah diproses. Jika di-*reset* tiap kelompok, informasi kelompok terbaik sebelumnya hilang dan perbandingan menjadi tidak berarti.
* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input salah), berapa kali badan perulangan FOR dijalankan?
  * **Jawab:** **6 kali** (3 kelompok × 2 penilai).
* **Pertanyaan 3:** Apa yang terjadi jika `totalNilai` dideklarasikan `int` dan rata-rata dihitung dengan pembagian dua bilangan bulat? Berikan contoh nilai.
  * **Jawab:** Hasil pembagian dua `int` dipotong menjadi bilangan bulat (bagian desimal hilang). Contoh: nilai 80 dan 85, total 165, 165 / 2 = **82** (bukan 82.5). Rata-rata menjadi kurang akurat dan bisa memengaruhi penentuan kelompok terbaik.
* **Pertanyaan 4:** Mengapa `rataTertinggi` diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah bila nilai awalnya 0.
  * **Jawab:** Rata-rata terkecil yang mungkin adalah 0 (semua penilai memberi 0). Jika nilai awal 0, kondisi `rataNilai > rataTertinggi` (0 > 0) tidak pernah true untuk rata-rata 0, sehingga kelompok tidak tercatat. Contoh: 2 kelompok dengan semua nilai 0, hasilnya `Kelompok terbaik : 0` (kelompok tidak ada). Dengan -1, rata-rata 0 tetap lebih besar (0 > -1), sehingga kelompok pertama tercatat.
* **Pertanyaan 5:** Sebutkan masing-masing jenis perulangan beserta perannya.
  * **Jawab:**
    1. **WHILE (luar):** memproses kelompok satu per satu sampai `nomorKelompok > jumlahKelompok`.
    2. **FOR (tengah):** mengulang sebanyak `jumlahPenilai` untuk memasukkan dan menjumlahkan nilai setiap penilai.
    3. **DO-WHILE (dalam):** mengulang input nilai selama nilai di luar rentang 0–100, dan berjalan minimal sekali.

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Pola bilangan bertingkat
- [x] **Tugas 2:** Tabel perkalian n × n
- [x] **Tugas 3:** Rekap penjualan beberapa toko

### 3.1 Implementasi Kode Tugas 1

```java
// File: Tugas117.java

import java.util.Scanner;
public class Tugas117 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n,total=0;
        System.out.print("Masukkan nilai n :");
        n = sc.nextInt();
        int i=1;
        while(i<=n){
        int j=1;
            while(j<=i){
                System.out.print(j);
                total++;
                j++;
            }
        System.out.println();
        i++;
        }
        System.out.print("Total angka tercetak :"+total);
    }
}
```

#### Hasil Running / Screenshot Output
```
Masukkan nilai n = 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Total angka tercetak: 15
```


### 3.2 Implementasi Kode Tugas 2

```java
// File: Tugas217.java
import java.util.Scanner;
public class Tugas217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;
       do {
            System.out.print("Masukkan jumlah baris: ");
           n = sc.nextInt();
        } while (n <= 2);
        for (int i=1 ; i <= n ; i++){
            for(int j=1 ; j <= n ; j++){
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                total += hasil;
            }
            System.out.println("");
        }
         System.out.println("Jumlah Seluruh Angka : "+total);
    }
}
```

#### Hasil Running / Screenshot Output
```
Masukkan nilai n = 4
   1   2   3   4
   2   4   6   8
   3   6   9  12
   4   8  12  16
Jumlah seluruh angka: 100
```


### 3.3 Implementasi Kode Tugas 3

```java
// File: Tugas317.java
import java.util.Scanner;

public class Tugas317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;
            int tokoTerbanyak = 0;
            int barangTerbanyak = -1;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                int pelanggan;
                do {
                    System.out.print("Jumlah pelanggan Toko " + toko + ": ");
                    pelanggan = sc.nextInt();
                    if (pelanggan < 0) {
                        System.out.println("Tidak boleh negatif. Ulangi input!");
                    }
                } while (pelanggan < 0);

                int totalBarang = 0;
                for (int p = 1; p <= pelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarang += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + pelanggan
                        + ", total barang: " + totalBarang);

                totalSemua += totalBarang;
                if (totalBarang > barangTerbanyak) {   // '>' agar nomor toko terkecil dipilih saat sama
                    barangTerbanyak = totalBarang;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
```

#### Hasil Running / Screenshot Output
Data uji: Toko 1 dengan 2 pelanggan (3 dan 2 barang), Toko 2 dengan 3 pelanggan (1, 4, dan 2 barang).
```
Toko 1 - pelanggan: 2, total barang: 5
Toko 2 - pelanggan: 3, total barang: 7
Total barang seluruh toko: 12
Toko dengan barang terbanyak: 2
```


---

## 4: KESIMPULAN

Berdasarkan praktikum yang telah dilakukan, perulangan bersarang adalah perulangan di dalam perulangan, dengan *outer loop* mengatur tingkat yang lebih luas (misalnya baris, kelompok, atau toko) dan *inner loop* mengatur tingkat yang lebih rinci (misalnya kolom, penilai, atau pelanggan). Pada setiap iterasi *outer loop*, *inner loop* dijalankan dari awal sampai selesai, sehingga total iterasi adalah hasil kali jumlah iterasi kedua loop. Variabel penghitung *inner loop* harus di-*reset* di setiap iterasi *outer loop*, sedangkan variabel yang menyimpan hasil keseluruhan (seperti `rataTertinggi`) tidak boleh di-*reset*. Praktikum ini juga menunjukkan bahwa kombinasi FOR, WHILE, dan DO-WHILE dapat digunakan untuk pola bintang, validasi input, dan perhitungan rekapitulasi data.
