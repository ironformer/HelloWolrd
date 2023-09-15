
public class CastgingTest2 {

	public static void main(String[] args) {
		
		int i = '1';//int형 변수에 문자값 배정
		int j = 'A';//int형 변수에 문자값 배정
		int k = '1' + 'A';//int형 변수에 문자값의 연산 결과를 배정
		System.out.println("'1' = " + i);
		System.out.println("'A' = " + j);
		System.out.println("'1'+'a' = " + k);
		int l = 66;
		System.out.println("10진수 66에 해당되는 유니코드 문자는 " + (char)l + "입니다");//int형 값을 char형으로 형 변환 해 출력

	}


}
