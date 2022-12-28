package ChatComputer;


public class Main1 {
    public static void main(String[] args) {
        Chat c = new Chat();
        Connect.register();
        Connect.login();
        c.chating();


    }
}
