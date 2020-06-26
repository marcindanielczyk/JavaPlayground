

public class Main {

    public static void main(String[] args) {
        //indexOf, lastindexOf
        String example = "W Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie. ";
        int indexOf = example.indexOf("Szcze");
        int indexOf2 = example.indexOf("Szcze", 7);
        System.out.println("indexOf = " + indexOf);
        System.out.println("indexOf2 =" + indexOf2);

        //startsWith, endsWith
        String example2 = "W Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie. ";
        boolean startsWith = example2.startsWith("W S");
        boolean startsWith2 = example2.startsWith("W S", 10);
        boolean endsWith = example2.endsWith("ie. ");
        System.out.println("startsWith = " + startsWith);
        System.out.println("startsWith2 = " + startsWith2);
        System.out.println("endsWith = " + endsWith);

    }
}
