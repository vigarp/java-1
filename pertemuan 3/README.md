# Pertemuan 3: Input Dasar (`Scanner`) & Operator Aritmatika

Folder ini berisi materi dasar Java untuk **membaca input dari pengguna** menggunakan `Scanner` dan melakukan **operasi matematika dasar** (tambah, kurang, kali, bagi).

## File
- [`Main.java`](./Main.java)

---

## Konsep yang Dipelajari

### 1. Membaca Input dengan `Scanner`
Agar program bisa menerima ketikan dari pengguna di terminal, kita wajib:
1. Mengimpor library `Scanner` di baris paling atas:
   ```java
   import java.util.Scanner;
   ```
2. Membuat objek `Scanner` di dalam `main`:
   ```java
   Scanner masuk = new Scanner(System.in);
   ```

### 2. Perbedaan `nextLine()` dan `nextDouble()`
| Perintah | Kegunaan | Tipe Data | Contoh Input |
| :--- | :--- | :--- | :--- |
| `masuk.nextLine()` | Membaca satu baris teks (bisa ada spasi) | `String` | `"Budi Santoso"`, `"TI-2A"` |
| `masuk.nextDouble()` | Membaca angka desimal maupun bulat | `double` | `10`, `25.5` |

### 3. Operator Aritmatika Dasar
Di bagian akhir program, dua angka (`angka1` dan `angka2`) dihitung menggunakan:
- `+` : Pertambahan (`angka1 + angka2`)
- `-` : Pengurangan (`angka1 - angka2`)
- `*` : Perkalian (`angka1 * angka2`)
- `/` : Pembagian (`angka1 / angka2`)

> **Tips Penting:**
> Perhatikan penggunaan tanda kurung pada `(angka1 + angka2)` di dalam `System.out.println(...)`:
> ```java
> System.out.println("Hasil pertambahan ... adalah " + (angka1 + angka2));
> ```
> Jika **tidak** diberi tanda kurung, Java akan menganggap tanda `+` sebagai penggabung teks (*String Concatenation*), bukan penjumlahan matematika.

---

## Cara Menjalankan Program
```bash
javac Main.java
java Main
```

