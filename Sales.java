public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
    }
    public int getPenjualan(){
        return penjualan;
    }
    public double getKomisi(){
        return komisi;
    }
    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }
    public void setKomisi(double komisi){
        this.komisi = komisi;
    }
    public double Gaji(){
        return penjualan*komisi;
    }
    public String toString() {
        return String.format("Sales\t\t: %s\nNo. KTP\t\t: %s\nTotal Penjualan\t: %d\nBesaran Komisi\t: Rp. %.2f\nPendapatan\t: Rp. %.2f\n",
                getNama(), getNoKTP(), penjualan, komisi, Gaji());
    }
}