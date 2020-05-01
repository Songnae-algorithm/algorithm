package String;

public class cospro_3_5_happybirthday {

   static public String solution(String phrases, int second) {
        String answer = "";
        String display = "";
        display = "______________" + phrases;
        
        for(int i = 0; i < second; ++i) {
        	System.out.println(display +  " "+Character.toString(display.charAt(0)));
        	
        	//display 맨앞거를 뒤에 붙이고
        	display = display + Character.toString(display.charAt(0));

        	//맨앞을 제거한다
        	display = display.substring(1);
        }
        
        //앞에서부터 14개만
        answer = display.substring(0,14);
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "happy-birthday";
		System.out.println(solution(s, 20));
		
	}
}
