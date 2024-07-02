package classexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    public static final String CLASS_REGEX = "^[C|A|P][0-9]{4}[G|H|I|K]$";
    public ClassExample(){
    }
    public boolean checkClass(String className) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
