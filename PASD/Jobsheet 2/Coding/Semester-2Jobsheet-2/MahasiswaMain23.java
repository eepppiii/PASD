public class MahasiswaMain23 {
    public static void main(String[] args) {
        
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 7J";
        mhs1.ipk = 3.55;
        
        mhs1.tmapilkanInforamasi();
        mhs1.ubahKelas("SI 2K");;
        mhs1.updateIpk(3.60);;
        mhs1.tmapilkanInforamasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Annisa Nabila", "2141720160", 3.25, "TI 2L");
            mhs2.updateIpk(3.30);
            mhs2.tmapilkanInforamasi();
    }

}
