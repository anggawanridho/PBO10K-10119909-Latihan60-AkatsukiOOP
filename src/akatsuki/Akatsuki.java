package akatsuki;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Akatsuki {
    private String nama, asal, pangkat, namaCincin, posisiCincin, ciriKhas, kekuatan, deskripsi;

    public Akatsuki(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        this.nama = nama;
        this.asal = asal;
        this.pangkat = pangkat;
        this.namaCincin = namaCincin;
        this.posisiCincin = posisiCincin;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAsal(){
        return asal;
    }

    public void setAsal(String asal){
        this.asal = asal;
    }

    public String getPangkat(){
        return pangkat;
    }

    public void setPangkat(String pangkat){
        this.pangkat = pangkat;
    }

    public String getNamaCincin(){
        return namaCincin;
    }

    public void setNamaCincin(String namaCincin){
        this.namaCincin = namaCincin;
    }

    public String getPosisiCincin(){
        return posisiCincin;
    }

    public void setPosisiCincin(String posisiCincin){
        this.posisiCincin = posisiCincin;
    }

    public String setCiriKhas(){
        return ciriKhas;
    }

    public void getCiriKhas(String ciriKhas){
        this.ciriKhas = ciriKhas;
    }

    public String getKekuatan(){
        return kekuatan;
    }

    public void setKekuatan(String kekuatan){
        this.kekuatan = kekuatan;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void tampilAtributSuper(){
        System.out.println(this.nama);
        System.out.println("Asal\t\t\t: " + this.asal);
        System.out.println("Pangkat\t\t\t: " + this.pangkat);
        System.out.println("Nama cincin\t\t: " + this.namaCincin);
        System.out.println("Posisi cincin\t: " + this.posisiCincin);
    }

    public void tampilCiriKhas(String ciriKhas){
        System.out.println("Ciri khas\t\t\t: " + ciriKhas);
    }

    public void tampilKekuatan(String kekuatan){
        System.out.println("Kekuatan\t\t\t\t: " + kekuatan);
    }

    public void tampilDeskripsi(String deskripsi){
        System.out.println("Deskripsi\t\t: " + deskripsi);
    }
}