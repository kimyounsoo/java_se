package day0914;
// �迭�� �����Ҵ�
// �츮�� ���ݱ��� �迭�� ����Ҷ�
// �׻� �츮�� �� �迭�� ũ�⸦ �����ϰ�
// �ش� ũ��� �ʱ�ȭ�ؼ� �迭�� ����ߴ�.
// �̷��� �̸� ũ�⸦ �����ؼ� �迭�� ����°� �����Ҵ�(Static Allocation)�̶�� �Ѵ�.

// �׿� ���� �迭�� ũ�⸦ �߰��ϸ� �þ�� �����ϸ� �پ��� ����� ����
// �����Ҵ� (dynamic allocation)�̶�� �Ѵ�.

// �ڹٿ��� �츮�� �޼ҵ忡 �Ķ���͸� �Ѱ��ָ�
// �޼ҵ忡�� �ش� �Ķ���ͷ� �Ѿ�� �͵��� �����Ѵٰ� �ϴ���
// ���� �Ķ���Ͱ� ȣ��� ���� �ִ� ������ ���� ������ �ʴ´�.
// ���� ���� Ÿ���� �迭�� ������־�� �Ѵ�.
// �׷��� �޼ҵ忡�� ������ �ϰ� �� �Ķ���͸� �����ؼ�
// ������ ������ ������־�� �Ѵ�!


public class Ex05DynamicAlloc {
   // �����Ҵ��� ���� �������� �޼ҵ带 ������

   // 1. �迭�� ���� ũ�⸦ Ȯ���ϴ� size() �޼ҵ�
   static int size(int[] arr) {
      return arr.length;
   }
   
   // 2. �迭�� ���ο� ��Ҹ� �߰��ϴ� �޼ҵ�
   static int[] add(int[] arr, int element) {
      //�츮�� �Ķ���ͷ� ���� element�� 
      //arr�� �߰��Ұ��ε�
      //������ arr�� ���� �ǵڿ� �ٿ��� ���̴�.
      //������ �츮�� arr�� ũ�⸦ ���������� ������ �ؾ��ϱ� ������
      //1. arr�� �ӽ� �迭�� �����ϰ�
      //2. ����ũ��+1�� ũ��� �ʱ�ȭ�ϰ�
      //3. �ӽ� �迭�� �����س��� ������ �����ϰ�
      //4. �� ������ ��ġ�� element�� �߰��ؼ�
      //5. arr�� return ���־�� �Ѵ�.
      
      //�ӽ� �迭�� �����غ���
      //�ӽ� �迭�� ũ��� �Ķ���ͷ� �Ѿ�� arr�� ũ��� ����.
      int size = arr.length;
      
      int[] temp = new int[size];
      
      //�ӽ� �迭�� ���� arr�� ������ ���ʴ�� ����������
      for(int i = 0; i < size; i++) { //�����
         temp[i] = arr[i];
      }
      
      // ���� �迭�� ���� ũ�� + 1�� �ʱ�ȭ���ش�.
      // new �� ������ ����
      // ������ �迭�� �� �ִ� ��� ������
      // �� �������
      // ���� arr�� �⺻�� ������Ÿ���� int�� �迭�̱� ������
      // ��� �ε����� 0���� �ʱ�ȭ�ȴ�.
      
      // ���� �迭�� ���� ������ ������ ��ä ũ�⸦ �ø��� ���ؼ���
      // ���� �迭�� ������ �ӽ� �迭�� �����ϰ�
      // ũ�⸦ �ø���
      // �ӽ� �迭�� ������ �ٽ� �����ؿ;� �Ѵ�.
      arr = new int[size+1]; // = 1
      
      // ���� �迭�� �ӽ� �迭�� ���� ���ʴ�� ����������
      for(int i = 0; i < size; i++) { // �����
         arr[i] = temp[i];
      }
      
      // int[] arr = new int[4] 
      // �ش� �迭�� ���� ������ index ��ȣ�� ����ΰ�? ������ index ��ȣ�� ũ�� -1
      // 3
      // ���� ũ���?
      // 4
      
      // arr�� ũ�⸦ 1 �ø���
      // ���ο� ũ���?
      // 5
      // �þ �迭�� ���� ������ �ε��� ��ȣ��?
      // 4
      
      // arr�� ���� ������ index�� element�� �ʱ�ȭ������
      // arr�� ó�� �Ķ���ͷ� �Ѿ�ö� 
      // ���� ������ �ε����� ���� ũ�� - 1�̴�.
      // �� size - 1�̴�.
      // ������ ������ ũ�Ⱑ 1 �þ���Ƿ�
      // ���� ������ �ε����� size�� �ȴ�.
      
      arr[size] = element;
      
      
      return arr;
   }
   
   //�Ķ���ͷ� �Ѿ�� �迭�� �Ķ���ͷ� �Ѿ�� ���� �����ϴ��� üũ�ϴ�  contains �޼ҵ�
   static boolean contains(int[] arr, int element) {
	   //for���� �̿��ؼ�
	   //arr�� ���ε����� element�� ���ؼ� ������ return true�� �Ѵ�.
	   for(int i = 0; i < arr.length; i++) { // i:0
		   if(arr[i] == element) {			//	i < arr.length true
			   //i��° �ε����� element�ǰ��� �����Ƿ�
			   //return true ���ش�.
			   return true;
		   }
	   }
	   
	   return false;
   }
   
   //�Ķ���ͷ� �Ѿ�� �迭�� �Ķ���ͷ� �Ѿ�� ���� ��� �ε����� �ִ��� Ȯ�����ִ� indexOf�޼ҵ�
   static int indexOf(int[]arr, int element) {
	   //���⼭ �����е��� �Ѱ��� �����غ� ����
	   //���� element�� arr�� ���� ���� �ʴ´ٸ�
	   //�츮�� ����� �������־���ұ�?
	   //�ε����� ������ 0���� arr��ũ�� - 1 �̱� ������
	   //���� ������ �츮�� �������� �ʴ´ٴ� ǥ�����ֱ� �����.
	   //���� ���� �����߿��� ���� ������ "-1" �� �����ؼ�
	   //���� �迭�� �ش��ϴ� ������Ʈ�� �������� ������
	   //�ε����� -1�� �������ָ� �ȴ�.
	   
	   //for���� ������
	   //���� i��° �ε��� ����element�� ������
	   //i�� �������ָ� �ȴ�. //�迭�� ���� �ε����� ������ 0
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i] == element) {
			   return i;
		   }
	   }
	   
	   
	   return -1;
   }
   
   public static void main(String[] args) { //length �δ� �� �迭�� ��ũ��ۿ� �˼�����
	   int[] arr2 = new int[5];
	   arr2[0] = 10;
	   System.out.println("arr2.length: "+arr2.length);
	   arr2[1] = 20;
	   System.out.println("arr2.length: "+arr2.length);
	   arr2[2] = 30;
	   System.out.println("arr2.length: "+arr2.length);
      
	   
	  int[] arr = new int[0]; //�� �迭�� ũ��� 0
      
      System.out.println("arr�� ����ũ��: "+size(arr));
      
      arr = add(arr, 10);
      System.out.println("arr�� ����ũ��: "+size(arr));
      for(int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
      
      arr = add(arr, 5);
      System.out.println("arr�� ����ũ��: "+size(arr));
      for(int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
      
      arr = add(arr, 4);
      System.out.println("arr�� ����ũ��: "+size(arr));
      for(int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
      
      //�츮�� arr�� add �޼ҵ��� ��������� �����븶��
      //arr�� ���� ������ �Ǹ鼭 �þ�� ���� Ȯ���� �� �ִ�!
      
      //�޼ҵ忡�� return�� ����Ǵ� ���� �޼ҵ�� �ű⼭ �����°ǰ���? ��
      
      //contains �޼ҵ� ������ �����
      System.out.println("============contains()=============");
      //arr�� 5�� ���� �մϱ�?
      System.out.println("contains(arr, 5): "+contains(arr, 5));
      //arr�� 25�� �����մϱ�?
      System.out.println("contains(arr, 25): "+contains(arr, 25));
      
      System.out.println("=============indexOf()============");
      //arr ���� 5�� �ε����� ���Դϱ�?
      System.out.println("indexOf(arr, 5): "+indexOf(arr, 5));
      //arr ���� 25�� �ε����� ���Դϱ�?
      System.out.println("indexOf(arr, 25): "+indexOf(arr, 25));
      
      arr = add(arr, 5);
      arr = add(arr, 4);
      arr = add(arr, 12);
      arr = add(arr, 51);
      
      //remove�� arr ���� ���
      System.out.println("remove �� arr ���� ���");
      for(int i = 0; i < arr.length; i++) {
    	  System.out.printf("arr[%d]: %d\n", i, arr[i]);
      }
      
      //removeByIndex(arr, 0) ����
      System.out.println("removeByIndex(arr, 0) ����");
      arr = removeByIndex(arr, 0);
      for(int i = 0; i < arr.length; i++) {
         System.out.printf("arr[%d]: %d\n", i, arr[i]);
         }
    
      //removeByIndex(arr, 5) ����
      System.out.println("removeByIndex(arr, 5) ����");
      arr = removeByIndex(arr, 5);
      for(int i = 0; i < arr.length; i++) {
         System.out.printf("arr[%d]: %d\n", i, arr[i]);
      	 } 
    
      //removeByIndex(arr, 2) ����
      System.out.println("removeByIndex(arr, 2) ����");
      arr = removeByIndex(arr, 2);
      for(int i = 0; i < arr.length; i++) {
          System.out.printf("arr[%d]: %d\n", i, arr[i]);
     
   }
    //removeByIndex(arr, 9999) ����
      System.out.println("removeByIndex(arr, 9999) ����");
      arr = removeByIndex(arr, 9999);
      for(int i = 0; i < arr.length; i++) {
         System.out.printf("arr[%d]: %d\n", i, arr[i]);
   }
   
   //removeByElement() �������� �迭�� �ٽ� ��Ҹ� � �� �߰�����
      arr = add(arr, 281);
      arr = add(arr, 144);
      arr = add(arr, 82);
      System.out.println("add() ����");
      for(int i = 0; i < arr.length; i++) {
    	  System.out.printf("arr[%d]: %d\n", i, arr[i]);
      }
      
      System.out.println("removeByElement(arr, 5) ����");
      arr = removeByElement(arr, 5);
      for(int i = 0; i < arr.length; i++) {
    	  System.out.printf("arr[%d]: %d\n", i, arr[i]);
      }
      
      System.out.println("removeByElement(arr,82) ����");
      arr = removeByElement(arr, 82);
      for(int i = 0; i < arr.length; i++) {
    	  System.out.printf("arr[%d]: %d\n", i, arr[i]);
      }
      System.out.println("removeByElement(arr,12) ����");
      arr = removeByElement(arr, 12);
      for(int i = 0; i < arr.length; i++) {
    	  System.out.printf("arr[%d]: %d\n", i, arr[i]);
      }
      System.out.println("removeByElement(arr,123456) ����");
      arr = removeByElement(arr, 123456);
      for(int i = 0; i < arr.length; i++) {
    	  System.out.printf("arr[%d]: %d\n", i, arr[i]);
      }
      
      
   }
   
   
   // �迭���� �ش� �ε����� ��Ҹ� �����ϴ� �޼ҵ� removeByIndex
   // �� �츮�� �迭�� ��Ҹ� �߰��ϴϱ� ũ�Ⱑ �þ��.
   // �׷��ٸ� �츮�� �迭�� ��Ҹ� �����ϸ�? ũ�Ⱑ �پ���Ѵ�
   
   static int[] removeByIndex(int[] arr, int index) {
	   //���� �����ϱ� ���� �ش� �ε�����
	   //������ index���� ���� üũ�Ѵ�.
	   //���� �Ұ����� �ε������ arr�� �״�� �������ָ� �ȴ�.
	   
	   //�ε����� ������ ������ ����� ���ΰ�? 0���� arr.length - 1 (0���� ũ�� -1)
	   if(index < 0 || index >= arr.length) {
		   return arr;
	   }
	   
	   //�迭�� ���� �ӽ� ������ temp�� ���������
	   //temp�� ũ��� ���ΰ�? arr.length
	   int[] temp = new int [arr.length];
	   
	   //�ӽ� �迭�� ���� ���� for���� �̿��ؼ� ����������
	   for(int i = 0; i < arr.length; i++) {
		   temp[i] = arr[i];
	   }
	   
	   // arr�� ���� �ʱ�ȭ������
	   // �̶�arr�� ũ��� ���ΰ�?
	   arr = new int[arr.length - 1]; //������ �ϳ� ����
	   
	   //���� �ش� �ε����� �����Ѵٸ�
	   //�츮�� 3������쿡 ���δ�.
	   //1. �ε����� 0�϶�
	   //	�ε����� 0�̸� �츮�� ���� ���� arr�� temp�� 1������ ������ �������ָ� �ȴ�!
	   //	�� ���� �տ� �ε����� �����ϰ� �����ϸ� �ȴ�.
	   if(index == 0) {
		   for(int i = 1; i < temp.length; i++) {
			   //������ ���⼭ �Ѱ��� �����ؾ��� ����
			   //temp�� 1��° ����
			   //arr�� 0��° ĭ�� �ְ�
			   //��ĭ�� ���ܿ;� �Ѵٴ� ���̴�.
			   arr[i-1] = temp[i];
	   }
	}else if(index == temp.length - 1) {
		//2. �ε����� ���帶�����϶�
		//�̶��� temp�� 0������ temp.length - 2������
		//arr�� �������ָ� �ȴ�.
		for(int i = 0; i < temp.length - 1; i++) {
			arr[i] = temp[i];
		}
	}else {
		//3. �ε����� �߰��϶�
		for(int i = 0; i < temp.length; i++) {
			if(i < index) {
				//0~index�������� ����
				arr[i] = temp[i];
			}else if(i > index){
				//�ε��� �������� ������ ����
				//temp  = [0, 1, 2, 3, 4, 5, 6, 7]
				//index = 3 (������ index)
				//arr = [0, 0, 0, 0, 0, 0, 0] �� ũ�� 7
	 //index = 3	//	 0	 1 2  4  5  6  7 
	 //index = 5         0   1  2 3  4  6  7
				//index = 5
				//arr  = [0, 1, 2, 3, 4, 6, 7]
				//i: 7
				//arr[i - 1] = temp[i];
				//arr[5] = temp[6]; -> arr[5] = 6;
				//arr[6] = temp[7]; -> arr[6] = 7;
				
				arr[i - 1] = temp[i];
				}	
			}
		}
	   
	   return arr;
	   
	   }
   
   
   
   
   
   		//�Ķ���ͷ� �Ѿ�� element�� �迭���� �����ؼ� �������ִ� removeByElement()
   		static int[] removeByElement(int[] arr, int element) {
   			//��� �� �޼ҵ�� �츮�� ������ �������� �޼ҵ带 ��Ȱ���ϸ� �ſ� ���� ����� �� �� �ִ�.
   			int index = indexOf(arr, element);
   			arr = removeByIndex(arr, index);
   			return arr;
   		}
	}
//static int[] removeByElement(int[] arr, int element) {
//		
//		return removeByIndex(arr, indexOf(arr, element));
 
//arr = new int[arr.length - 1];�� �κ��̿�
//arr = new int[size+1]; �� ���Ǵ� �ǰ���? ��

//temp = [1,2,3,4,5,6,7]
//index = 5
//arr = [0,1,2,3,4,6,7]
//arr[i] = temp[i+1]; // �̷��� �ۼ��ϰ� �Ǹ�  ArrayIndexOutOfBoundsException - �迭 �ε����� ������ ��� ������ �߻��ϰ� �ȴ�.
//�� ������ ���� ���÷�
//temp.length�� ũ�Ⱑ 8�϶�
//i �� �ִ밪�� 7 �̹Ƿ�
//arr[7] = temp[8]�� �ǹǷ�
// temp�� ũ�Ⱑ 8�̸� �ε����� 0~7 ���� �����ϱ� ������ temp[8] �� �迭�� �ε��� ������ ��� ���� ��. �׷��� ���� �߻�.
// arr[7] ���� ������ ����� 1�ٿ� �������Ƿ� ũ�Ⱑ 7 �̱� ������ �� �� ��� ������ �߻��Ǵ� ���� ������ �Ǵ°���.















