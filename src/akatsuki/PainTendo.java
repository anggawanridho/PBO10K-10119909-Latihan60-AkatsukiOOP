package akatsuki;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PainTendo extends Akatsuki {
    private String tujuan;
    private String pengendali;

    public PainTendo(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }

    public String getTujuan(){
        return tujuan;
    }

    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }

    public String getPengendali(){
        return pengendali;
    }

    public void setPengendali(String pengendali){
        this.pengendali = pengendali;
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
        System.out.println("Tujuan Akatsuki : " + getTujuan());
        System.out.println("Pengendali\t\t: " + getPengendali());
        System.out.println("Deskripsi\t\t: " + deskripsi);
    }
}
