package Medium;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "bbaa";
        List<String> wordDict = Arrays.asList("a","b","bbb","bbbb");
        boolean contains = true;
        int i = 0;
        while(i < wordDict.size() && !s.isEmpty()){
            String str = wordDict.get(i);
            if(s.contains(str)){
                s = s.replaceFirst(str,"");
                i = 0;
                System.out.println(s);
                contains = true;
            }
            else{
                i++;
                contains = false;
            }

        }
        if(contains){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
