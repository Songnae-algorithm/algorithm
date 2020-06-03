package Programmers;

public class pr2_JadenCase문자열만들기 {

	public String solution(String s) {
        //0604 01:28- 14: 30
        String answer = "";
        s=s.toLowerCase();//전체를 소문자로 바꿈
       
       
        String arr[]=s.split(" ");
        
       for(int i=0;i<arr.length;i++){
            
        if(!(arr[i].equals(""))){//공백이아니면
            
        String c =Character.toString(arr[i].charAt(0));
            
            c=c.toUpperCase();
            //맨 앞글자만 짤라서 대문자로 바꿈
           arr[i]=arr[i].substring(1,arr[i].length());
            //arr[i]의 0번째(맨 앞)을 지워주기 위해서 1번째부터 마지막까지 잘라서 넣기
            arr[i]=c+arr[i];
            //대문자로 바꾼 맨 앞글자를 앞에 추가
            
            answer+=arr[i]+ " ";
            
        }else{
            answer+=" ";//공백일 때. 공백은 그냥 추가해주기(이것땜에 틀림...공백 다 없애야 하는줄 알았따..)
            
            continue;
        
        }
           
       }
       System.out.println(answer);
       
        if(s.charAt(s.length()-1)!=' '){
        answer=answer.substring(0,answer.length()-1);
        }
      //  원래의 s의 마지막이 공백이 아니면 마지막에 " " 공백제거
        
        
        return answer;
    }
}
