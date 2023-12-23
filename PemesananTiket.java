// PemesananTiket.java
public class PemesananTiket {
    private TiketSepakBola[] keranjang;

    // Konstruktor untuk membuat objek PemesananTiket dengan kapasitas keranjang
    // tertentu
    public PemesananTiket(int kapasitasKeranjang) {
        keranjang = new TiketSepakBola[kapasitasKeranjang];
    }

    // Metode untuk menambahkan tiket ke dalam keranjang
    public void tambahTiket(TiketSepakBola tiket) {
        for (int i = 0; i < keranjang.length; i++) {
            if (keranjang[i] == null) {
                keranjang[i] = tiket;
                break;
            }
        }
    }

    // Metode untuk menampilkan detail pemesanan tiket
    public void tampilkanPemesanan() {
        System.out.println("========Detail Pemesanan Tiket========");
        for (TiketSepakBola tiket : keranjang) {
            if (tiket != null) {
                System.out.println("Pertandingan: " + tiket.getPertandingan());
                System.out.println("Kategori: " + tiket.getKategori());
                System.out.println("Jumlah: " + tiket.getJumlah());
                System.out.println("Harga: " + tiket.getHarga());
                System.out.println("Total Harga: " + tiket.hitungTotalHarga());
                System.out.println("====================================");
            }
        }
    }

    // Metode untuk menghitung total harga dari seluruh pemesanan tiket
    public int hitungTotalHargaPemesanan() {
        int totalHarga = 0;
        for (TiketSepakBola tiket : keranjang) {
            if (tiket != null) {
                totalHarga += tiket.hitungTotalHarga();
            }
        }
        return totalHarga;
    }
}
