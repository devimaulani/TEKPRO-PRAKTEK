// Kelas Administrasi untuk menangani pembayaran
class Administrasi implements PembayaranHandler {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " telah diproses.");
    }
}
