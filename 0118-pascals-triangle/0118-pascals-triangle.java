class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for(int row = 1 ;row <=numRows; row++){
            for(int i=0 ;i<row ;i++){
                if(i==0 || i==row-1){
                    cur.add(1);
                }
                else{
                    cur.add(prev.get(i)+prev.get(i-1));
                }
            }
            prev =cur;
            cur = new ArrayList<>();
            ans.add(prev);
        }
        return ans;
    }
}