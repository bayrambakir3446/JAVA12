package gun39;

public class Soru1 {
    public static void main(String[] args) {
        // Verilen String icerisindeki harfleri ayiklayarak anlamli bir metin olusturan method yaziniz
        // "(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";

        // anlamsi yazilar icinden anlamli yazi olusturma yada tekrar eden bir karakterleri alma yada buna benzer sorulari cozmek icin kullanilir
        // simdi bir metod yaalim
        String str="(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";
        System.out.println(filterString(str));

        double num2 = 32.3;
        Double obj2 = Double.valueOf(num2);
        if(obj2 instanceof Double){
                   System.out.println(obj2 + " is converted to Wrapper Object");}
               else{ System.out.println(obj2 + " is not converted to Wrapper Object");
             }

    }public static String filterString(String str){
        String newstr="";
        for (int i=0;i<str.length();i++){
            if (Character.isAlphabetic(str.charAt(i))||str.charAt(i)==' '){
                newstr+=str.charAt(i);
            }
        } return newstr;
    }
}