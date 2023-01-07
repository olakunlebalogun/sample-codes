package src.read.write.excel;

public class MaskAccountNumber {
    public static void main(String[] args) {
        String myAccountNumber = "0124783437";
        System.out.println(maskAccountNumber(myAccountNumber));

    }

    public static String maskAccountNumber(String accountNumber) {
        int stopIndex = 5;
        return getString(accountNumber, stopIndex);
    }

    public static String maskAccountNumber(String accountNumber, Integer unmaskLength) {
//        unmaskLength = 5;
        return getString(accountNumber, unmaskLength);
    }

    private static String getString(String accountNumber, Integer unmaskLength) {
        String showNumber = accountNumber.substring(unmaskLength + 1);
        StringBuilder st = new StringBuilder(accountNumber);
        StringBuilder newAccount = null;
        for (int i = 0; i <= unmaskLength; i++) {
            newAccount = st.replace(i, unmaskLength, "*");

        }
        return newAccount.toString() + showNumber;
    }
}
