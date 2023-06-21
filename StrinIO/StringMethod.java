package StrinIO;

public class StringMethod {
    public static void main(String [] args) {
        String s = " Cem Başar Ceylani ";
        String[] splitted = s.trim().split(""); //yazdığın tipten hepsini ayırıyor ve bunu arraye döndürüyor
        for(int i = 0 ; i < splitted.length ; i++) {
            System.out.print(splitted[i]+"!");
        }
        System.out.println();

        System.out.println(s.trim()); //en baştaki ve sondaki boşlukları kaldırır
        System.out.println(s.substring(0,s.length())); //index aralığını kırpar
        System.out.println(s.charAt(3)); //bu indeteki karakteri char olarak döndürür
        System.out.println(s.indexOf("Y")); //indexini gösterir  -1= içinde yok

        String n = s.replace('C','G'); // replace
        System.out.println(n);

        String t = "1453";
        int a = Integer.parseInt(t);  //Stringi inte çeviriyor
        System.out.println(a+7);


        int i = 4;
        System.out.println(Integer.toString(i)); // bu Integerı stringe çevirir
        System.out.println(i+"aa");





    }
}
