public class Convertor {

    public static int toDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }

    public static String toBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
}
