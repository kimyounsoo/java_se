package loop;

/*
 * ���� �빮��(A~Z)�� 100�� �߻��Ͽ� 1�ٿ� 10���� ����Ͻÿ�
 * ���� 65~90 ������ ���ڸ� 100�� �߻��Ͽ� ����Ͻÿ�
 * ����A�� ����� ����Ͻÿ�
 */
public class ForTest3 {

	public static void main(String[] args) {
		int num;
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			num=(int)(Math.random()*26)+65; //65~90 90-65+1 = 26
		System.out.printf((char)num+ " ");
		//System.out.printf("%-2c",(char)num);
		
		if(i%10==0) System.out.println();
		
		if(num == 'A') count++; //count = + 1
	}
		System.out.println();
		System.out.println("A�� ���� = "+ count);
		
}

}
