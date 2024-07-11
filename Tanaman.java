public class Tanaman {
    private String nama;
    private String jenis;
    private String tinggi;
    private boolean berbuah;

    public Tanaman() {
    }

    public void bermetamorfosis(){
        System.out.println("Tanaman bermeta morfosis");
    }

    public void berbuah(){
        System.out.println("Tanaman berbuah");
    }

    public void tumbuh(){
        System.out.println("Tanaman bertumbuh");
    }

    public void tumbuh(String bagianTumbuh){
        System.out.println("Tanaman tumbuh " + bagianTumbuh);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTinggi() {
        return tinggi;
    }

    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isBerbuah() {
        return berbuah;
    }

    public void setBerbuah(boolean berbuah) {
        this.berbuah = berbuah;
    }
}
