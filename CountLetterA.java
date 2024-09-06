import java.util.Scanner;

public class CountLetterA {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        
        int count = countLetterA(texto);
        
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int countLetterA(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        
        return count;
    }
}
