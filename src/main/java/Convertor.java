public class Convertor {

    public static int toDecimal(String binary){
        if(binary.equals("")){
            return 0;
        }
        return (int)Long.parseLong(binary, 2);
    }

    public static String toBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
}
