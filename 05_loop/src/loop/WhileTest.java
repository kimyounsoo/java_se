package loop;

public class WhileTest {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		
		int a=0;
		
//		while(a<10) {
//			a++; // 1 2 ...9 10
//			System.out.println(a+" ");// 1 2 ... 9 10
//			
//		}//while

		while(true) { //���ѷ���
			a++; // 1 2 ...9 10
			System.out.println(a+" ");// 1 2 ... 9 10
			
			if(a==10) break; //while�� �����
		}
		
		//while(a<10) {
//			a++; // 1 2 ...9 10 a�� ���� 1����
//			System.out.println(a+" ");// 1 2 ... 9 10
			
			//System.out.println(++a + " ");// ���ϰ� ��� 1 2 ... 9 10
			//System.out.println(a++ + " ");// ��� ���ϰ� 0 1 ... 9 10
			
			
		}
	}

