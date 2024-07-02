package validatephonenumber;

public class PhoneNumberTest {
    private  static PhoneNumber phoneNumber;
    private static final String[] validNumbers = new String[] {"(84)-(0978489648)"};
    private static final String[] invalidNumbers = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String validNumber : validNumbers) {
            boolean check = phoneNumber.checkPhoneNumber(validNumber);
            System.out.println("Phone number " + validNumber + ": " + check);
        }
        for (String invalidNumber : invalidNumbers) {
            boolean check = phoneNumber.checkPhoneNumber(invalidNumber);
            System.out.println("Phone number " + invalidNumber + ": " + check);
        }
    }
}
