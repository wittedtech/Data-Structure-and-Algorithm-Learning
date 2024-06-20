public class SubsequencesOfString {
    public static void printSubsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        printSubsequences(str, idx+1, newString+str.charAt(idx)); // Include current character
        printSubsequences(str, idx+1, newString); // Exclude current character
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}
