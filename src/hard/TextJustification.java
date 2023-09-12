package hard;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        //String[] words = {"It", "is", "okay"};
        int maxWidth = 9;
        fullJustify(words, maxWidth).forEach(s -> {
            System.out.println("'" + s + "'" + ",");
        });
    }

    private static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justfiedList = new ArrayList<>();
        int width = 0;
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < words.length) {
            String word = words[i];
            if (word.length() <= (maxWidth - width)) {
                s.append(word);
                width = width + word.length();
                if (width < maxWidth) {
                    s.append(" ");
                    width++;
                }
                if (s.length() == maxWidth) {
                    justfiedList.add(s.toString());
                    width = 0;
                }
                if(i== words.length-1){
                    while(width<maxWidth){
                        s.append("");
                        width++;
                    }
                    justfiedList.add(s.toString());
                }
            } else {
                i--;
                width = width - words[i].length() - 1;
                s.setLength(width);
                while(width < (maxWidth - words[i].length())){
                    s.append(" ");
                    width++;
                }
                s.append(words[i]);
                justfiedList.add(s.toString());
                s.setLength(0);
                width=0;
            }
            System.out.println(justfiedList);
            i++;
        }
        return justfiedList;
    }
}
