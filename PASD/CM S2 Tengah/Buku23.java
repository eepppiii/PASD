public class Buku23 {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku23(String kode, String judul, int tahunTerbit) {
        this.kodeBuku    = kode;
        this.judul       = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
