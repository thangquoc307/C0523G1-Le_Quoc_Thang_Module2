package Test.hack_rank;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {

        extraLongFactorials(10);
    }
    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result = BigInteger.valueOf(1);
        for (int i = n; i > 0 ;i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.print(new BigDecimal(result).toPlainString());

    }
}
