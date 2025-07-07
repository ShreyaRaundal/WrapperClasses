public class AutoBoxEx {
    public static void main(String[] args){
        Byte B=Byte.valueOf((byte)10);
        byte b=B;

        Short S=Short.valueOf((short)20);
        short s=S;

        Integer I=Integer.valueOf(30);
        int i=I;

        Long L=Long.valueOf(34567);
        long l=L;

        Float F=Float.valueOf(3.14f);
        float f=F;

        Double D=Double.valueOf(6.28);
        double d=D;

        Character C=Character.valueOf('A');
        char c=C;

        Boolean Bbool=Boolean.valueOf(true);
        boolean bool=Bbool;

        System.out.println("Unboxing Completed");
        System.out.println("byte : "+b);
        System.out.println("Short : "+s);
        System.out.println("int : "+i);
        System.out.println("long : "+l);
        System.out.println("float : "+f);
        System.out.println("double : "+d);
        System.out.println("Charcter : "+c);
        System.out.println("Boolean : "+bool);



    }
}
