package su.dalv.encryption;


public class Test {

    public static void main(String[] args) {
        VigenereCipherEncryptor vigenereCipherEncryptor = VigenereCipherEncryptor.getInstance();
        System.out.println(vigenereCipherEncryptor.encrypt("seeyouatnoon","spy"));
    }
}
