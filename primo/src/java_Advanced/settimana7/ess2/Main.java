package java_Advanced.settimana7.ess2;

public class Main{
    public static void main(String[] args) {
        System.out.println(checkString("Questa è una stringa"));
    }

    private static String checkString(String value) {
        String result = value.length() >= 10 ? "Lunghezza maggiore o uguale di 10":"Lunghezza minore di 10";
        return result;
        
}
}


