public class WrapperConstructorExample {
    public static void main(String[] args) {
        Byte b = new Byte((byte) 10);
        Short s = new Short((short) 20);
        Integer i = new Integer(30);
        Long l = new Long(40L);
        Float f = new Float(12.5f);
        Double d = new Double(99.99);
        Character c = new Character('A');
        Boolean bool = new Boolean(true);

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + bool);
    }
}
