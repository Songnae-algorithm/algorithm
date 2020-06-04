package Test;

public class line02 {

	public static void main(String[] args) {
		String answersheet = "4132315142";
		String sheet[] = { "3241523133", "4121314445", "3243523133", "4433325251", "2412313253" };

		int max = 0;

		for (int i = 0; i < sheet.length; i++) {
			// 배열 sheet의 0,1,2,3,4
			for (int j = i + 1; j < sheet.length; j++) {
				// i , j 두개인 이유는 두 응시자 간의 값을 비교해주어야하기 떄문이다.
				int len = 0; //연속됫을때 길이 찾는거 도와줌
				int cnt = 0;//다른거갯수
				int aa=0; //연속된거 길이

				for (int k = 0; k < answersheet.length(); k++) {// 요기서 정답 비교
					if(sheet[i].charAt(k)==sheet[j].charAt(k)&&sheet[i].charAt(k)!=answersheet.charAt(k)) {
						//정답 i번쨰애랑 j 번째 애랑 같은데, 정답이랑도 다를 때 
						cnt++;//다른거 갯수 판별
						len++;//
						
						//왜냐면, 여기 드어왔다는 거는 부정행위 한게 하나라도 있다는 거니까! 근데 k가 맨 끝까지 판단했는데도 aa가 0일떄는 aa=1로 바꿔준다. 
						if(aa==0&&k==answersheet.length()-1) {
							aa=1;
						}
					}else {
						//연속된게 끊어졌을떄. len이 그동안 가졌던 값이랑,aa랑 비교해서 큰 거 넣어줌
						aa=Math.max(aa, len);
						len=0;
						//len은 다시 돌떄 리셋되서 돌아야 하니까 ! 
					}
				}
				max=Math.max(max, cnt+aa*aa);
			}
		}
		System.out.println(max);
	}
}
