package Hash;

import java.util.*;

public class prog_3_베스트엘범 {

    static public int[] solution(String[] genres, int[] plays) {
       int[] answer = {};
        
       HashMap<String, Integer> map1 = new HashMap<String,Integer>(); //제일 큰 장르 수
       HashMap<String, Integer> map2 = new HashMap<String,Integer>(); //고유번호_장르, 플레이 수
        
       for(int i=0;i<genres.length; i++) {
    	   //장르를 key, 모든 값을 다 더한걸 value
    	   if(map1.containsKey(genres[i]))
        		map1.put(genres[i], plays[i] + map1.get(genres[i]));
        	else
        		map1.put(genres[i], plays[i]);
        	//고유번호_장르를 key, 값을 value
    	    map2.put(i+"_"+genres[i], plays[i]);
        }
       
       //map1 내림차순 정렬
       List<Map.Entry<String, Integer>> list0 = new LinkedList<>(map1.entrySet());
       
       Collections.sort(list0,new Comparator<Map.Entry<String, Integer>>(){
    	   @Override
    	   public int compare(Map.Entry<String, Integer>o1,Map.Entry<String, Integer>o2) {
    		   int comparision = (o1.getValue()- o2.getValue())* -1;
    		   return comparision == 0? o1.getKey().compareTo(o2.getKey()) : comparision;
    	   }
       });
       
       Map<String, Integer> sortedMap1 = new LinkedHashMap<>();
       for(Iterator<Map.Entry<String, Integer>> iter = list0.iterator(); iter.hasNext();) {
    	   Map.Entry<String, Integer> entry = iter.next();
    	   sortedMap1.put(entry.getKey(),entry.getValue());
       }
       
       //map2 내림차순 정렬
       List<Map.Entry<String, Integer>> list = new LinkedList<>(map2.entrySet());
       
       Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
    	   @Override
    	   public int compare(Map.Entry<String, Integer>o1,Map.Entry<String, Integer>o2) {
    		   int comparision = (o1.getValue()- o2.getValue())* -1;
    		   return comparision == 0? o1.getKey().compareTo(o2.getKey()) : comparision;
    	   }
       });
       
       Map<String, Integer> sortedMap = new LinkedHashMap<>();
       for(Iterator<Map.Entry<String, Integer>> iter = list.iterator(); iter.hasNext();) {
    	   Map.Entry<String, Integer> entry = iter.next();
    	   sortedMap.put(entry.getKey(),entry.getValue());
       }
       
       
       ///여기서부터 찐답!!!!!!!!!!!!!!!
       List<String> last_list = new LinkedList<>();
       List<String> idx_list = new LinkedList<>();
       PriorityQueue<Integer> answer_list = new PriorityQueue<>(Comparator.reverseOrder());
       
       //정렬된 map1의 이름을 정렬된 map2가 key값에 포함하고 있다면!
       Iterator<String> keys = sortedMap1.keySet().iterator();
       while(keys.hasNext()) {
    	   String key = keys.next();
		   
    	   Iterator<String> keyss = sortedMap.keySet().iterator();
		   
    	   while(keyss.hasNext()) {
    		   keyss.next();
    		   for(int i=0; i<sortedMap.size(); i++) {
    			   String a = i+"_"+key;
	    		   
	    		   if(sortedMap.get(a) != null) {
	   			   System.out.println("i= " + i +" value = " + sortedMap.get(a) +" key = " + a);
	    			   String s[] = a.split("_");
	    			   idx_list.add(s[0]);
	    			   answer_list.add(sortedMap.get(a));
	    		   }
    		   }//for
    	   }//while
    	   
    	   System.out.println(answer_list);
    	   
		   //다 끝나고 나가기 전에 list 새로 만들어서 reverseOrder만들고 한개면 _앞까지 끊어서 넣고 끊어서 넣기
		   int j = 0;
		   while(!answer_list.isEmpty() && j<=1) {
			   last_list.add(idx_list.remove(0) +" " +answer_list.poll());
			   j++;
		   }
		   
		   answer_list.clear();
       }
       
       System.out.println(last_list);
        return answer;
    }	
	
	public static void main(String[] args) {
		String g[] = {"cl","pop","cl","cl","pop"};
		int p[] = {500,600,150,800,2500};
		solution(g,p);
	}
}
