package String;

public class StringToArray {
    public static void main(String args[])
    {

        String str = "hundekar";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }
    }
}
