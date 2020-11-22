package akatsuki;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Kakuzu extends Akatsuki {
    private String elemen, karakter;

    public Kakuzu(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }

    public String getElemen(){
        return elemen;
    }

    public void setElemen(String elemen){
        this.elemen = elemen;
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    @Override
    public void tampilCiriKhas(String ciriKhas){
        System.out.println("Ciri khas\t\t: " + ciriKhas);
    }

    @Override
    public void tampilKekuatan(String kekuatan){
        System.out.println("Kekuatan\t\t: " + kekuatan);
    }

    @Override
    public void tampilDeskripsi(String deskripsi){
        System.out.println("Elemen\t\t\t: " + getElemen());
        System.out.println("Karakter\t\t: " + getKarakter());
        System.out.println("Deskripsi\t\t: " + deskripsi);
    }
}
