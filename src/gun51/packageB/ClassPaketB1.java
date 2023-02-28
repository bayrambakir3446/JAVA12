package gun51.packageB;

import gun51.packageA.AccessModifiers;
import gun51.packageA.ClassA;

public class ClassPaketB1 extends ClassA {
    public static void main(String[] args) {
        AccessModifiers accessModifiers= new AccessModifiers();
        accessModifiers.publicMethod();

        //Public
        accessModifiers.name = "Başka bir paketten erişim"; //Public olduğundan başka bir paketteki class tan da erişebildik
        accessModifiers.publicMethod(); //Public olduğundan başka bir paketteki class tan da erişebildik

        //Protected
      //  accessModifiers.protectedMethod(); //Protected tanımlandığından başka bir paket içerisindeki class tan doğrudan erişim yapamayız.
        //accessModifiers.TCNo = 123345; //Protected tanımlandığından başka bir paket içerisindeki class tan doğrudan erişim yapamayız.

        //Default
        //accessModifiers.defaultMethod(); //Default tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.
        //accessModifiers.okulNo = 34567; //Default tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.

        //Private
        // accessModifiers.privateToplama(12,45); //Private tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.
        // accessModifiers.id = 10; //Private tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.







    }
}


