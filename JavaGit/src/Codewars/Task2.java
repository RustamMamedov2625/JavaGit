package Codewars;
//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class Task2 {
    public static String reverseWords(final String original){
        String result = "";
        String substringOriginal = "";
        for(int i = 0; i < original.length(); i++){
            if (!String.valueOf(original.charAt(i)).equals(" ")){
                substringOriginal = String.valueOf(original.charAt(i)) + substringOriginal;
            }
            else {
             result += substringOriginal + " ";
             substringOriginal = "";
            }

        }
        result += substringOriginal;
        System.out.println(substringOriginal);
        return result;
    }
}

/*My old code. Doesn't work correct with String "   ". Expected "   " but was "".
        String[] words = original.split(" ");
        String result = "";
        for(String word: words){
            for(int i = word.length(); i > 0; i--){
                result += word.charAt(i - 1);
            }
            if(word != words[words.length - 1])
                result += "__";
            else break;
        }
        return result;
* */
/* Code from CHAT-GPT. Doesn't work correct with String "   ". Expected "   " but was "".
    String[] words = original.split(" ");
    StringBuilder reversedString = new StringBuilder();
    StringBuilder reversedWord;
    for (String word: words) {
      reversedWord = new StringBuilder(word);
        reversedString.append(reversedWord.reverse()).append(" ");
    }
    return reversedString.toString().trim();
* */