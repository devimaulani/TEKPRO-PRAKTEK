// Subclass Dokter dari PersonelMedis
class Dokter extends PersonelMedis implements JadwalPiket, RekamMedisHandler, ResepObatHandler {
    private final String spesialisasi;
    private String rekamMedis;
    private String jadwal;

    public Dokter(String nama, String id, String spesialisasi) {
        super(nama, id);
        this.spesialisasi = spesialisasi;
        this.rekamMedis = "";
    }

    @Override
    public void bekerja() {
        System.out.println("Dokter " + nama + " (Spesialisasi: " + spesialisasi + ") sedang memeriksa pasien.");
    }

    @Override
    public void aturJadwal(String jadwal) {
        this.jadwal = jadwal;
        System.out.println("Jadwal Dokter " + nama + " diatur: " + this.jadwal);
    }

    @Override
    public void catatRekamMedis(String rekamMedis) {
        this.rekamMedis = rekamMedis;
    }

    @Override
    public String lihatRekamMedis() {
        return rekamMedis;
    }

    @Override
    public void buatResep(String resep) {
        System.out.println("Dokter " + nama + " memberikan resep: " + resep);
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public String getJadwal() {
        return jadwal;
    }
}
