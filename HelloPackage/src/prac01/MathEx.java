package prac01;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.PI);//원주율 상수 출력
		
		double a = Math.PI;
		System.out.println(Math.ceil(a));//올림
		System.out.println(Math.floor(a));//내림
		
		System.out.println(Math.sqrt(9));//제곰근
		System.out.println(Math.exp(2));//e의 2승
		System.out.println(Math.round(3.14));//반올림
		
		System.out.println("이번주 행운의 번호는 ");
		for(int i = 0; i<5;i++) {
			System.out.println((int)(Math.random()*45 + 1));
		}
		System.out.println();

	}

}
