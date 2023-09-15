
public class CastingTest1 {

	public static void main(String[] args) {
		byte b = 120;
		int i = b;//byte값을 int형 변수에 저장
		System.out.println("확대 형 변환 : " + i);
		int j = 259;
		double d = 259.428;
		System.out.println("축소 형 변환 결과");
		b = (byte) j;//int형 값을 byte형으로 ㅕㅎㅇ 변환하여 저장(값손실 발생)
		System.out.println("int 259를 byte로 : " + b);
		i = (int) d;//double형의 값을 int형으로 형 변화하여 저장(값의 손실 발생)
		System.out.println("double 259.428을 int로 : " + i);
		b =(byte) d;//double형의 값ㅇ르 byte형으로 형 변환하여 저장(값손실 발생)
		System.out.println("double 259.428을 byte로 : " + b);

	}

}
