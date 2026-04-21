public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String words[] = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String rev = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev = rev + words[i].charAt(j);
            }

            if (i == words.length - 1)
                result = result + rev;
            else
                result = result + rev + " ";
        }

        System.out.println(result);
    }
}