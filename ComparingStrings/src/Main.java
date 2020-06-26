public class Main {

    public static void main(String[] args) {

        String text1 = new String("Test");
        String text2 = "Test";
        String text3 = "Te" + "st";

        if(text1.equals(text2)){
            System.out.println("text1 i text2 są sobie równe.");
        }
        if(text1.equals(text3)){
            System.out.println("text1 i text3 są sobie równe.");
        }
        if(text2.equals(text3)){
            System.out.println("text2 i text3 są sobie równe.");
        }
    }
}
