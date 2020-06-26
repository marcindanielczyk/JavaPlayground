
public class Main {

    public static void main(String[] args) {
        String text = "Hello";
        String text2 = addWorld(text);

        System.out.println(text);
        System.out.println(text2);
    }

    private static String addWorld(String text) {
        return text + " World";
    }
}
