public class Main {
    public String password;

    public static String randomPassword(int length) {
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$&";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand =   (int)  (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    public static void main(String[] args) {
       System.out.println("******* Password Generator *******");
        int defaultPasswordLength= 8;
        String password = randomPassword(defaultPasswordLength);
        System.out.println("Yours password is :" + password);
    }

}