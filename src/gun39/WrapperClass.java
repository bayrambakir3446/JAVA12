package gun39;

public class WrapperClass {
    public static void main(String[] args) {
        int num=5;
        Integer num1=new Integer(56);
        Integer num2=new Integer("57");
        Integer num4=new Integer(num1);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num4);

        Byte num11=new Byte((byte)5);
        System.out.println(num11);
        Character ch=new Character('c');
        System.out.println(ch);
        Integer object=Integer.valueOf(1);
        Integer object1=Integer.valueOf("1");
        System.out.println(object1 == object);
        System.out.println(object1.equals(object));
        //bir String icindeki metodlari char etle islemek de mumkun
        System.out.println(Character.isAlphabetic('c'));
        System.out.println(Character.isAlphabetic('4'));
        System.out.println(Character.isLetter('z'));
        // hatta Character metoduyla herhangi elemanina ulasmamiz da mumkundur
        String str="Ben ne yapiyorum 2023";
        System.out.println(Character.isAlphabetic(str.charAt(2)));
        System.out.println(Character.isLetter(str.charAt(10)));
        System.out.println(Character.isDigit(str.charAt(20)));

    }
}
