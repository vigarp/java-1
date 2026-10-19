# Pertemuan 4: Percabangan `if - else if` & Perhitungan Nilai Akhir

Folder ini membahas cara menghitung nilai akhir mahasiswa berdasarkan persentase bobot nilai, lalu menentukan **Grade Huruf (A, B, C, D)** menggunakan percabangan `if - else if`.

## File
- [`Pertemuan5.java`](./Pertemuan5.java)

---

## Konsep yang Dipelajari

### 1. Membaca Input Angka Bulat (`nextInt()`)
Selain membaca `nama` dan `nim` menggunakan `nextLine()`, program membaca nilai angka bulat (`int`) menggunakan:
```java
int nilaiTugas = masuk.nextInt();
int nilaiUTS = masuk.nextInt();
int nilaiUAS = masuk.nextInt();
```

### 2. Rumus Pembobotan Nilai Akhir
Nilai akhir dihitung dengan pembobotan:
- **Tugas:** 30%
- **UTS:** 30%
- **UAS:** 40%

```java
int nilaiAkhir = (30 * nilaiTugas + 30 * nilaiUTS + 40 * nilaiUAS) / 100;
```

### 3. Percabangan `if - else if`
Digunakan ketika ada **banyak kondisi berjenjang**. Java akan mengecek kondisi dari atas ke bawah. Begitu ada **satu** kondisi yang bernilai benar (`true`), blok tersebut dijalankan dan sisanya dilewati.

| Kondisi `nilaiAkhir` | Grade yang Didapat |
| :--- | :---: |
| `>= 80` | **A** |
| `>= 65` (65 s/d 79) | **B** |
| `>= 40` (40 s/d 64) | **C** |
| `>= 0` (0 s/d 39) | **D** |

```java
if (nilaiAkhir >= 80) {
    System.out.println("Selamat nilai Anda A");
} else if (nilaiAkhir >= 65) {
    System.out.println("Selamat nilai Anda B");
} else if (nilaiAkhir >= 40) {
    System.out.println("Selamat nilai Anda C");
} else if (nilaiAkhir >= 0) {
    System.out.println("Selamat nilai Anda D");
}
```

---

## Cara Menjalankan Program
```bash
javac Pertemuan5.java
java Pertemuan5
```

