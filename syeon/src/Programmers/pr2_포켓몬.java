package Programmers;

public class pr2_포켓몬 {

	public int solution(int[] nums) {
        //0604 03:49- 
        
        int answer = 0;
        ArrayList<Integer> list =new ArrayList<>();
        
        list.add(nums[0]);
        //arr의 첫번째 값 넣기 
        
        for(int i=1;i<nums.length;i++){
          //0번째는 넣었으니까 1번째부터 보면서 
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                //list에 없을때만 넣기 
            }
        }
               if(list.size()>nums.length/2){
                   answer=nums.length/2;
                   //만약 list 크기가 num/2보다 크면, 1예시처럼 고른 경우에 포켓몬이 다 다른 것 
               }else{
                   answer=list.size();
                   //아닐때는 리스트에 다르게 들어간 갯수만큼 다른것 (예3)
               }
        
    
        return answer;
    }
	
}
