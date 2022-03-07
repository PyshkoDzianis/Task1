package by.pyshkodzianis.task1.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomArrayValidator {
    private static final String IS_NUMBER = "^-?(\\d)+((\\s)+-?(\\d)+)*$";

    private CustomArrayValidator() {
    }

    public static boolean validateInteger(String str) {
        Pattern pattern = Pattern.compile(IS_NUMBER);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
