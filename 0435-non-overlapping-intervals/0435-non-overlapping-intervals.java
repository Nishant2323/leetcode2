class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<Pair> list = new ArrayList<>();
        for(int[] a1 : intervals){
            list.add(new Pair(a1[0],a1[1]));
        }
        Collections.sort(list,(a,b)->a.second - b.second);
        for(Pair p : list){
            System.out.println( p.first + " -> "+ p.second);
        }
        int count=0;
        for(int j =1 , k=0 ; j<list.size()&& k<list.size();j++){
            if(list.get(k).second>list.get(j).first){
               count++; 
            }
            else{
                k=j;
            }
        }
        return count;
    }
    
}
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second= second;
    }
}