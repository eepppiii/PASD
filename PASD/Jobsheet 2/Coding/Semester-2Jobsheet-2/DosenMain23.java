public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen = new Dosen23();
        dosen.idDosen = "2241720171";
        dosen.nama = "Muhammad Ali Farhan";
        dosen.setStatusAktif(false);;
        dosen.tahunBergabung = 2025;
        dosen.bidangKeahlian = "Mesin";
        dosen.ubahKeahlian("electro");
        dosen.tmapilkanInforamasi();
    }
}
