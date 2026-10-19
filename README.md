# Catatan & Materi Praktikum PBO 1 (Java)

Repositori ini berisi kumpulan kode program per pertemuan untuk mata kuliah **Pemrograman Berorientasi Objek 1 (PBO 1)** menggunakan bahasa Java, lengkap dengan penjelasan sederhana dan **Kisi-Kisi UTS (Pertemuan 10)**.

---

## Daftar Pertemuan & Navigasi Cepat

| Pertemuan | Topik Utama | File Program | Panduan Lengkap |
| :--- | :--- | :--- | :--- |
| **Pertemuan 3** | Input `Scanner`, Tipe Data (`String`, `double`), Operator Aritmatika (`+`, `-`, `*`, `/`) | [`pertemuan 3/Main.java`](./pertemuan%203/Main.java) | [Baca README Pertemuan 3](./pertemuan%203/README.md) |
| **Pertemuan 4** | Percabangan `if - else if` & Perhitungan Nilai Akhir Mahasiswa | [`pertemuan 4/Pertemuan5.java`](./pertemuan%204/Pertemuan5.java) | [Baca README Pertemuan 4](./pertemuan%204/README.md) |
| **Pertemuan 5** | Percabangan `switch-case` & *Nested Switch* (Simulasi Tiket Bioskop) | [`pertemuan 5/Main.java`](./pertemuan%205/Main.java) | [Baca README Pertemuan 5](./pertemuan%205/README.md) |
| **Pertemuan 8** | Perulangan (`do-while`, `for`) & Array 1 Dimensi (`String[]`) | [`pertemuan 8/Main.java`](./pertemuan%208/Main.java)<br>[`pertemuan 8/Students.java`](./pertemuan%208/Students.java) | [Baca README Pertemuan 8](./pertemuan%208/README.md) |
| **Pertemuan 10 (Kisi-Kisi UTS)** | **Konsep Dasar OOP: Class, Object, Attribute, dan Method** | [`pertemuan 10/Mahasiswa.java`](./pertemuan%2010/Mahasiswa.java)<br>[`pertemuan 10/Main.java`](./pertemuan%2010/Main.java) | [**Baca Kisi-Kisi UTS (Pertemuan 10)**](./pertemuan%2010/README.md) |

---

## Ringkasan Materi Setiap Pertemuan

### 1. [Pertemuan 3 — Input Dasar & Aritmatika](./pertemuan%203/README.md)
Belajar menerima input ketikan dari user menggunakan `Scanner` dan melakukan operasi hitung dasar.
- **Cara membuat Scanner:**
  ```java
  import java.util.Scanner;
  // di dalam main:
  Scanner masuk = new Scanner(System.in);
  ```
- **Fungsi Input:**
  - `masuk.nextLine()` $\rightarrow$ membaca teks (`String`)
  - `masuk.nextDouble()` $\rightarrow$ membaca angka desimal (`double`)
  - `masuk.nextInt()` $\rightarrow$ membaca angka bulat (`int`)
- **Penting:** Saat menjumlahkan angka di dalam `System.out.println`, gunakan tanda kurung `(angka1 + angka2)` agar angkanya dijumlahkan secara matematis, bukan digabung sebagai teks.

---

### 2. [Pertemuan 4 — Percabangan `if - else if`](./pertemuan%204/README.md)
Belajar menghitung nilai akhir berbobot (`30% Tugas + 30% UTS + 40% UAS`) dan mengonversinya menjadi nilai huruf (**A, B, C, D**).
- Pengecekan dilakukan berurutan dari batas tertinggi (`>= 80`) ke terendah (`>= 0`).
- Jika satu kondisi `if` atau `else if` sudah terpenuhi, kondisi di bawahnya otomatis dilewati.

---

### 3. [Pertemuan 5 — Percabangan `switch-case` & Nested Switch](./pertemuan%205/README.md)
Belajar membuat menu pilihan (pemesanan tiket film & ukuran popcorn) menggunakan `switch-case`.
- Cocok dipakai saat pilihan berupa nilai yang spesifik (misal judul film atau `"yes"`/`"no"`).
- **Wajib** menyertakan `break;` di akhir setiap `case` agar eksekusi tidak bocor ke `case` berikutnya.
- `default:` berfungsi menangani kondisi jika pilihan user tidak ada yang cocok.
- **Nested Switch:** Kita bisa menaruh `switch` di dalam `case` milik `switch` lainnya (contoh: memilih ukuran popcorn hanya jika user menjawab `"yes"`).

---

### 4. [Pertemuan 8 — Looping (`do-while`, `for`) & Array](./pertemuan%208/README.md)
Belajar mengulang jalannya program dan menyimpan banyak data ke dalam satu variabel Array.
- **`do-while` ([`Main.java`](./pertemuan%208/Main.java)):** Menjalankan kode minimal **1 kali**, lalu mengecek kondisi di akhir (`while (jawab.equalsIgnoreCase("ya"));`).
- **Array & `for` ([`Students.java`](./pertemuan%208/Students.java)):**
  - Membuat array: `String[] namaMahasiswa = new String[jumlah];`
  - Indeks array selalu dimulai dari `0` hingga `jumlah - 1`.
  - **Tips Penting:** Selalu tambahkan `input.nextLine();` kosong tepat setelah `input.nextInt();` untuk membuang sisa karakter *Enter*, supaya input teks berikutnya tidak terlewat (*skip*).

---

## FOKUS UTAMA: Pertemuan 10 (Kisi-Kisi UTS)

> Panduan super lengkap dan latihan variasi soal UTS juga tersedia di [**`pertemuan 10/README.md`**](./pertemuan%2010/README.md).

Pada **Pertemuan 10**, kita beralih dari pemrograman prosedural (semua kode di satu file) ke **Pemrograman Berorientasi Objek (OOP)** dengan membagi program menjadi 2 bagian:

### 1. Konsep Inti (Mudah Diingat)
- **Class ([`Mahasiswa.java`](./pertemuan%2010/Mahasiswa.java))** = **Cetakan / Formulir Kosong**.
  Berisi:
  1. **Atribut (Data/Variabel):** `String nama;`, `String nim;`, `int nilai;`
  2. **Method (Fungsi/Aksi):** `void tampilkanData() { ... }`
- **Object (`mhs` di [`Main.java`](./pertemuan%2010/Main.java))** = **Hasil Cetakan Nyata** yang dibuat dari Class untuk diisi data.

### 2. Struktur Kode yang Wajib Dihafal di Luar Kepala

#### A. Membuat Class Cetakan (`Mahasiswa.java`)
```java
public class Mahasiswa {
     // 1. Deklarasi Atribut
     String nama;
     String nim;
     int nilai;

     // 2. Deklarasi Method
     void tampilkanData() {
          System.out.println("Nama: " + nama);
          System.out.println("NIM: " + nim);
          System.out.println("Nilai: " + nilai);
     }
}
```

#### B. Membuat Object & Memanggilnya di `Main.java`
```java
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          // 1. Buat Object dari class Mahasiswa
          Mahasiswa mhs = new Mahasiswa();

          // 2. Isi atribut object menggunakan tanda titik (.)
          System.out.println("Masukkan nama: ");
          mhs.nama = input.nextLine();

          System.out.println("Masukkan NIM: ");
          mhs.nim = input.nextLine();

          System.out.println("Masukkan nilai: ");
          mhs.nilai = input.nextInt();

          // 3. Panggil method milik object menggunakan tanda titik (.)
          mhs.tampilkanData();
     }
}
```

### 3. Pola Soal UTS yang Sering Keluar
Biasanya soal UTS meminta kamu membuat **2 file seperti Pertemuan 10** (`NamaClass.java` dan `Main.java`), lalu di dalam method `tampilkanData()` ditambahkan logika dari pertemuan sebelumnya:
1. **Ditambah Operasi Hitung (Pertemuan 3 & 4):** Misalnya menghitung `nilaiAkhir` dari `nilaiTugas`, `nilaiUTS`, `nilaiUAS`, atau menghitung `totalHarga = harga * jumlah`.
2. **Ditambah `if - else if` (Pertemuan 4):** Misalnya menentukan Grade (`A`/`B`/`C`/`D`) atau keterangan `"Lulus"` / `"Tidak Lulus"` di dalam method `tampilkanData()`.
3. **Ditambah `switch-case` (Pertemuan 5):** Misalnya menentukan harga barang/tiket berdasarkan kode atau nama menu yang dipilih.
4. **Ditambah `do-while` (Pertemuan 8):** Membungkus pembuatan object & input di `Main.java` dengan `do { ... } while (ulang.equalsIgnoreCase("ya"));` agar program bisa diulang.

*(Contoh kode lengkap untuk masing-masing variasi soal UTS di atas bisa dilihat langsung di [**README Pertemuan 10**](./pertemuan%2010/README.md)).*
