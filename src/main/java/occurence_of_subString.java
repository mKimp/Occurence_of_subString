import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class occurence_of_subString {
    public static void main(String[] args) {
        count_subString("bc","bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef232423bc32");
    }

    public static void count_subString(String pattern, String blobs){
        string_manipulate answer = new string_manipulate(pattern, blobs);
        String final_answer = answer.split_String();
        System.out.println(final_answer);
    }
    static class string_manipulate {
        String pattern;
        String blobs;
        string_manipulate(String pattern, String blobs){
            this.pattern = pattern;
            this.blobs = blobs;
        };
        public String split_String() {
            int countR = countRegex(blobs);
            String r = " ";
            String[] splitString = blobs.split("\\|", countR + 1);
            int total = 0;
            for (String temp : splitString) {
                if (pattern.isEmpty()){
                    r  += "0|";
                }
                else {
                    int matching = unique(temp, pattern);
                    total += matching;
                    r = r + matching + '|';
                }
            }
            String FINAL = r + total;
            return FINAL;
        }
        private static int unique(String temp, String pattern) {
            Pattern regex = Pattern.compile(pattern);
            Matcher match = regex.matcher(temp);
            int count = 0;
            int pos = 0;
            while (match.find(pos)) {
                ++count;
                pos = match.start() + 1;
            }
            return count;
        }
        private static int countRegex(String b) {
            int countR = 0;
            for (int i = 0; i < b.length(); ++i){
                if (b.charAt(i) == '|'){
                    ++countR;
                }
            }
            return countR;
        }

    }
}
