package TopInterview150;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQ";
        //System.out.println(convert(s,5));
        for(int i=0; i<5; i++){
            int j = i;
            int count = 0;
            int jump = 8;
            int incr = 8;
            while(j<17){
                j = j + (count%2)*incr + (count+1)%2 *(jump-incr);
                System.out.print(j+ " ");
                count++;
            }
            incr -= 2;
            System.out.println();
        }
    }

    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int jumpEven = (numRows -1)*2;
        int jumpOdd = 0;
        for(int i=0; i<numRows; i++){
            int j = i;
            int count = 0;
            while(j<s.length()){
                sb.append(s.charAt(j));
                if(count%2==0){
                    j = j + jumpEven;
                }
                else{
                    j = j + jumpOdd;
                }
                count++;
            }
            jumpEven -= 2;
            jumpOdd += 2;
        }
        return sb.toString();
    }
}
