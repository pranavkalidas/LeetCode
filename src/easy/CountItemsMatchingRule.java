package easy;

import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int r = 0;
        if(ruleKey.equals("color"))
            r = 1;
        else if(ruleKey.equals("name"))
            r = 2;
        for(int i=0; i<items.size(); ++i){
            List<String> temp = items.get(i);
            if( temp.get(r).equals(ruleValue))
                count++;
        }
        return count;
    }
}
