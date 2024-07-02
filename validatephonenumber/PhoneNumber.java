package validatephonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public PhoneNumber() {}
    public boolean checkPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
