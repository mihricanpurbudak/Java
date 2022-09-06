package day41_abstractClass_interface;
public abstract class KBmw extends DAraba{
    /*
      BMW abstract bir class'in
      abstract bir child'i oldugu icin
      Parent class'daki abstract method'lari implement etmek ZORUNDA KALMADI
     */
    public abstract void amblem();
    public abstract void guvenlik();

//8-abstract class in abstrcat olan child i parenttaki tum abstract methodlari override etmek zorunda degildir. ama concrete olan child classlar zorunda.
//abstract oldugundan obje olusturul
 /*
    1-Bir class'i abstract yapip yapmamaya bastan karar veririz
    Eger bir class'tan obje olusturmayacaksak o class'i
    child class'larinin uymasi gereken kurallari belirleyecek sekilde
    dizayn etmek  istiyorsak abstract class yapariz
    2-Abstract bir class'da child class'larin mutlaka
    uymasi gereken kurallari  abstract methodlar ile belirleriz.
    Abstract methodlar mutlaka child class'da override edilecegi icin
    method body'ye ihtiyac duymaz
    3-Abstract olarak tanimlanan methodlarin body'si olmaz
    4-Abstract class zincirinden sonra gelen ilk concerete class,
    parent'larinda bulunan ve concerete olmayan
    tum methodlari override etmek zorundadir

    5- Abstract bir class'in abstract child'i parent'daki
    abstract methodlari override etmek zorunda degildir

    6- Abstract class'lar constructor'a sahiptir fakat
     abstract class'lardan OBJE olusturulamaz*/

    /*
        BMW abstract bir class'in
        abstract bir child'i oldugu icin
        Parent class'daki abstract method'lari implement etmek ZORUNDA KALMADI
       */

}
