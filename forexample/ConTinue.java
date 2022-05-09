
public class ConTinue {

	public static void main(String[] args) {
		// continue문 - 조건시으로 이동
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i); // want 짝수 출력
		}

	}

}
