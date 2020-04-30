package String;

public class cospro_3_4_겹치는문자열합치기 {
	public static void main(String[] args) {
		String s1 = "ababc";
		String s2 = "abcdab";
		
		int len=0;
		
		if(s1.length()>s2.length())
			len=s2.length();
		else
			len= s1.length();
			
		String a1 = "";
		String a2 = "";
		
		int num = 1;
		for(int i=0; i<len; i++,num++) {
			if(s1.substring(s1.length()-num,s1.length()).equals(s2.substring(0, num)))
				a1 = s1.substring(0,s1.length()-i-1) + s2;
		}
		
		num= 1;
		for(int i=0; i<len; i++,num++) {
			if(s2.substring(s2.length()-num,s2.length()).equals(s1.substring(0, num)))
				a2 = s2.substring(0,s2.length()-i-1) + s1;
		}
		
		System.out.println("1" + a1);
		System.out.println("2" + a2);
 	}
}
