package akatsuki;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Hidan extends Akatsuki {
    private String karakter, kepercayaan;

    public Hidan(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }

    public String getKarakter(){
        return karakter;
    }

    public void setKarakter(String karakter){
        this.karakter = karakter;
    }

    public String getKepercayaan(){
        return kepercayaan;
    }

    public void setKepercayaan(String kepercayaan){
        this.kepercayaan = kepercayaan;
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
        System.out.println("Deskripsi\t\t: " + deskripsi);
    }}
