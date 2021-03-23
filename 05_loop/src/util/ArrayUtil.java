package util;
// �迭 ���� �޼ҵ带 ��Ƶ� Ŭ����

import day0915.Student;
import day0918.Board;
import day0915.Car;

public class ArrayUtil {
   //3�ñ���
   //���⿡ �츮�� �����Ҵ翡�� ����ߴ� �޼ҵ��(indexOf, contains ���)��
   //Student[]�� Car[]�� ���� �� �ְ� ���弼��.
	//add Student �� �޼ҵ� Car�� �޼ҵ�
   //��� �޼ҵ�� static �޼ҵ忩�߸� �Ѵ�.
   
   //1. �ش� �迭�� ũ�⸦ Ȯ���ϴ� size()�޼ҵ�
   //   A. Car[] ����
   public static int size(Car[] carArray) {
      return carArray.length;
   }
   //   B. Student[] ����
   public static int size(Student[] studentArray) {
      return studentArray.length;
   }
   //	C. Board[] ����
   public static int size(Board[] postArray) {
	      return postArray.length;
   }
   //2. �迭�� ���ο� ��Ҹ� �߰��ϴ� �޼ҵ�
   //   A. Car[] ����
   public static Car[] add(Car[] carArray, Car c) {
      //���� �迭�� �ӽ� �迭�� �����Ѵ�.
      int size = carArray.length;
      Car[] temp = new Car[size];
      for(int i = 0; i < size; i++) {
         temp[i] = carArray[i];
      }
      //carArray ũ�⸦ 1�ø���.
      carArray = new Car[size+1];
      //temp�� ������ carArray�� ����
      for(int i = 0; i < size; i++) {
         carArray[i] = temp[i];
      }
      //carArray�� ���� ������ ĭ�� c �߰�
      carArray[size] = c;
      return carArray;
   }
   //   B. Student[] ����
   public static Student[] add(Student[] studentArray, Student s) {
      //���� �迭�� �ӽ� �迭�� �����Ѵ�.
      int size = studentArray.length;
      Student[] temp = new Student[size];
      for(int i = 0; i < size; i++) {
         temp[i] = studentArray[i];
      }
      //studentArray �� ũ�⸦ 1 �ø���.
      studentArray = new Student[size+1];
      //studentArray�� temp�� ���� �����Ѵ�.
      for(int i = 0; i < size; i++) {
         studentArray[i] = temp[i];
      }
      //studentArray�� ���� ������ ĭ�� s �߰�
      studentArray[size] = s;
      
      return studentArray;
   }
   
   //	C. Post[] ����
   public static Board[] add(Board[] postArray, Board c) {
	      //���� �迭�� �ӽ� �迭�� �����Ѵ�.
	      int size = postArray.length;
	      Board[] temp = new Board[size];
	      for(int i = 0; i < size; i++) {
	         temp[i] = postArray[i];
	      }
	      //carArray ũ�⸦ 1�ø���.
	      postArray = new Board[size+1];
	      //temp�� ������ carArray�� ����
	      for(int i = 0; i < size; i++) {
	         postArray[i] = temp[i];
	      }
	      //carArray�� ���� ������ ĭ�� c �߰�
	      postArray[size] = c;
	      return postArray;
	   }
   
   //3. �迭�� �ش� ��Ұ� �����ϴ��� üũ�ϴ� contains�޼ҵ�
   //   A. Car[] �迭 ����
   public static boolean contains(Car[] carArray, Car c) {
      for(int i = 0; i < carArray.length; i++) {
         if(carArray[i].equals(c)) {//== �� �ƴ϶� equals �� ������ == �� �ּҰ��� �̱� ������ 
            return true;			//������ == �ߴ� ������ �⺻���� �� �̱⶧����
            						//���⼭�� carArray �� i��° �� ī�� ��ü �ϳ��ϳ� �� Car c �ǰ�ü�� �� �ϱ⶧����
         }							//carArray �� �ڷ����� ���� �迭 ??
      }
      return false;
   }
   //	B. Student[] �迭 ����
   public static boolean contains(Student[] studentArray, Student s) {
	   for(int i = 0; i < studentArray.length; i++) {
		   if(studentArray[i].equals(s)) {
			   return true;
		   }
	   }
	   return false;
   }
   
   //	B. Board[] �迭 ����
   public static boolean contains(Board[] postArray, Board s) {
	   for(int i = 0; i < postArray.length; i++) {
		   if(postArray[i].equals(s)) {
			   return true;
		   }
	   }
	   return false;
   }

   //4. �迭�� �ش� ��Ұ� ��� �ε����� �����ϴ��� üũ�ϴ� indexOf �޼ҵ�
   // A. Car[] ����
   public static int indexOf(Car[] carArray, Car c) {
	      for(int i = 0; i < carArray.length; i++) {
	         if(carArray[i].equals(c)) {
	            return i;
	         }
	      }
	      return -1;
	   }
   //   B. Student[] ����
   public static int indexOf(Student[] studentArray, Student s) {
	   for(int i = 0; i < studentArray.length; i++) {
		   if(studentArray[i].equals(s)) {
	           return i;
	         }
	      }
	      
	      return -1;
	   }
   
   // A. Board[] ����
   public static int indexOf(Board[] postArray, Board c) {
	      for(int i = 0; i < postArray.length; i++) {
	         if(postArray[i].equals(c)) {
	            return i;
	         }
	      }
	      return -1;
	   }
   
   
   //5. �迭�� �ش� �ε����� �����ϴ� removeByIndex �޼ҵ�
   //   A. Car[] ����
 public static Car[] removeByIndex(Car[] carArray, int index) {
    
    // index�� ��ȿ�� ���� ??
    if(index < 0 || index >= carArray.length) {
       return carArray;
    }
    
    // �ӽù迭�� ���� �迭 ����
    Car[] temp = new Car[carArray.length];
    
    for(int i = 0; i < carArray.length; i++) {
       temp[i] = carArray[i];
    }
          
    // ���� �迭�� ũ�� ���
    carArray = new Car[carArray.length - 1];
    
    //index�� ��ġ�� ���� �߶󳻱� ����
    if(index == 0) {
       //1. �ε����� ���� ���϶�
       for(int i = 1; i < temp.length; i++) {
          carArray[i-1] = temp[i];
       }
    }else if(index == temp.length - 1) {
       //2. �ε����� ���� �������϶�
       for(int i = 0; i < temp.length - 1; i++) {
          carArray[i] = temp[i];
       }
    }else {
       //3. �ε����� �߰��϶�
       for(int i = 0; i < temp.length; i++) {
          if(i < index) {
             carArray[i] = temp[i];
          }else if(i > index){
             carArray[i - 1] = temp[i];
          }
       }
    }
    return carArray;
 }
 
 // B.	Student[] ����
 public static Student[] removeByIndex(Student[] studentArray, int index) {
	    
	    // index�� ��ȿ�� ����
	    if(index < 0 || index >= studentArray.length) {
	       return studentArray;
	    }
	    
	    // �ӽù迭�� ���� �迭 ����
	    Student[] temp = new Student[studentArray.length];
	    
	    for(int i = 0; i < studentArray.length; i++) {
	       temp[i] = studentArray[i];
	    }
	    
	    // ���� �迭�� ũ�� ���
	    studentArray = new Student[studentArray.length - 1];
	    
	    //index�� ��ġ�� ���� �߶󳻱� ����
	    if(index == 0) {
	       //1. �ε����� ���� ���϶�
	       for(int i = 1; i < temp.length; i++) {
	          studentArray[i-1] = temp[i];
	       }
	    }else if(index == temp.length - 1) {
	    	//2. �ε����� ���� �������϶�
	        for(int i = 0; i < temp.length - 1; i++) {
	           studentArray[i] = temp[i];
	        }
	     }else {
	    	 //3. �ε����� �߰��϶�
	         for(int i = 0; i < temp.length; i++) {//�ε����� ������ �հ� �ڸ� ����
	            if(i < index) {					// ��
	               studentArray[i] = temp[i];
	            }else if(i > index){			// ��
	               studentArray[i - 1] = temp[i];// �ε����� ���� �ڸ� �� -1 �����־���Ѵ�
	            }
	         }
	      }
	      return studentArray;
	   }
 	
 
 //   C. Board[] ����
public static Board[] removeByIndex(Board[] postArray, int index) {
  
  // index�� ��ȿ�� ���� ??
  if(index < 0 || index >= postArray.length) {
     return postArray;
  }
  
  // �ӽù迭�� ���� �迭 ����
  Board[] temp = new Board[postArray.length];
  
  for(int i = 0; i < postArray.length; i++) {
     temp[i] = postArray[i];
  }
        
  // ���� �迭�� ũ�� ���
  postArray = new Board[postArray.length - 1];
  
  //index�� ��ġ�� ���� �߶󳻱� ����
  if(index == 0) {
     //1. �ε����� ���� ���϶�
     for(int i = 1; i < temp.length; i++) {
        postArray[i-1] = temp[i];
     }
  }else if(index == temp.length - 1) {
     //2. �ε����� ���� �������϶�
     for(int i = 0; i < temp.length - 1; i++) {
        postArray[i] = temp[i];
     }
  }else {
     //3. �ε����� �߰��϶�
     for(int i = 0; i < temp.length; i++) {
        if(i < index) {
           postArray[i] = temp[i];
        }else if(i > index){
           postArray[i - 1] = temp[i];
        }
     }
  }
  return postArray;
}
 	//6. �迭���� �Ķ���ͷ� �Ѿ�� ��ü�� �����ϴ� remonveByElement �޼ҵ�
 	// 		A. Student[] ����
 	public static Student[] removeByElement(Student[] studentArray, Student s) {
 		return removeByIndex(studentArray, indexOf(studentArray, s));
  }
  //   B. Car[] ����
 	public static Car[] removeByElement(Car[] carArray, Car c) {
 		return removeByIndex(carArray, indexOf(carArray, c));
  }

 	//	A. Post[] ����
 	public static Board[] removeByElement(Board[] postArray, Board s) {
 		return removeByIndex(postArray, indexOf(postArray, s));
	
	}	
}
	    



//int[] arr = new int[5]
//arr�� int ���� 5���� �ִ�
//= arr�� int ���� 5���� ���ĳ���
//= arr[0], arr[1], arr[2], arr[3], arr[4] �� ������ int �����̴�
//�� arr[0]�̶�� ������ �ִ°Ͱ� �Ȱ���
//
//carArray = new Car[5] �� ���� ���ΰ�
//carArray�� Car��� ��ü 5���� ���� ������ �ִ�.
//
//int[0] �� int ����
//carArray[0] �� car ����
//
//�׷� carArray[0] �� �����ΰ�?
//carArray -> "3��"
//carArray[0] -> "3�� 1���л� ����"
//
//�ν��Ͻ��� ��ü�� ����
//Car c -> ��ü
//c = new Car(); ���� c�� �ν��Ͻ��� �ȴ�.
//��ü�� �ν��Ͻ��� ���� ������������
//��ü��� ����ȿ� �ν��Ͻ��� ����
//�ʵ尡 ���ԵȰ� ��ü
//carArray[i].equals(c)) �̷����ؼ� �����մ°�ü�� �����°�ü�� �ʵ带 �����ִ°ǰ���? ��
//
//(Car[] carArray, Car c) Car ��ü c
//(Car[] carArray, Car student) Car ��ü student ��ü �ϻ� � �̸����� �ص� ������� ������ ���������� �̷��� �ص��������

//Student �迭�� studentArray �̰� 
//studentArray[i] �� Student Ŭ������ ��ü�̰�,
//studentArray[i] �� ��ü�� �ּҰ��� ������ �ִ�














