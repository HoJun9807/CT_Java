class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String b = my_string.substring(overwrite_string.length()+s);
        String a = my_string.substring(0,s);
        
        answer =  a + overwrite_string + b;
        
        return answer;
    }
}

