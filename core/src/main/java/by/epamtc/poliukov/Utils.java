package by.epamtc.poliukov;

import demolib.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        for (String string: str) {
           if (!StringUtils.isPositiveNumber(string)) {
               return false;
           }
        }
        return true;
    }
}
