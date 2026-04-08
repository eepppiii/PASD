public class Mahasiswa23 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tmapilkanInforamasi() {
        System.out.println("Nama :" + nama);
        System.out.println("Nim :" + nim);
        System.out.println("IPK :" + ipk);
        System.out.println("Kelas :" + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKerja() {
        if (ipk >= 3.5) {
            return "Kerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }

    public Mahasiswa23() {

    }

    public Mahasiswa23(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}
