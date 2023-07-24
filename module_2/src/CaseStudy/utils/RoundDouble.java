package CaseStudy.utils;

import java.math.BigDecimal;

public class RoundDouble {
    public static String roundDouble(double number){
        return new BigDecimal(Math.round(number)).toPlainString();
    }
}
