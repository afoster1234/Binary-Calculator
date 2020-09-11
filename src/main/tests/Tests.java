import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class Tests {

    @Test
    public void testAddition1(){
        ArithmeticOperators add1 = new ArithmeticOperators();
        String t1 = add1.addition("0011", "1100");
        Assert.assertEquals(t1, "1111");
    }

    @Test
    public void testAddition2(){
        ArithmeticOperators add2 = new ArithmeticOperators();
        String t2 = add2.addition("0101", "0010");
        Assert.assertEquals(t2, "0111");
    }

    @Test
    public void testSubtraction1(){
        ArithmeticOperators sub1 = new ArithmeticOperators();
        String t3 = sub1.subtraction("1111", "0101");
        Assert.assertEquals(t3, "1010");
    }

    @Test
    public void testSubtraction2(){
        ArithmeticOperators sub2 = new ArithmeticOperators();
        String t4 = sub2.subtraction("0100", "0001");
        Assert.assertEquals(t4, "0011");
    }

    @Test
    public void testMultiplication1(){
        ArithmeticOperators mul1 = new ArithmeticOperators();
        String t5 = mul1.multiplication("0010", "0101");
        Assert.assertEquals(t5, "1010");
    }

    @Test
    public void testMultiplication2(){
        ArithmeticOperators mul2 = new ArithmeticOperators();
        String t6 = mul2.multiplication("0110", "0100");
        Assert.assertEquals(t6, "00011000");
    }

    @Test
    public void testDivision1(){
        ArithmeticOperators div1 = new ArithmeticOperators();
        String t7 = div1.division("1111", "0101");
        Assert.assertEquals(t7, "0011");
    }

    @Test
    public void testDivision2(){
        ArithmeticOperators div2 = new ArithmeticOperators();
        String t8 = div2.division("1000", "0100");
        Assert.assertEquals(t8, "0010");
    }

    @Test
    public void testSquare1(){
        ArithmeticOperators srq1 = new ArithmeticOperators();
        String t9 = srq1.square("0010");
        Assert.assertEquals(t9, "0100");
    }

    @Test
    public void testSquare2(){
        ArithmeticOperators srq2 = new ArithmeticOperators();
        String t10 = srq2.square("0101");
        Assert.assertEquals(t10, "00011001");
    }

    @Test
    public void testSqroot1(){
        ArithmeticOperators sqroot1 = new ArithmeticOperators();
        String t11 = sqroot1.squareroot("1001");
        Assert.assertEquals(t11, "0011");
    }

    @Test
    public void testSqroot2(){
        ArithmeticOperators sqroot2 = new ArithmeticOperators();
        String t12 = sqroot2.squareroot("00100100");
        Assert.assertEquals(t12, "0110");
    }
}
