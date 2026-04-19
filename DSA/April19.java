class Solution {
    public int balancedStringSplit(String s) {
        int ctR = 0; 
        int ctL = 0;
        int balaStr = 0;
        for(char c : s.toCharArray()){
            if(c == 'R') ctR++;
            else if(c == 'L') ctL++;
            if(ctR != 0 && ctR == ctL){
                balaStr++;
                ctR = 0;
                ctL = 0;
            }
        }
        return balaStr;
    }
}