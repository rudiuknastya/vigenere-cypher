package task5;

public class VigenereCipher {
    public void encrypt(String str, String key){
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
    public void decrypt(String str, String key){
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
    
}
