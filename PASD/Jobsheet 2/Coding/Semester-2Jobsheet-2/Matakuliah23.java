public class Matakuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jmlhjam;

    void tmapilkanInforamasi() {
        System.out.println("Kode MK :" + kodeMK);
        System.out.println("Nama :" + nama);
        System.out.println("SKS :" + sks);
        System.out.println("jumlah Jam :" + jmlhjam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jmlhjam += jam;
    }

    void kurangjam(int jam) {
        if (jmlhjam < jam) {
            System.out.println("Pengurangan Tidak Valid");
        } else {
            jmlhjam -= jam;
            System.out.println("Pengurangan Berhasil");
        }
    }
}
