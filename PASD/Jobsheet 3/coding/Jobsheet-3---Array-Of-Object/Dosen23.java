public class Dosen23 {
    String kode;
    String nama;
    Boolean jeniskelamin;
    int usia;

    public Dosen23(String kode, String nama, Boolean jeniskelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.usia = usia;
    }

    public void cetakInfo(int index) {
        System.out.println("Data Dosen ke-" + index);
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);

        if (jeniskelamin) {
            System.out.println("Jenis Kelamin : Pria");
        } else {
            System.out.println("Jenis Kelamin : Wanita");
        }

        System.out.println("Usia          : " + usia);
        System.out.println("-----------------------------------");
    }
    

}
