# Pertemuan 8: Perulangan (`do-while` & `for`) dan Array

Folder ini berisi dua program penting yang membahas cara **mengulang eksekusi program** (*looping*) dan cara **menyimpan banyak data sekaligus** menggunakan **Array**.

## File
1. [`Main.java`](./Main.java) — Perulangan `do-while`
2. [`Students.java`](./Students.java) — Array 1 Dimensi & Perulangan `for`

---

## 1. Perulangan `do-while` (`Main.java`)

### Konsep
`do-while` akan menjalankan isi program **minimal 1 kali terlebih dahulu**, baru kemudian mengecek apakah pengguna ingin mengulang atau tidak.

```java
do {
    System.out.println("Programm....");
    System.out.println("Apakah ingin mengulang progam: ");
    jawab = masuk.nextLine();
} while (jawab.equalsIgnoreCase("ya"));
```

### Poin Penting
- **`jawab.equalsIgnoreCase("ya")`**: Membandingkan teks tanpa peduli huruf besar/kecil. Jadi baik pengguna mengetik `"ya"`, `"Ya"`, maupun `"YA"`, perulangan tetap berjalan.
- Jika pengguna mengetik selain `"ya"` (misal `"tidak"`), perulangan berhenti.

---

## 2. Array & Perulangan `for` (`Students.java`)

### Konsep Array
Jika ingin menyimpan data banyak mahasiswa, kita tidak perlu membuat variabel `nama1, nama2, nama3`. Kita cukup membuat **Array**:
```java
String[] namaMahasiswa = new String[jumlah];
String[] nim = new String[jumlah];
String[] umur = new String[jumlah];
String[] tglLahir = new String[jumlah];
```

### Jebakan `nextInt()` Sebelum `nextLine()` (Sangat Penting!)
Perhatikan baris 8–9 pada `Students.java`:
```java
int jumlah = input.nextInt();
input.nextLine(); // <-- WAJIB ADA!
```
**Kenapa harus ada `input.nextLine()` kosong setelah `input.nextInt()`?**
Karena saat kita mengetik angka lalu menekan **Enter**, `nextInt()` hanya mengambil angkanya saja dan menyisakan karakter *Enter* di memori. `input.nextLine()` tambahan berfungsi membuang sisa *Enter* tersebut agar input nama pertama tidak terlewat (*skip*).

### Mengisi & Menampilkan Array dengan `for`
Indeks array di Java **selalu dimulai dari `0`** sampai `jumlah - 1`:
```java
// 1. Loop untuk mengisi data ke dalam array
for (int i = 0; i < jumlah; i++) {
    System.out.println("Masukan nama ke " + (i + 1));
    namaMahasiswa[i] = input.nextLine();
    // ...
}

// 2. Loop untuk menampilkan kembali semua data
for (int i = 0; i < jumlah; i++) {
    System.out.println("Nama " + namaMahasiswa[i]);
    // ...
}
```

---

## Cara Menjalankan Program
```bash
# Menjalankan contoh do-while
javac Main.java
java Main

# Menjalankan contoh Array mahasiswa
javac Students.java
java Students
```

