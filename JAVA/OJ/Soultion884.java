//884. 两句话中的不常见单词
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
          Map<String,Integer>  mp = new HashMap<>();

            for(String x:A.split(" ")){
                mp.put(x,mp.getOrDefault(x,0)+1);
            }

            for(String x:B.split(" ")){
                mp.put(x,mp.getOrDefault(x,0)+1);
            }
            List<String> ans = new LinkedList<>();
            for(String  x:mp.keySet()){
                if(mp.get(x) == 1){
                    ans.add(x);
                }
            }
            
            return ans.toArray(new String[ans.size()]); 
    }
}