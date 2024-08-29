package arrays;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfPangram {

    public static void main(String[] args) {

        String s = "thequickbrownfoxjumpsoverthelazydog";
        //checkIfPangram(s);
        System.out.println(checkIfPangram(s));
        System.out.println('b'-97);

    }
    static boolean checkIfPangram(String sentence){
        if(sentence.length() >= 26){
            boolean[] b = new boolean[26];

            for (int i = 0;i<sentence.length();i++){
                b[sentence.charAt(i) - 97] = true;
            }

            for (int i = 0; i < b.length; i++) {
                if (b[i] != true)
                    return false;
            }
            return true;
        }
        return false;
    }
}
