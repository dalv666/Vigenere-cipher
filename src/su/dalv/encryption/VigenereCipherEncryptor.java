package su.dalv.encryption;

public class VigenereCipherEncryptor {

    private static VigenereCipherEncryptor vigenereCipherEncryptor;

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";



    public static VigenereCipherEncryptor getInstance(){
        if (vigenereCipherEncryptor == null){
            init();
        }
        return vigenereCipherEncryptor;
    }

    private static void init(){
        vigenereCipherEncryptor = new VigenereCipherEncryptor();
    }

    public String encrypt(String text, String key){
        StringBuilder encryptMessage = new StringBuilder("");
        text = text.toLowerCase();
        key = key.toLowerCase();
        for(int i=0; i<text.length();i++){
            if(-1 != ALPHABET.indexOf(text.charAt(i))){
                for(int j=0; j<key.length();j++){
                    int position = ALPHABET.indexOf(text.charAt(i));
                    int keyPosition = ALPHABET.indexOf(key.charAt(j));
                    encryptMessage.append(ALPHABET.charAt((position+keyPosition)%ALPHABET.length()));
                    i++;
                }
                i--;
            }

        }
        return encryptMessage.toString();
    }

}
