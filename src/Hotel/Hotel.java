package Hotel;

public class Hotel extends kamar implements setData {
    String Name, phone;
    int age;

    @Override
    public void setData(String name, String phone, int age) {
        this.Name = name;
        this.phone = phone;
        this.age = age;

    }

    public void  hapusData() {
        this.Name = null;
        this.phone = null;
        this.age = 0;

        this.jumlahTamu--;
        this.jumlahKamar++;
        this.jenisKamar = null;
        System.out.println("data berhasil di hapus");
    }

    @Override
    public void detail() {
        System.out.println("=============================");
        System.out.println("Detail pesanan tamu: ");
        System.out.println("Nama Tamu: " + Name);
        System.out.println("Nomor Tamu: " + phone);
        System.out.println("Umur Tamu: " + age);
        System.out.println("==========================");
    }
}
