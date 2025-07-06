public class WrapperValueOfEx{
    public static void main(String[] args) {
        
        Byte byteObj1=Byte.valueOf((byte)10);
        Byte byteObj2=Byte.valueOf("20");

        Short shortObj1 = Short.valueOf((short) 100);
        Short shortObj2 = Short.valueOf("200");

        Integer intObj1=Integer.valueOf(300);
        Integer intObj2=Integer.valueOf("400");

        Long longObj1=Long.valueOf(1000L);
        Long longObj2=Long.valueOf("2000");

        Float floatObj1 = Float.valueOf(12.34f);       
        Float floatObj2 = Float.valueOf("56.78"); 

        Double doubleObj1=Double.valueOf(99.99);
        Double doubleObj2=Double.valueOf("12.45");

        Character charObj='Z'; //Autoboxing used as character does not support foir valueOf() directly

        Boolean boolObj1=Boolean.valueOf(true);
        Boolean boolObj2=Boolean.valueOf("false");


        System.out.println("Byte objects: " + byteObj1 + ", " + byteObj2);
        System.out.println("Short Objects :"+shortObj1+", "+shortObj2);
        System.out.println("Integer Objects :"+intObj1+", "+intObj2);
        System.out.println("Long Object :"+longObj1+", "+longObj2);
        System.out.println("Float Object: "+floatObj1+", "+floatObj2);
        System.out.println("Double Object: "+doubleObj1+", "+doubleObj2);
        System.out.println("Character Object :"+charObj);
        System.out.println("Boolean Object : "+boolObj1+", "+boolObj2);
    }
}