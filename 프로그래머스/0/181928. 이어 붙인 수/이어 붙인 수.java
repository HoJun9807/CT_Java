class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String pluSum = "";
        String miuSum = "";
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                pluSum += String.valueOf(num_list[i]);
            }else{
                miuSum += String.valueOf(num_list[i]);
            }
        }
        
        a =  Integer.parseInt(pluSum);
        b =  Integer.parseInt(miuSum);  
        answer = a+b;
        
        
        return answer;
    }
}