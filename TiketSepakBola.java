// TiketSepakBola.java
public class TiketSepakBola {
    // Deklarasi variabel instance (atribut) yang akan digunakan untuk menyimpan informasi tiket
    private String pertandingan;
    private String kategori;
    private int jumlah;
    private int harga;

    // Konstruktor untuk membuat objek TiketSepakBola dengan nilai awal
    public TiketSepakBola(String pertandingan, String kategori, int jumlah, int harga) {
        // Menginisialisasi nilai atribut berdasarkan nilai yang diterima sebagai parameter konstruktor
        this.pertandingan = pertandingan;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Metode getter untuk mendapatkan nilai dari atribut pertandingan
    public String getPertandingan() {
        return pertandingan;
    }

    // Metode getter untuk mendapatkan nilai dari atribut kategori
    public String getKategori() {
        return kategori;
    }

    // Metode getter untuk mendapatkan nilai dari atribut jumlah
    public int getJumlah() {
        return jumlah;
    }

    // Metode getter untuk mendapatkan nilai dari atribut harga
    public int getHarga() {
        return harga;
    }

    // Metode untuk menghitung total harga tiket berdasarkan jumlah dan harga per tiket
    public int hitungTotalHarga() {
        return jumlah * harga;
    }
}
