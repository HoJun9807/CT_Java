class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && a!=c && b!=c){
            answer = a+b+c;
        }else if(a==b && c!=a && c!=b){
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else if(a==c && b!=a && b!=c){
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else if(b==c && a!=b && a!=c){
            answer = (a+b+c)*(a*a+b*b+c*c);
            
        }else if(a==b && a==c && b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            
        }
        return answer;
    }
}