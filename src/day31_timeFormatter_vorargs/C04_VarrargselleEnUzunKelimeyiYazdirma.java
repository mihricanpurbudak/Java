package day31_timeFormatter_vorargs;

public class C04_VarrargselleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet","Babayigit");
    }
    public static void enUzunKelimeyiYazdir(String... kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : " + enUzunKelime);
    }

}
//Bir methodda varrargs disinda parametre varsa varrargs parametre olarak en sona yazilmalidir
// (aksi durumda nerde duracagini bilemez)
//Bir methodda sadece bir varrargs olabilir iki tane olamaz