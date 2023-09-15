import java.util.Scanner;
public class Siple369 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter integer value(1~99) : ");
		int number = scan.nextInt(); // 1에서 99 사이의 숫자 입력
		if((number < 100)) { 
			if(((number/10 == 3) || (number/10 == 6) || (number/10 == 9)) && ((number%10 == 3) || (number%10 == 6) || (number%10 == 9))) { //입력된 숫자에서 3, 6, 9가 두개 일 때
				System.out.print("박수짝짝");
			}else if((number/10 == 3) || (number/10 == 6) || (number/10 == 9)) { //입력한 숫자에서 십의 자리에만 3, 6, 9가 있을 때
				System.out.print("박수짝");
			}else if((number%10 == 3) || (number%10 == 6) || (number%10 == 9)) { //입력한 숫자에서 일의 자리에만 3, 6, 9가 있을 때
				System.out.print("박수짝");
			}else { //입력한 숫자에 3, 6, 9가 포함되지 않았을 때
				System.out.print("3, 6, 9가 포함되지 않은 숫자");
			}
		}else { // 입력한 숫자가 1~99를 벗어났을 때
			System.out.print("범위를 벗어난 숫자를 입력하였습니다.");
		}
		scan.close();
	}

}
