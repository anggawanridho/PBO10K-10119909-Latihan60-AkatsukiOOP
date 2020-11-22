package akatsuki;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan60 {

    public static void main(String[] args) {
        System.out.println("KARAKTER-KARAKTER AKATSUKI DI SERIAL NARUTO");
        System.out.println();

        //Pain Tendo
        PainTendo pain = new PainTendo("Pain Tendo", "Amegakure", "Pemimpin", "Rei (nol)", "Jempol kanan");
        pain.setTujuan("Penguasaan dunia dengan kekuatan mutlak dan mendirikan desa mereka sendiri yang\n" +
                "\t\t\t\t  mampu menerima tugas apapun, termasuk pembunuhan, penyerangan, penculikan\n" +
                "\t\t\t\t  perang, dan tugas kotor lainnya.");
        pain.setPengendali("Uzumaki Nagato");
        pain.tampilAtributSuper();
        pain.tampilCiriKhas("- Memiliki besi hitam berupa tindikan di hampir seluruh tubuh\n" +
                "\t\t\t\t  - Rambut Jingga");
        pain.tampilKekuatan("Menduplikasikan kekuatannya dengan menggunakan tubuh mayat manusia");
        pain.tampilDeskripsi("Kemampuan Pain seimbang dengan jumlah chakra yang diberikan kepada masing-masing\n" +
                "\t\t\t\t  hasil duplikasi ini. Ketika tiba saatnya berkumpul, Pain dapat memanggil\n" +
                "\t\t\t\t  Pain lainnya bahkan dari tempat yang jauh dengan menggunakan Kuchiyose\n" +
                "\t\t\t\t  no Jutsu.");
        System.out.println();

        //Obito Uchiha
        ObitoUchiha obito = new ObitoUchiha("Obito Uchiha", "Konoha Gakure", "Pemimpin", "Gyokunyo (Virgo)","Jempol kiri");
        obito.setNamaPanggilan("Tobi");
        obito.setElemen("Api");
        obito.setKarakter("Aneh, ceroboh, dan dipandang sebagai anggota terlemah.");
        obito.setTujuan("Mampu melemparkan Tsukuyomi tak terbatas dan menjebak seluruh dunia di bawah genjutsu dan\n" +
                "\t\t\t\t  memberikan dia kekuatan untuk menciptakan dunia yang ia inginkan.");
        obito.tampilAtributSuper();
        System.out.println("Nama panggilan\t: " + obito.getNamaPanggilan());
        obito.tampilCiriKhas("Topeng jingga satu lubang mata dengan pola pusaran yang terpusat pada mata kanan.");
        obito.tampilKekuatan("Memiliki Sharingan yang dapat membuat tubuhnya tembus dari serangan.");
        obito.tampilDeskripsi("Dia hanya pura-pura dengan tidak menampilkan kekuatan dan identitasnya. Tobi sebenarnya\n" +
                "\t\t\t\t  bukanlah Madara Uchiha seperti yang disebut-sebut, dia adalah Obito Uchiha, salah\n" +
                "\t\t\t\t  satu teman masa kecilnya Kakashi Hatake. Obito juga memerikan sebelah matanya pada\n" +
                "\t\t\t\t  Kakashi Hatake dalam wujud mata Sharingan.");
        System.out.println();

        //Deidara
        Deidara deidara = new Deidara("Deidara", "Iwa Gakure", "Anggota", "Seiryu (Naga Biru)", "Telunjuk kanan");
        deidara.setElemen("Tanah");
        deidara.setKarakter("Paling cerewet");
        deidara.tampilAtributSuper();
        deidara.tampilCiriKhas("Berambut pirang dan dikuncir");
        deidara.tampilKekuatan("Membuat bom tanah liat dengan cara mengunyahkan tanah liat pada telapak tangannya yang\n" +
                "\t\t\t\t  memiliki mulut.");
        deidara.tampilDeskripsi("Deidara adalah seorang ninja pelarian. Deidara mengatakan jika setiap bom yang dibuatnya\n" +
                "\t\t\t\t  merupakan suatu hasil karya seni.");
        System.out.println();


        //Kisame Hoshigaki
        KisameHoshigaki kisame = new KisameHoshigaki("Kisame Hoshigaki", "Kiri Gakure", "Anggota", "Nanju (Bintang selatan)", "Jari manis kiri");
        kisame.setElemen("Air");
        kisame.setKarakter("Meskipun penampilannya ganas, tetapi dia berbicara dengan tenang dan sopan");
        kisame.tampilAtributSuper();
        kisame.tampilCiriKhas("Menyerupai ikan hiu, lengkap dengan kulit berwarna biru pucat dengan mata yang kecil, serta\n" +
                "\t\t\t\t  memiliki struktur muka yang menyerupai insang dan gigi berbentuk segitiga tajam.");
        kisame.tampilKekuatan("Pedang samehada, cakra yang melimpah dan jurus-jurus elemen air.");
        kisame.tampilDeskripsi("Dia adalah salah satu dari 7 pengguna pedang kiri gakure, Kisame juga dijuluki sebagai bijuu\n" +
                "\t\t\t\t  tanpa ekor karna dia memiliki cakra yang sangat banyak seperti para bijuu, dia pengguna\n" +
                "\t\t\t\t  pedang Samehadaku yang dapat menyerap cakra lawan.");
        System.out.println();

        //Kakuzu
        Kakuzu kakuzu = new Kakuzu("Kakuzu", "Taki Gakure", "Anggota", "Hokuto (Bintang Utara)", "Jari tengah kiri");
        kakuzu.setElemen("Angin, api, tanah, air, dan petir");
        kakuzu.setKarakter("Rajin mengumpulkan uang, individu rakus, dan mengutamakan seberapa berharganya suatu benda.");
        kakuzu.tampilAtributSuper();
        kakuzu.tampilCiriKhas("Menggunakan penutup wajah");
        kakuzu.tampilKekuatan("Dapat memperpanjang hidupnya dengan cara mengambil jantung manusia, dapat memiliki lima jantung\n" +
                "\t\t\t\t  manusia secara bersamaan, dapat menggunakan seluruh lima elemen chakra, tubuh terdiri dari\n" +
                "\t\t\t\t  jaring-jaring untuk menyerang dan memanipulasi tubuh yang lain.");
        kakuzu.tampilDeskripsi("Setiap elemen yang dimilikinya memiliki satu jantung, makanya jantungnya ada 5 buah.");
        System.out.println();

        //Konan
        Konan konan = new Konan("Konan", "Ame Gakure", "Anggota", "Byakko (Harimau Putih)", "Jari tengah, tangan kanan");
        konan.tampilAtributSuper();
        konan.tampilCiriKhas("Memiliki aksesoris seperti bunga di kepalanya");
        konan.tampilKekuatan("Jurus origami yaitu kertas lipat, dia juga dapat membuat tubuhnya menjadi lembaran-lembaran kertas.\n" +
                "\t\t\t\t  Namun ninjutsu itu tidak berhasil jika tubuh Konan dibasahi dengan zat cair.");
        konan.tampilDeskripsi("Satu-satunya anggota perempuan. Dia adalah mantan murid Jiraiya Sannin.");
        System.out.println();

        //Hidan
        Hidan hidan = new Hidan("Hidan", "Yu Gakure", "Anggota", "Santai (Tiga Tingkatan)", "Telunjuk kiri");
        hidan.setKarakter("Sangat agamis, tetapi suka berbicara kotor");
        hidan.setKepercayaan("Menyembah Dewa Jashin (percaya apapun yang tidak menghasilkan perusakan dianggap sebagai dosa.");
        hidan.tampilAtributSuper();
        System.out.println("Kepercayaan\t\t: " + hidan.getKepercayaan());
        System.out.println("Karakter\t\t: " + hidan.getKarakter());
        hidan.tampilCiriKhas("Membawa sabit besar bermata tiga dan memiliki rambut cepak putih.");
        hidan.tampilKekuatan("Bisa melukai lawannya dengan cara melukai dirinya sendiri setelah meminum darah lawannya.");
        hidan.tampilDeskripsi("Dia selalu melakukan ritual keagamaannya setelah bertarung.");
        System.out.println();

        //Zetsu
        Zetsu zetsu = new Zetsu("Zetsu", "Kusa Gakure", "Anggota", "Genbu (Kura-kura)", "Kelingking kanan");
        zetsu.tampilAtributSuper();
        zetsu.tampilCiriKhas("Kepalanya diselubungi oleh semacam tudung seperti tanaman Venus penangkap lalat yang besar, yang\n" +
                "\t\t\t\t  juga membungkus tubuhnya. Bagian kanan dari wajah dan tubuhnya berwarna hitam, sedangkan di\n" +
                "\t\t\t\t  bagian kiri berwarna putih.");
        zetsu.tampilKekuatan("Zetzu mempunyai dua kepribadian, di mana bagian hitam dari wajahnya berbicara dalam Katakana,\n" +
                "\t\t\t\t  sedangkan yang bagian putih menggunakan Kanji dan Kana. Kedua bagian tersebut juga sering\n" +
                "\t\t\t\t  berbicara satu sama lain, dan kadang-kadang juga memiliki pendapat yang berbeda.");
        zetsu.tampilDeskripsi("Zetsu itu kanibal, dia juga sengaja memakan tubuh anggota akatsuki yang telah terbunuh agar mayatnya\n" +
                "\t\t\t\t  tidak di otopsi.");
    }
}
