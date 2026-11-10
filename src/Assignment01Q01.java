public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String string : args) {
            char first_char = string.charAt(0); 
            int first_char_number = (int)first_char; 
            if ((first_char_number%5)==0) {
                System.out.println(first_char); 
            }
        }
    }
}
