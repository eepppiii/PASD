public class Dosen23 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tmapilkanInforamasi() {
        System.out.println("id Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status == true) {
            System.out.println("Status Aktif");
        } else {
            System.out.println("Status Tidak Aktif");
        }
    }

    void hitungMasaKerja(int thnSkrng) {
        thnSkrng -= tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
