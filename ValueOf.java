public class ValueOf {
    public static void main(String[]args){
        Byte b=Byte.valueOf("10");
        Short s=Short.valueOf("20");
        Integer i=Integer.valueOf("123");
        Long l=Long.valueOf("345678");
        Float f=Float.valueOf("3.14");
        Double d=Double.valueOf("6.28");
        Boolean bool=Boolean.valueOf("true");
        Character c=Character.valueOf('A');

        System.out.println("Byte: "+b);
        System.out.println("Short: "+s);
        System.out.println("Integer: "+i);
        System.out.println("Long: "+l);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
        System.out.println("Boolean: "+bool);
        System.out.println("Charcter: "+c);
    }
}
