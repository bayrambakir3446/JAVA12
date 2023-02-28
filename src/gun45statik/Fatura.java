package gun45statik;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
    static int id=0;
    static int faturaNo=0;
    static String firmaAdi;
    static String firmaAdresi;
    static String firmaTelNo;
    Date faturaTarihi;
    Sepet sepet;
    //simdi static blok yazalim ve oraya sabit degerleri atayalim
    static {
        firmaAdi="ABC";
        firmaAdresi="AB str.33-a";
        firmaTelNo="123456789";

    } //simdi birtane konstr. yazalim
    public Fatura(Date faturaTarihi,Sepet sepet){
        this.faturaTarihi=faturaTarihi;
        this.sepet=sepet;
        id++;
        faturaNo=id;
    }
    public String toString(){
        SimpleDateFormat tarihFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:MM:SS");
        String str=firmaAdi+"\n";
        str+=firmaAdresi+"\n";
        str+="               "+ firmaTelNo+"\n\n";
        str+="Fatura no:"+faturaNo+"      Tarih/Saat  : "+tarihFormat.format(faturaTarihi)+"\n";
        str+="--------------------------------------------------\n";
        str+=sepet;
        return str;
        // artik market e git buradaki islemlerini oradan cagir

    }

}
