import java.util.Scanner;
public class ChangeMoneyAssginment {

	public static void main(String[] args) {
		
		Scanner pri = new Scanner(System.in); //원화 가격 입력
		
		System.out.print("가격 입력(원): " );
		int price = pri.nextInt();
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};//cash unit
		for(int i=0; i < unit.length; i++) { //배열의 길이만큼 반복
			if((price / unit[i] == 0)) {
				price = price % unit[i];//i번 액수 화폐가 필요 없을 경우 남은 가격이 (i+1)번 액수 화폐 필요 갯수 계산에 사용됨 
			}else {
				System.out.println(unit[i] + "원 화폐: " + (price / unit[i]) + "개 필요");//i번 액수 화폐 필요 갯수
				price = price % unit[i];//i번 액수 화폐를 제외하고 남은 가격이 (i+1)번 액수 화폐 필요 갯수 계산에 사용됨 
			}
		}

	}

}
