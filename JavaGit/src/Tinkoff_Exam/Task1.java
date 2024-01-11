package Tinkoff_Exam;

public class Task1 {
    public static String encryptPassword(String password){
        return  password.replaceAll("code\\d+", "???");
    }
}

