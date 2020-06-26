public class Main {

    public static void main(String[] args) {
        //indexOf,substring
        String example = "W Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie.";
        int start = example.indexOf("Sz");
        int end = example.indexOf("nie", 1);
        String substring = example.substring(start, end + 3);
        System.out.println("substring = " + substring);
    }
}
