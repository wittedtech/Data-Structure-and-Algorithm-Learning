package HackerRank_Code_Practice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TagContentExtractor {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        final Pattern pattern = Pattern.compile("<(.+)>([^<>]+)</\\1>");
		while(testCases>0){
			String line = in.nextLine();
          	Matcher matcher = pattern.matcher(line);

            if(!matcher.find()){
                System.out.println("None");
            }else{
                System.out.println(matcher.group(2));
                while(matcher.find()){
                    System.out.println(matcher.group(2));
                }
            }
			
			testCases--;
		}
        in.close();
	}

}
