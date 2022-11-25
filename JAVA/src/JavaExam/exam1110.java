package JavaExam;

import java.util.Scanner;

public class exam1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = num;
		int count = 0;
		
		while(true) {
			int ten = sum / 10;
			int one = sum % 10;
			sum = one * 10 + (ten + one) % 10;
			count ++;
			
			if(num == sum) {
				break;
			}
		} // while

		System.out.println("숫자" + num + "의 사이클은" + count + "번입니다.");
	
	}

}
