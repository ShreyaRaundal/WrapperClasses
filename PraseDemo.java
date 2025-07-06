public class PraseDemo {
    public static void main(String[] args){
        byte b=Byte.parseByte("10");
        short s=Short.parseShort("20");
        int i=Integer.parseInt("123");
        long l=Long.parseLong("456677");
        float f=Float.parseFloat("3.14");
        double d=Double.parseDouble("6.28");
        boolean bool=Boolean.parseBoolean("true");

        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("boolean: "+bool);

    }
}
