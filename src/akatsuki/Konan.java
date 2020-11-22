package akatsuki;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Konan extends Akatsuki {
    public Konan(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
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
    }
}
