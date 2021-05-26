package whiteboard;

public class CaeserCipher {

    public static void main(String[] args) {

        String text = "AttackATOnce";
        int shift = 4;

        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                char ch = (char)(((int)text.charAt(i)+shift-65)%26+65);
                result.append(ch);
            }else {
                char ch = (char) ((text.charAt(i)+shift-97) % 26 +97);
                result.append(ch);
            }
        }
        System.out.println("Cipher is:- "+result);
    }

}
