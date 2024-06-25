import java.util.HashSet;

public class UniqueSubsequencesOfString {
    public static void printSubsequences(String str, int idx, String newString, HashSet<String> set){
        //used set to contain only unique subsequences.
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        printSubsequences(str, idx+1, newString+str.charAt(idx), set);
        printSubsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        printSubsequences(str, 0, "", set);
    }
}
