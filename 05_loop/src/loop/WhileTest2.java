package loop;

public class WhileTest2 {

	public static void main(String[] args) {
		char ch='A';
		int count = 0;
		
		while(ch<='Z') {
		
		System.out.print(ch+" ");//A B C D E F G........ Y Z
		ch++; //B C D E F G H..... Z
		
		count++; //1 2 3 4 5 6 7 ...
		if(count%7==0)System.out.println();
	}

}

}
