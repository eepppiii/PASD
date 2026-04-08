public class buku23 {
    String kodeBuku;
    String judul;
    String penulis;
    boolean statusPeminjaman;

    public buku23(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.statusPeminjaman = false;
    }

    public void tampilinfo() {
        System.out.println(kodeBuku + judul + penulis + "Status :" +
                (statusPeminjaman ? "dipanjam" : "tersedia"));
    }
}