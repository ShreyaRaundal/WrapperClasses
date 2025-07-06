public class WrapperConstaructorEx{
    public static void main(String[] args){

        Byte byteObj=new Byte((byte)10);
        Short shortObj=new Short((short)20);
        Integer intObj=new Integer(30);
        Long longObj=new Long(40L);
        Float floatObj=new Float(50.5f);
        Double doubleObj=new Double(60.5);
        Character charObj=new Character('A');
        Boolean boolObj1=new Boolean(true);   //boolean
        Boolean boolObj2=new Boolean("true");   //from string

        System.out.println("Byte Object :"+byteObj);
        System.out.println("Short Object :"+shortObj);
        System.out.println("Integer Object "+intObj);
        System.out.println("Long object :"+longObj);
        System.out.println("Double object :" + floatObj);
        System.out.println("Float object :"+floatObj);
        System.out.println("Character object :"+charObj);
        System.out.println("Boolean object(from boolean): "+boolObj1);
        System.out.println("Boolean object(from string): "+boolObj2);


    }
}