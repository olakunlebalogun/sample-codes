package src.read.write.excel.collections.TryLinkedList;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

//        The approved NUBAN format ABC-DEFGHIJKL-M
//        where ABC is the 3-digit bank code assigned by the CBN
//        DEFGHIJKL is the NUBAN Account serial number
//        M is the NUBAN Check Digit, required for account number
//        validation

//            ABC
//        Step 1. Calculate A*3+B*7+C*3+D*3+E*7+F*3+G*3+H*7+I*3+J*3+K*7+L*3
//        Step 2. Calculate Modulo 10 of your result i.e. the remainder after dividing by 10
//        Step 3. Subtract your result from 10 to get the Check Digit
//        Step 4. If your result is 10, then use 0 as your check digit

        String numString = "234328";
//        System.out.println(numString.substring(5, 6));
//                                              011 000 001 457
        Test.accountOperation("011000001457");
        Test.accountOperation("011000000022");

        System.out.println(Test.getAccountNumber("011", "000000022"));

    }

    public static Integer accountOperation (String numberToBeOperated) {
        Integer vault = 0;
        for (int i = 0; i < numberToBeOperated.length(); i = i + 3) {
           vault += Integer.parseInt(numberToBeOperated.substring(i,i+1)) * 3 +
                   Integer.parseInt(numberToBeOperated.substring(i+1,i+2)) * 7 +
                   Integer.parseInt(numberToBeOperated.substring(i+2,i+3)) * 3;
        }
        System.out.println(vault);
        return vault;
    }
    public static String getAccountNumber (String threeDigitBankCode, String nubanAcctSerialNumber ) {
//         final String multiplyNUmber = "373";
        Integer checkResult = 0;
        if (threeDigitBankCode.length() != 3) {
            return "This is not a valid three digit bank code";
        }
        String operationalNumber = threeDigitBankCode + nubanAcctSerialNumber;
        Integer operationResult = accountOperation(operationalNumber);
        Integer modulus = operationResult % 10;
        if (modulus == 0) {
            return nubanAcctSerialNumber + "0";
        }
        else {
            checkResult = 10 - modulus;
            return nubanAcctSerialNumber + checkResult;
        }

    }


}
