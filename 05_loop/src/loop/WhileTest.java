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

		while(true) { //무한루프
			a++; // 1 2 ...9 10
			System.out.println(a+" ");// 1 2 ... 9 10
			
			if(a==10) break; //while를 벗어나라
		}
		
		//while(a<10) {
//			a++; // 1 2 ...9 10 a의 값을 1증가
//			System.out.println(a+" ");// 1 2 ... 9 10
			
			//System.out.println(++a + " ");// 더하고 찍고 1 2 ... 9 10
			//System.out.println(a++ + " ");// 찍고 더하고 0 1 ... 9 10
			
			
		}
	}

