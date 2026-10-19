# Pertemuan 5: Percabangan `switch-case` & Nested Switch

Folder ini berisi studi kasus **pemesanan tiket bioskop dan popcorn** menggunakan struktur percabangan `switch-case` serta `switch` bersarang (*nested switch*).

## File
- [`Main.java`](./Main.java)

---

## Konsep yang Dipelajari

### 1. Kapan Menggunakan `switch-case`?
`switch-case` sangat cocok digunakan untuk mengecek pilihan yang nilainya **pasti/spesifik** (misalnya memilih menu teks `"Avengers Doomsday"`, `"yes"`, `"large"`), dibanding menggunakan banyak `if-else`.

Struktur dasarnya:
```java
switch (film) {
    case "Avengers Doomsday":
        hargaTiket = 70000;
        break;
    case "Laut Bercerita":
        hargaTiket = 50000;
        break;
    case "Avengers Endgame":
        hargaTiket = 40000;
        break;
    default:
        System.out.println("Salah masukkan judul film");
}
```

### 2. Fungsi `break` dan `default`
- **`break;`**: Menghentikan pengecekan di dalam `switch`. Jika lupa menulis `break;`, program akan lanjut mengeksekusi `case` di bawahnya (*fall-through*).
- **`default:`**: Dijalankan jika input pengguna **tidak cocok** dengan `case` mana pun (mirip seperti `else` pada `if-else`).

### 3. Nested Switch (`switch` di dalam `switch`)
Pada program ini, setelah memilih film, pengguna ditanya apakah ingin membeli popcorn (`yes`/`no`):
1. **`switch (popCorn)` (Luar)**: Mengecek apakah pengguna menjawab `"yes"`.
2. **`switch (popCornSize)` (Dalam)**: Hanya dijalankan jika pengguna menjawab `"yes"`, untuk memilih ukuran `"large"`, `"medium"`, atau `"small"`.

Di akhir program, total biaya dihitung dari:
```java
harga = hargaTiket + hargaPopcorn;
```

---

## Cara Menjalankan Program
```bash
javac Main.java
java Main
```

