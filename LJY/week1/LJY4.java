class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt=0;
        int idx=0;
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        
        for(int j=0; j<numlist.length; j++) {
            if(numlist[j]%n==0) {
                answer[idx]=numlist[j];
                idx++;
            }
        }    
        return answer;
    }
}