import java.util.Scanner;

// MainProgram.java
public class FootballTickets {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan pesan selamat datang
        System.out.println("============================================");
        System.out.println("Selamat datang di Pemesanan Tiket Sepak Bola!");

        // Membuat objek PemesananTiket dengan kapasitas 5 tiket
        PemesananTiket pemesananTiket = new PemesananTiket(5);

        // Menampilkan daftar pertandingan sepak bola yang tersedia
        TampilanPemesanan.tampilkanDaftarPertandingan();

        // Menggunakan loop do-while untuk memungkinkan pengguna memesan tiket
        do {
            // Meminta pengguna memilih pertandingan sepak bola
            System.out.println("Pilih pertandingan (a/b/c/d): ");
            String pilihanPertandingan = input.nextLine();
            // Mendapatkan nama pertandingan berdasarkan pilihan pengguna
            String pertandingan = getPertandinganByPilihan(pilihanPertandingan);

            // Menampilkan daftar kategori tiket beserta harganya
            TampilanPemesanan.tampilkanDaftarKategoriTiket();
            // Meminta pengguna memilih kategori tiket
            System.out.println("Pilih kategori tiket (1/2/3): ");
            String pilihanKategori = input.nextLine();
            // Mendapatkan nama kategori tiket berdasarkan pilihan pengguna
            String kategori = getKategoriByPilihan(pilihanKategori);
            // Mendapatkan harga kategori tiket
            int harga = TampilanPemesanan.getHargaKategoriTiket(kategori);

            // Meminta pengguna memasukkan jumlah tiket yang ingin dipesan
            System.out.println("Masukkan jumlah tiket: ");
            int jumlah = input.nextInt();
            input.nextLine(); // Membersihkan buffer input

            // Membuat objek TiketSepakBola berdasarkan pilihan pengguna
            TiketSepakBola tiket = new TiketSepakBola(pertandingan, kategori, jumlah, harga);

            // Menambahkan tiket ke dalam pemesanan tiket
            pemesananTiket.tambahTiket(tiket);

            // Menanyakan kepada pengguna apakah ingin menambah tiket lagi
            System.out.println("Apakah Anda ingin menambah tiket lagi? (ya/tidak)");
        } while (input.nextLine().equalsIgnoreCase("ya"));

        // Menampilkan detail pemesanan tiket
        pemesananTiket.tampilkanPemesanan();

        // Menampilkan total harga pemesanan tiket
        System.out.println("Total Harga Pemesanan Tiket: " + pemesananTiket.hitungTotalHargaPemesanan());

        // Menampilkan pesan terima kasih
        System.out.println("Terima kasih telah memmesan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // Method untuk mendapatkan nama pertandingan berdasarkan pilihan pengguna
    private static String getPertandinganByPilihan(String pilihan) {
        switch (pilihan.toLowerCase()) {
            case "a":
                return "Real Madrid vs Barcelona";
            case "b":
                return "Juventus vs AC Milan";
            case "c":
                return "Persib vs Persija";
            case "d":
                return "Persebaya vs Arema";
            default:
                return "Pertandingan tidak valid";
        }
    }

    // Method untuk mendapatkan nama kategori tiket berdasarkan pilihan pengguna
    private static String getKategoriByPilihan(String pilihan) {
        switch (pilihan) {
            case "1":
                return "reguler";
            case "2":
                return "vip";
            case "3":
                return "vvip";
            default:
                return "Kategori tidak valid";

        }
    }
}
