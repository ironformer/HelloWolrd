
public class Calc {

	public static void main(String[] args) {
		double sum = 0.0;
		
		for(int i=0; i<args.length;i++) {//인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); //문자열을 실수(double타입)로 변환해 합산
		}
		System.out.println("합계 :"+sum);//run>run configuration>java app>파일명>argument탭에 요소당 띄어쓰기 한칸 씩 해서 입력
	}

}
