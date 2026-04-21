public class rep {
    public static void main(String[] args) {
        String str1 = "Sathya";
        String result = "";
        for (int i = 0 ; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if (result.indexOf(ch) == -1){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
