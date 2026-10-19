# Pertemuan 10: Class, Object, Attribute & Method (Fokus Kisi-Kisi UTS)

Selamat datang di materi paling penting untuk **UTS Pemrograman Berorientasi Objek (PBO)**!
Pada pertemuan sebelumnya (Pertemuan 3–8), semua kode ditulis menumpuk di dalam satu file `Main.java`. Di **Pertemuan 10**, kita mulai memisahkan kode menggunakan konsep **OOP (Object-Oriented Programming)**: membagi program menjadi **Class Blueprint (`Mahasiswa.java`)** dan **Class Utama (`Main.java`)**.

---

## Daftar File
1. [`Mahasiswa.java`](./Mahasiswa.java) — **Class Blueprint** (berisi atribut/data dan method/fungsi)
2. [`Main.java`](./Main.java) — **Class Utama** (berisi `public static void main` untuk membuat Object dan menerima input `Scanner`)

---

## 1. Memahami Konsep OOP dengan Analogi Sederhana

Bayangkan kamu sedang mencetak **Kartu Tanda Mahasiswa (KTM)**:

| Istilah OOP | Analogi Sederhana | Di Kode Program Kita |
| :--- | :--- | :--- |
| **Class** | **Desain/Cetakan Formulir Kosong** (belum ada isinya, baru menentukan kolom apa saja yang ada) | `public class Mahasiswa` di [`Mahasiswa.java`](./Mahasiswa.java) |
| **Attribute** | **Kolom data** di dalam formulir tersebut (Nama, NIM, Nilai) | `String nama;`, `String nim;`, `int nilai;` |
| **Method** | **Kemampuan/Aksi** yang bisa dilakukan oleh class tersebut | `void tampilkanData() { ... }` |
| **Object** | **Formulir nyata** hasil cetakan yang sudah siap diisi data milik seseorang | `Mahasiswa mhs = new Mahasiswa();` di [`Main.java`](./Main.java) |

---

## 2. Bedah Kode Baris demi Baris

### A. File Pertama: `Mahasiswa.java` (Cetakan / Class)
File ini **tidak memiliki** `public static void main`, karena tugasnya hanya sebagai cetakan.

```java
public class Mahasiswa {
     // 1. ATRIBUT (Variabel milik class)
     String nama;
     String nim;
     int nilai;

     // 2. METHOD (Perilaku / Fungsi untuk menampilkan data)
     void tampilkanData() {
          System.out.println("Nama: " + nama);
          System.out.println("NIM: " + nim);
          System.out.println("Nilai: " + nilai);
     }
}
```
**Penjelasan Mudah:**
- `String nama;`, `String nim;`, `int nilai;` disebut **Atribut**. Setiap object `Mahasiswa` yang dibuat nanti otomatis punya 3 wadah data ini.
- `void tampilkanData()` disebut **Method**. Kata `void` artinya method ini hanya menjalankan perintah (menampilkan teks ke layar) dan tidak mengembalikan nilai angka/data.

---

### B. File Kedua: `Main.java` (Program Utama)
File ini adalah tempat program dijalankan karena memiliki `public static void main(String[] args)`.

```java
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          // LANGKAH 1: Membuat Object dari class Mahasiswa
          Mahasiswa mhs = new Mahasiswa();

          // LANGKAH 2: Mengisi atribut object dengan tanda titik (.)
          System.out.println("Masukkan nama: ");
          mhs.nama = input.nextLine();

          System.out.println("Masukkan NIM: ");
          mhs.nim = input.nextLine();

          System.out.println("Masukkan nilai: ");
          mhs.nilai = input.nextInt();

          // LANGKAH 3: Memanggil method milik object
          mhs.tampilkanData();
     }
}
```

**3 Langkah Utama yang WAJIB Dihafal untuk UTS:**
1. **Membuat Object (Instansiasi):**
   ```java
   NamaClass namaObjek = new NamaClass();
   // Contoh:
   Mahasiswa mhs = new Mahasiswa();
   ```
2. **Mengisi / Mengakses Atribut (Gunakan tanda titik `.`):**
   ```java
   namaObjek.namaAtribut = nilai;
   // Contoh:
   mhs.nama = input.nextLine();
   mhs.nilai = input.nextInt();
   ```
3. **Memanggil Method (Gunakan tanda titik `.` dan kurung `()`):**
   ```java
   namaObjek.namaMethod();
   // Contoh:
   mhs.tampilkanData();
   ```

---

## 3. Simulasi & Prediksi Pengembangan Soal UTS

Saat UTS, dosen biasanya mengambil kerangka **Pertemuan 10 (Class & Object)** lalu meminta kamu **menggabungkannya** dengan materi Pertemuan 3, 4, 5, atau 8. Berikut adalah 3 variasi soal UTS yang paling sering keluar beserta contekannya:

### Variasi UTS 1: Class + Hitung Nilai Akhir & Grade `if-else` (Gabungan Pertemuan 4 & 10)
**Soal:** *"Buatlah class Mahasiswa yang dapat menghitung nilai akhir (30% Tugas, 30% UTS, 40% UAS) dan menentukan Grade (A/B/C/D)!"*

```java
// Di dalam Mahasiswa.java
public class Mahasiswa {
    String nama, nim;
    int nilaiTugas, nilaiUTS, nilaiUAS;

    void tampilkanData() {
        int nilaiAkhir = (30 * nilaiTugas + 30 * nilaiUTS + 40 * nilaiUAS) / 100;

        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Nilai Akhir : " + nilaiAkhir);

        if (nilaiAkhir >= 80) {
            System.out.println("Grade       : A");
        } else if (nilaiAkhir >= 65) {
            System.out.println("Grade       : B");
        } else if (nilaiAkhir >= 40) {
            System.out.println("Grade       : C");
        } else {
            System.out.println("Grade       : D");
        }
    }
}
```

---

### Variasi UTS 2: Studi Kasus Kasir / Tiket dengan Class (Gabungan Pertemuan 5 & 10)
**Soal:** *"Buatlah class Pesanan / Barang yang menyimpan nama barang, harga, dan jumlah beli, lalu tampilkan total harganya!"*

```java
// Pesanan.java
public class Pesanan {
    String namaBarang;
    int harga;
    int jumlah;

    void cetakStruk() {
        int total = harga * jumlah;
        System.out.println("Barang : " + namaBarang);
        System.out.println("Total  : Rp " + total);
    }
}
```

---

### Variasi UTS 3: Mengulang Input Object dengan `do-while` (Gabungan Pertemuan 8 & 10)
**Soal:** *"Buat agar program input Mahasiswa bisa diulang terus selama user menjawab 'ya'!"*

```java
// Di dalam Main.java
Scanner input = new Scanner(System.in);
String ulang;

do {
    Mahasiswa mhs = new Mahasiswa();

    System.out.println("Masukkan nama: ");
    mhs.nama = input.nextLine();

    System.out.println("Masukkan NIM: ");
    mhs.nim = input.nextLine();

    System.out.println("Masukkan nilai: ");
    mhs.nilai = input.nextInt();
    input.nextLine(); // Buang sisa Enter setelah nextInt()!

    mhs.tampilkanData();

    System.out.println("Apakah ingin mengulang? (ya/tidak): ");
    ulang = input.nextLine();
} while (ulang.equalsIgnoreCase("ya"));
```

---

## 4. Checklist Anti-Error Saat UTS

Sebelum mengumpulkan kode UTS, pastikan cek 5 hal ini:
1. **Nama File = Nama Class**: Jika nama class `public class Mahasiswa`, maka nama filenya **wajib** `Mahasiswa.java` (huruf besar/kecilnya harus sama persis).
2. **Jangan lupa `import java.util.Scanner;`** di baris paling atas file yang memakai `Scanner`.
3. **Waspada `nextInt()` bertemu `nextLine()`**: Jika setelah `input.nextInt()` kamu masih mau memakai `input.nextLine()`, tambahkan satu baris `input.nextLine();` kosong di tengahnya agar tidak ke-skip.
4. **Satu Folder yang Sama**: Pastikan `Main.java` dan `Mahasiswa.java` berada di dalam folder yang sama agar `Main` langsung mengenali `Mahasiswa`.
5. **Cara Compile & Run**:
   ```bash
   javac Mahasiswa.java Main.java
   java Main
   ```

