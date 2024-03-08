class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = num_list[0];
        int square = 0;
        
        for(int i = 1; i < num_list.length; i++){
            mul = mul*num_list[i];
        }
        
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
        }
        square = sum*sum;
        
        if(mul < square){
            answer = 1;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}