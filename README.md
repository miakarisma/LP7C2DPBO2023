# LP7C2DPBO2023
## Janji
Saya Mia Karisma Haq NIM [2102165] mengerjakan soal Latihan Praktikum-7 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
## Deskripsi Program
Modifikasi kode yang sudah diberikan, dengan ketentuan sebagai berikut:
- Pemain mengendalikan bola. Setiap kali bola bergerak, skor pemain bertambah +1.
- Skor hanya bertambah jika pemain berbelok, bukan bergerak berurutan. Detail:
  * Saat pertama kali membuka program, pemain bergerak ke arah manapun, skor +1.
  * Setelah pemain bergerak, dia harus bergerak ke arah lain agar skornya +1. Jika menekan tombol yang sama, skor tetap (+0).
  <br>Contoh, pemain membuka program, lalu bergerak ke kanan dan berhenti, maka skor bertambah +1. Jika pemain bergerak ke arah atas, bawah, atau kiri, maka skor bertambah +1. Namun, jika pemain bergerak ke kanan lagi, maka skor +0.
  <br>Bagaimana jika urutannya, kanan - atas - kiri - kanan? Kanan yang kedua tetap +1, karena pergerakan pemain sebelumnya adalah kiri, sehingga tidak dianggap berurutan.
- [BONUS] Buatlah sistem game yang menambahkan satu kotak atau objek apapun secara acak. Jika pemain menyentuh objek tersebut, skor bertambah +5 atau +10, lalu objek akan berpindah lagi ke posisi lain secara acak.
## Desain Program
Program terdiri dari 9 kelas, diantaranya yaitu :
1. Kelas Controller -> Memiliki kelas Game dan kelas Handler
2. Kelas Display -> Menampilkan game ke layar (mengatur tampilan)
3. Kelas Game -> Memiliki kelas Display dan kelas Handler
4. Kelas GameInterface -> Memastikan semua fungsi pada kelas tersebut diimplementasikan pada kelas lain
5. Kelas GameObject -> Menampung semua atribut objek yang terdapat pada game
6. Kelas Handler -> Penampung semua objek yang akan ditampilkan pada layar
7. Kelas Obstacle -> Subclass dari GameObject, mewarisi semua method dan atribut dari GameObject
8. Kelas Player -> Subclass dari GameObject, mewarisi semua method dan atribut dari GameObject
9. Kelas Synchronization -> Program utama untuk memulai/menjalankan game
## Alur Program
Pertama akan terdapat 2 objek yang ditampilkan di layar, yaitu objek pemain yang direpresentasikan dengan bentuk lingkaran dan objek rintangan yang direpresentasikan dengan bentuk persegi. Setiap kali user menggerakan objek pemain untuk berbelok, maka skor akan terus bertambah, dan apabila objek pemain menyentuh objek rintangan, maka objek rintangan akan berpindah posisi dan skor objek pemain bertambah 5.
## Dokumentasi
https://user-images.githubusercontent.com/100817609/233971625-7837dfab-fa85-46f7-bbd1-9451741ebe14.mp4
