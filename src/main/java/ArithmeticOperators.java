public class ArithmeticOperators {

    public String addition(String binary1, String binary2){
        int int1 = Convertor.toDecimal(binary1);
        int int2 = Convertor.toDecimal(binary2);
        return Convertor.toBinary(int1 + int2);
    }

    public String subtraction(String binary1, String binary2){
        int int1 = Convertor.toDecimal(binary1);
        int int2 = Convertor.toDecimal(binary2);
        return Convertor.toBinary(int1 - int2);
    }

    public String multiplication(String binary1, String binary2){
        int int1 = Convertor.toDecimal(binary1);
        int int2 = Convertor.toDecimal(binary2);
        return Convertor.toBinary(int1 * int2);
    }

    public String division(String binary1, String binary2){
        int int1 = Convertor.toDecimal(binary1);
        int int2 = Convertor.toDecimal(binary2);
        return Convertor.toBinary(int1 / int2);
    }
}
