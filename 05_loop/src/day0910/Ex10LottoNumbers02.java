package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

// �ζ� ��ȣ���۱� 2��
// ����ڷκ��� ���ڸ� �Է� �޾Ƽ�
// 6���� �� ������: 1��
// 5���� ������: 2��
// 4��: 3��
// 3��: 4��
// �� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
// �� ����ڰ� 1~45�� ��� ���� �Է��ϸ�
// �ùٸ� ���� �Է��Ҷ����� �ٽ� �Է��� �ϰ� ���弼��

// ���α׷� ����:
// �ζǹ�ȣ ��÷ �Ϸ�
// 1��° ���ڸ� �Է��ϼ���: 3
// 2��° ���ڸ� �Է��ϼ���: 1
// 3��° ���ڸ� �Է��ϼ���: 1000
// �߸� �Է��ϼ̽��ϴ�.
// 3��° ���ڸ� �Է��ϼ���: -150
// �߸� �Է��ϼ̽��ϴ�.
// 3��° ���ڸ� �Է��ϼ���: 43
// 4��° ���ڸ� �Է��ϼ���: 23
// 5��° ���ڸ� �Է��ϼ���: 12
// 6��° ���ڸ� �Է��ϼ���: 11
// ����� ��ȣ �� �����߽��ϴ�.
// �� 4�� ���߼̽��ϴ�. 3�� ��÷�Դϴ�!!! (55�б���)
public class Ex10LottoNumbers02 {
   final static int SIZE = 6;
   final static int MAX = 45;
   public static void main(String[] args) throws NumberFormatException, IOException {
      //���� ��÷ �迭�� ����
      //�ߺ����� �ʴ� ������ �ְ� ����������
      int[] lottoNumbers = new int[SIZE];
      Random random = new Random();
      //1-A. lottoNumbers�� ���� �Է�
      for(int i = 0; i < lottoNumbers.length; i++) { //lottoNumbers.length -> SIZE ���ص���??
         lottoNumbers[i] = random.nextInt(MAX) + 1;
      }
      
      //1-B. lottoNumbers���� �ߺ� ����
      for(int i = 0; i < lottoNumbers.length; i++) {
         for(int j = 0; j < lottoNumbers.length; j++) {
            if(i != j && lottoNumbers[i] == lottoNumbers[j]) {
               lottoNumbers[i] = random.nextInt(MAX) + 1;
               j = -1;
            }
         }
      }
      
      //1-C. lottoNumbers�� ���� ����
      for(int i = 0; i < lottoNumbers.length - 1; i++) {
         if(lottoNumbers[i] > lottoNumbers[i+1]) {
            int temp = lottoNumbers[i];
            lottoNumbers[i] = lottoNumbers[i+1];
            lottoNumbers[i+1] = temp;
            i = -1;
         }
      }
      System.out.println("�ζ� ��ȣ ��÷ �Ϸ�");
      
      //2. ����� ��ȣ �迭 �Է��� �غ�����
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      int[] userNumbers = new int[SIZE];
      
      //2-A. ����ڷκ��� ���� �Է� �ޱ�
      for(int i = 0; i < userNumbers.length; i++) {
         System.out.print((i+1)+"��° ���ڸ� �Է����ּ���: ");
         int number = Integer.parseInt(bufferedReader.readLine());
         
         //6 13 0 0 0 0
         
         
         //�ߺ��� �Է��ϸ� true�� boolean ������ ����ǵ��� ������
         boolean isDuplicated = false;
         for(int j = 0; j < i; j++) {
            if(number == userNumbers[i]) {
               isDuplicated = true;
            }
         }
         
         while(number < 0 || number > MAX || isDuplicated) {
            System.out.println("�߸��Է��ϼ̽��ϴ�.");
            System.out.print((i+1)+"��° ���ڸ� �Է����ּ���: ");
            number = Integer.parseInt(bufferedReader.readLine());
            
            isDuplicated = false;
            for(int j = 0; j < i; j++) {
               if(number == userNumbers[i]) {
                  isDuplicated = true;
               }
            }
         }
         userNumbers[i] = number;
         
      }
      //2-B. ����ڰ� �Է��� ���ڷ� �̷���� �迭�� �����ϱ�
      for(int i = 0; i < userNumbers.length - 1; i++) {
         if(userNumbers[i] > userNumbers[i+1]) {
            int temp = userNumbers[i];
            userNumbers[i] = userNumbers[i+1];
            userNumbers[i+1] = temp;
            i = -1;
         }
      }
      
      //3. �� �迭�� ���ؼ�
      //   ���� ���ڰ� ���� ������ ������ 1���� �÷�����
      int score = 0;
      for(int i = 0; i < lottoNumbers.length; i++) {
         for(int j = 0; j < userNumbers.length; j++) {
            //lottoNumbers[i]��°��
            //userNumber ��ü�� ���ؼ�
            //�ѹ��̶� ������ score++; ���ָ� �ȴ�.
            if(lottoNumbers[i] == userNumbers[j]) {
               score++;
            }
         }
      }
      
      //4. �� �迭�� 0~5��°�� ������ ����ϰ� 
      //   ����� ������ switch�� ���ؼ� ��������� ���������
      System.out.println("��÷ ��ȣ\t����� ��ȣ");
      for(int i = 0; i < lottoNumbers.length; i++) {
         System.out.println(lottoNumbers[i]+"\t"+userNumbers[i]);
      }
      
      switch(score) {
      case 6:
         System.out.println("��"+ score+ "�� ���߼̽��ϴ�. 1���Դϴ�.");
         break;
      case 5:
         System.out.println("��"+ score+ "�� ���߼̽��ϴ�. 2���Դϴ�.");
         break;
      case 4:
         System.out.println("��"+ score+ "�� ���߼̽��ϴ�. 3���Դϴ�.");
         break;
      case 3:
         default:
            System.out.println("Ż���Դϴ� �Ф�");
            break;
      }
   }
}


















