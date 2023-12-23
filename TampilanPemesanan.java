// TampilanPemesanan.java
import java.util.HashMap;
import java.util.Map;

public class TampilanPemesanan {
    // Map untuk menyimpan harga kategori tiket
    private static final Map<String, Integer> HARGA_KATEGORI_TIKET = new HashMap<>();

    // Inisialisasi harga kategori tiket pada blok statis
    static {
        HARGA_KATEGORI_TIKET.put("reguler", 50000);
        HARGA_KATEGORI_TIKET.put("vip", 100000);
        HARGA_KATEGORI_TIKET.put("vvip", 150000);
    }

    // Metode untuk menampilkan daftar pertandingan
    public static void tampilkanDaftarPertandingan() {
        System.out.println("Daftar Pertandingan Sepak Bola:");
        System.out.println("a. Real Madrid vs Barcelona");
        System.out.println("b. Juventus vs AC Milan");
        System.out.println("c. Persib vs Persija");
        System.out.println("d. Persebaya vs Arema");
        
    }

    // Metode untuk menampilkan daftar kategori tiket beserta harga
    public static void tampilkanDaftarKategoriTiket() {
        System.out.println("Daftar Kategori Tiket beserta Harga:");
        System.out.println("1. Reguler (Rp 50.000)");
        System.out.println("2. VIP (Rp 100.000)");
        System.out.println("3. VVIP (Rp 150.000)");
    }

    // Metode untuk mendapatkan harga berdasarkan kategori tiket
    public static int getHargaKategoriTiket(String kategori) {
        // Menggunakan metode getOrDefault untuk menghindari NullPointerException
        return HARGA_KATEGORI_TIKET.getOrDefault(kategori, 0);
    }
}
