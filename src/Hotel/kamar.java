package Hotel;

public class kamar {
    public  int jumlahKamar = 10, jumlahTamu;
    public String jenisKamar;

    public void pesanKamar (int jumlahKamar, String jenisKamar, int jumlahTamu) {
        this.jumlahKamar -= jumlahKamar;
        this.jumlahTamu += jumlahTamu;
        this.jenisKamar = jenisKamar;
    }

    public void detail() {
        System.out.println("=============================");
        System.out.println("kamar yang tersedia:");
        System.out.println("Jenis kamar: " + jenisKamar);
        System.out.println("Jumlah kamar yang tersedia: " + jumlahKamar);
        System.out.println("Jumlah tamu: " + jumlahTamu);
        System.out.println("==========================");
    }
}
