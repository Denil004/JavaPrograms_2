public class DataTypeDemo {
    public static void main(String[] args) {

        byte b = 100;
        short s = 2000;
        int i = 100;
        long l = 100000;
        float f = 25.5f;
        double d = 123.456;
        char ch = 'A';
        boolean flag = true;

        System.out.println("Byte value      : " + b);
        System.out.println("Short value     : " + s);
        System.out.println("Integer value   : " + i);
        System.out.println("Long value      : " + l);
        System.out.println("Float value     : " + f);
        System.out.println("Double value    : " + d);
        System.out.println("Character       : " + ch);
        System.out.println("Boolean         : " + flag);

        System.out.println("\nMemory Range");
        System.out.println("Byte    : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short   : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long    : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float   : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double  : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }
}