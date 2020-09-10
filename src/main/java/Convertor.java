public class Convertor {

    public int toDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }

    public String toBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
}
