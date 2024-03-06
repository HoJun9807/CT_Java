class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int c = Integer.parseInt(strA+strB);
        int d = Integer.parseInt(strB+strA);
        
        if(c>d){
            answer = c;
        }else if(c<d){
            answer = d;   
        }else if(c==d){
            answer = c;
        }
        
    
        
        
        return answer;
    }
}