public class Main {
    public static void main(String[] args) {

        final String secretKey = "donotspeakAboutTHIS";
        String originalString = "Secret Site : = http://10.67.84.101";

        String encSite = MyAesApp.encrypt(originalString,secretKey);
        String decSite = MyAesApp.decrypt(encSite,secretKey);
        System.out.println("Original :" +originalString);
        System.out.println("Encrypted :" +encSite);
        System.out.println("Decrypted :" +decSite);

    }
}
