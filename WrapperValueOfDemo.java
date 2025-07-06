public class WrapperValueOfDemo {
    public static void main(String[] args) {
        Byte b = Byte.valueOf((byte)10);
        Short s = Short.valueOf((short)20);
        Integer i = Integer.valueOf(30);
        Long l = Long.valueOf(40L);
        Float f = Float.valueOf(3.14f);
        Double d = Double.valueOf(6.28);
        Character c = Character.valueOf('A');
        Boolean bool = Boolean.valueOf("true"); // also accepts Boolean.valueOf(true)

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
