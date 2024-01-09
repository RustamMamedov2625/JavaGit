package Codewars;
//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java


public class JadenCase {
    // TODO put your code below this comment
    public static String toJadenCase(String phrase) {
        if(phrase == null | phrase.isEmpty() )
            return null;

        String result = "";
        String stringWord = "";
        for(int i = 0; i < phrase.length(); i++){
            if(!String.valueOf(phrase.charAt(i)).equals(" ")){
                stringWord += String.valueOf(phrase.charAt(i));
            }
            else
            {
                if(stringWord.length() > 1) {
                    stringWord = stringWord.substring(0, 1).toUpperCase() + stringWord.substring(1);
                }
                else{//а тут для строки в одну букву
                    stringWord = stringWord.toUpperCase();
                }
                result += stringWord + " ";
                stringWord = "";
            }
        }
        if(stringWord.length() > 1) {
            stringWord = stringWord.substring(0, 1).toUpperCase() + stringWord.substring(1);
        }
        else{
            stringWord = stringWord.toUpperCase();
        }
        result += stringWord;
        return result;
    }
}


//Code from Shisa
/*
public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        StringBuilder result = new StringBuilder(phrase.length());
        String[] words = phrase.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        return result.length() > 0 ? result.toString().trim() : null;

} */