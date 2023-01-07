package read.write.excel.encryption;

//import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException; //
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException; //
import javax.crypto.NoSuchPaddingException; //
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException; //
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;  //
import java.security.NoSuchAlgorithmException; //
import java.text.SimpleDateFormat;
import java.util.Locale;


public class DataEncryption {

    public static void main(String[] args) {
//
//try {
//    // The String to be encrypted. This is the same name that will be produced after descryption
//    String stringToBeEncrypted = "897$%@&#01aslja563adhhgdg47shf#g@!";
//    //This is the Key that we are using for encryption. We will use the same key for decryption
//    byte[] keyBytes = "KeyForEncryption".getBytes();
//    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//    SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
//    // The Encrypt Mode
//    cipher.init(Cipher.ENCRYPT_MODE, key);
//    //Encryption
//    byte[] cipherText = cipher.doFinal(stringToBeEncrypted.getBytes(StandardCharsets.UTF_8));
//    //Encode Characters
//    String encodedTxt = Base64.encodeBase64URLSafeString(cipherText);
//    //Here is the Encrypted String
//    System.out.println("Encrypted String  : " + encodedTxt);
//
//
//
//    // Decrypt Mode.
//    cipher.init(Cipher.DECRYPT_MODE, key);
//// Decoding the encrypted String
//// encodeTxt is the output of the Enctyption (above code)
//    String decodeStr = URLDecoder.decode(encodedTxt,StandardCharsets.UTF_8.toString());
////Decode - to base 64 Safe
//    byte[] base64decodedTokenArr = Base64.decodeBase64(decodeStr.getBytes(StandardCharsets.UTF_8));
//    byte[] decryptedPassword = cipher.doFinal(base64decodedTokenArr);
//    System.out.println("Token after decryption: " + new String(decryptedPassword));
//} catch (Exception e) {
//    e.printStackTrace();
//}
    }
}
