public class RemoveDuplicateFromString {
    public static boolean[] map = new boolean [26]; // Size 26 because count of english alphabets is 26.
    public static void removeDuplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){ /* Logic : char-char = int value ex: z-a = 25 (according to 0 based indexing english
            alphaets have 25 characters 0 to 25 = 26 characters in total)*/
            removeDuplicate(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar-'a'] = true; // updtaed character index as true so that next time it comes then it will not be added to newString.
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0, "");
    }
}
