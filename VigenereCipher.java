package task5;

import java.util.Scanner;

public class VigenereCipher {
    private void encrypt(String str, String key){
        String stringToEncode = str.toUpperCase();
        String keyword = key.toUpperCase();
        int j = 0;
        String encodedText = "";
        for(int i = 0; i < stringToEncode.length(); i++){
            int n = (stringToEncode.charAt(i) + keyword.charAt(j)) % 26;
            n += 'a';
            encodedText += (char)(n);
            j++;
            if(j >= keyword.length()){
                j=0;
            }
        }
        System.out.println(encodedText);
    }
    private void decrypt(String str, String key){
        String stringToDecode = str.toUpperCase();
        String keyword = key.toUpperCase();
        int j = 0;
        String decodedText = "";
        for(int i = 0; i < stringToDecode.length(); i++){
            int n = (stringToDecode.charAt(i) - keyword.charAt(j) + 26) % 26;
            n += 'a';
            decodedText += (char)(n);
            j++;
            if(j >= keyword.length()){
                j=0;
            }
        }
        System.out.println(decodedText);
    }
    public void work(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like: 1.Encrypt 2.Decrypt ");
        System.out.println("Your Enter: ");
        String s = scanner.nextLine();
        int choise = Integer.parseInt(s);
        if(choise == 1){
            System.out.println("Enter text to encrypt: ");
            String text = scanner.nextLine();
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            encrypt(text,key);
        } else if (choise == 2) {
            System.out.println("Enter text to decrypt: ");
            String text = scanner.nextLine();
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            decrypt(text,key);
        }
    }
}
