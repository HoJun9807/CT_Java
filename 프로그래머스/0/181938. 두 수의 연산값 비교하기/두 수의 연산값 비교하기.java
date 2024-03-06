class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA =  Integer.toString(a); 
        String strB =  Integer.toString(b); 
        int c =  Integer.parseInt(strA+strB); 
        
        if(c>2*a*b){
            answer = c;
        }else if(c<2*a*b){
            answer =2* a*b;
        }
        
        return answer;
    }
}