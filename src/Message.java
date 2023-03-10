public class Message {
    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor(3, 4);
        System.out.println(encryptor.encryptMessage("What are you doing next weekend?"));
    }
}
