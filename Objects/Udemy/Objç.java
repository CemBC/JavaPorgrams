package Objects.Udemy;

public class Objç {


    // this.Obje = Bu bjeyi gösterir, eğer obje ile aynı adlı bir referansın varsa kullanılmalıdır

    /* Obj obje = null; = bu durumda daha referansları belirlenmemiş objeleri belirtir
    null = (Daha referansları atanmamış demek)*/


    // NullPointerException = (Daha referansları atanmamış bir objeye erişmeye çalışıyorsun ben bunu yapamam hatası)






    /*  DEFAULT CONSTRUCTOR OLUŞTURMA

    public Account(String hesapNo, double bakiye , String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }


    public Account() {
        this.hesapNo = "Bilgi yok";
                .
                .
                .
                .
     }

     --> ya da direkt ana constructoru çağırabilirsin

     public Account(){
          this("Bilgi yok",0.0,"Bilgi yok",.................);   // bunu recursion fonksiyona brnzetebilirsin, constructor farklı bir constructor' ı çağırıyor
     }

     --> Ya da eskik bilgi girmek istersen şöyle yapılabilir

     public Account(String hesapNo, double bakiye , String isim, String email, String telefonNo){     //eksik hesap no bilgisi olan constructor örneği

        this("Bilgi yok",bakiye,isim,email,telefonNo);
     */



    // Tek satırlık işlem --> new Account("Cem","cembc07@gmail.com","2134213").bilgilerigöster();
    // Ancak bu objenin bir referansı olmadığı için bu objeyi ilerleyen zamanlarda kullanamayız


    /*              INHERITANCE METHODS
      Inheritance  dediğimiz şey kalıtım/ miras almadır yani iki farklı objenin belli methodları aynı olsun istersek
      ınheritance kullanırız ve sonrasında farklılaştırmak isteidğimiz methoddları overriding dediğimiz işlemle
      tekrar yazarız, birkaç örnek:

      public class Calısan {
        private String isim;
        private String departman;
        private int maas;

        public Calısan(String isim, String departman, int maas) {
            this.isim = isim;
            this.departman = departman;
            this.maas = maas;
        }

        public void bilgilerigöster(){
            System.out.println("İSim = " + this.isim);
            System.out.println("Departman = " + this.departman);
            System.out.println("Maaş = " + this.maas);
        }

      }

       //Calısan classımızın biglilerini kalıtım yoluyla yönetici classına aktarırsak calısan classı super class olur
       //Methodumuzun ismi de bu nedenle superdir
       //kalıtım yapmak için extends methodu kullanırız

       public class Yonetici extends Calısan{
             private int sorumlu_kısı;
             //Yeniden private ile obje tanımlamaya gerek yok
             //Ancak yonetıcı classına constructor tanımlaman gerek

             public Yonetıcı(String isim, String departman, int maas,int sorumlu_kısı) {

                super(isim,departman,maas);  // uzun uzun yazmak yerine direkt super methoduyla değer atadık
                this.sorumlu_kısı = sorumlu_kısı;
             }

             //ancak ben bilgileri göster methoduna bir şeyler eklemek istiyorum o zaman overriding yapmam lazım

             public void bilgilerigöster(){
                System.out.println("İSim = " + this.isim);
                System.out.println("Departman = " + this.departman);
                System.out.println("Maaş = " + this.maas);

                //bu üstteki 3 işlemi kullanmak yerine şunu da yapabiliriz

                super.bilgilerigöster();   //bu işlem Calısan classının bilgilerigöster() methodunu kopyalıyor

                System.out.println("Sorumlu kişi sayısı = " + this.sorumlu_kısı);
             }
       }





       */








}
