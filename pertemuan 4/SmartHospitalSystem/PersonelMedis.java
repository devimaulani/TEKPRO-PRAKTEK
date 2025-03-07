// Abstract class untuk Personel Medis
abstract class PersonelMedis {
    protected String nama;
    protected final String id;

    public PersonelMedis(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public abstract void bekerja();

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
