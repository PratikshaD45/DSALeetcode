class Solution {
    public int maxScore(String s) {
        int onesCount=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                onesCount++;
            }
        }
        int zerosCount = 0;
        int maxVal = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '0'){
                zerosCount++;
            }else{
                onesCount--;
            }
            maxVal = Math.max(maxVal, onesCount+zerosCount);
        }
        return maxVal;

        
    }
}