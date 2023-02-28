package gun48;

public class Student {
    private  String name;
    private int age;
    private int schoolNumber;
    private String division;
public Student (){
    // eger bu sekilde bos bir konstruktor yaparsam default degerleri atayacaktir
}
    public Student(String name,int age, String division) {
        //this.name = name;// hangisi local hangisi inst ait olup olmadigini belirlemek icin oto. ekliyor
        setName(name); // yukariyi sonradan kommente aldim

      //this.age=age;
        setAge(age);
        //this.division = division;
        setDivision(division);
// construktur araciligiyla bak nasil da ulasabiliyoruz test de hicbirsey yapamiyoruz
        // kural geregi konstruktur icerisine pek birsey yazilmaz onun yerine get set kullanilir
    }
//    public void isimDuzenle(String name){ //alinda bu method bir cesit getter it is kind of getter method
//        this.name=name.toUpperCase();
//    }
//public String isimGoster(){ //it is kind of getter method
//        return this.name;
//// aslinda bunlari bana intellij olusturuyor bunlara bakalim simdi
//}
//----------------------------------------------------------------------------------------
// bir de bunlar kariskligi koydugumuz kurallari duzgun calismasi icinde var mesela yukarida public yaptik mesela test e de
// kucuk harfle yazdik o upper case yazmaz o yuzden n copsulation kurallari geregince bunlar private olmasi lazim

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().trim(); // buraya bu sekildede method yazabiliyoruz
        //hatta daha da sekillendirebiliriz biz construktor da duzenleme vs yapamiyoruz
        //orADA su sekilde yazabiliriz setName(name) bu sekilde yazarsak bizim hatalarimizi duzeltecektir ondandan sonra cagiracaktir
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18&&age<60){
        this.age = age;}
        else {System.out.println("Ögrenci yasi kurallara uygun degil.18-60 yas araliginda olmali");
        this.age=18; // eger ben burada atama yapmaz isem sifir veriyor
            }
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

// mesela ben buraya static bir metod yazsam sadece statik olan erisirim
    // statik olmayan bir method yazsam sadece statik olmayana erisirim
    //burada bir tostring metodu olusturuyorum
    // student teste gittigimde ogr1 in tostringe ulastigini gorecegiz


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolNumber=" + schoolNumber +
                ", division='" + division + '\'' +
                '}';
    }
}

