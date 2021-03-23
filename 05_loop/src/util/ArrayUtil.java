package util;
// 배열 관련 메소드를 모아둔 클래스

import day0915.Student;
import day0918.Board;
import day0915.Car;

public class ArrayUtil {
   //3시까지
   //여기에 우리가 동적할당에서 사용했던 메소드들(indexOf, contains 등등)을
   //Student[]과 Car[]에 사용될 수 있게 만드세요.
	//add Student 용 메소드 Car용 메소드
   //모든 메소드는 static 메소드여야만 한다.
   
   //1. 해당 배열의 크기를 확인하는 size()메소드
   //   A. Car[] 버젼
   public static int size(Car[] carArray) {
      return carArray.length;
   }
   //   B. Student[] 버젼
   public static int size(Student[] studentArray) {
      return studentArray.length;
   }
   //	C. Board[] 버젼
   public static int size(Board[] postArray) {
	      return postArray.length;
   }
   //2. 배열의 새로운 요소를 추가하는 메소드
   //   A. Car[] 버젼
   public static Car[] add(Car[] carArray, Car c) {
      //현재 배열을 임시 배열에 복사한다.
      int size = carArray.length;
      Car[] temp = new Car[size];
      for(int i = 0; i < size; i++) {
         temp[i] = carArray[i];
      }
      //carArray 크기를 1늘린다.
      carArray = new Car[size+1];
      //temp의 내용을 carArray에 복사
      for(int i = 0; i < size; i++) {
         carArray[i] = temp[i];
      }
      //carArray의 가장 마지막 칸에 c 추가
      carArray[size] = c;
      return carArray;
   }
   //   B. Student[] 버젼
   public static Student[] add(Student[] studentArray, Student s) {
      //현재 배열을 임시 배열에 복사한다.
      int size = studentArray.length;
      Student[] temp = new Student[size];
      for(int i = 0; i < size; i++) {
         temp[i] = studentArray[i];
      }
      //studentArray 의 크기를 1 늘린다.
      studentArray = new Student[size+1];
      //studentArray에 temp의 값을 복사한다.
      for(int i = 0; i < size; i++) {
         studentArray[i] = temp[i];
      }
      //studentArray의 가장 마지막 칸에 s 추가
      studentArray[size] = s;
      
      return studentArray;
   }
   
   //	C. Post[] 버젼
   public static Board[] add(Board[] postArray, Board c) {
	      //현재 배열을 임시 배열에 복사한다.
	      int size = postArray.length;
	      Board[] temp = new Board[size];
	      for(int i = 0; i < size; i++) {
	         temp[i] = postArray[i];
	      }
	      //carArray 크기를 1늘린다.
	      postArray = new Board[size+1];
	      //temp의 내용을 carArray에 복사
	      for(int i = 0; i < size; i++) {
	         postArray[i] = temp[i];
	      }
	      //carArray의 가장 마지막 칸에 c 추가
	      postArray[size] = c;
	      return postArray;
	   }
   
   //3. 배열에 해당 요소가 존재하는지 체크하는 contains메소드
   //   A. Car[] 배열 버젼
   public static boolean contains(Car[] carArray, Car c) {
      for(int i = 0; i < carArray.length; i++) {
         if(carArray[i].equals(c)) {//== 가 아니라 equals 인 이유는 == 는 주소값비교 이기 때문에 
            return true;			//예전에 == 했던 이유는 기본형의 비교 이기때문에
            						//여기서는 carArray 의 i번째 즉 카의 객체 하나하나 와 Car c 의객체와 비교 하기때문에
         }							//carArray 는 자료형이 모인 배열 ??
      }
      return false;
   }
   //	B. Student[] 배열 버전
   public static boolean contains(Student[] studentArray, Student s) {
	   for(int i = 0; i < studentArray.length; i++) {
		   if(studentArray[i].equals(s)) {
			   return true;
		   }
	   }
	   return false;
   }
   
   //	B. Board[] 배열 버전
   public static boolean contains(Board[] postArray, Board s) {
	   for(int i = 0; i < postArray.length; i++) {
		   if(postArray[i].equals(s)) {
			   return true;
		   }
	   }
	   return false;
   }

   //4. 배열에 해당 요소가 몇번 인덱스에 존재하는지 체크하는 indexOf 메소드
   // A. Car[] 버젼
   public static int indexOf(Car[] carArray, Car c) {
	      for(int i = 0; i < carArray.length; i++) {
	         if(carArray[i].equals(c)) {
	            return i;
	         }
	      }
	      return -1;
	   }
   //   B. Student[] 버젼
   public static int indexOf(Student[] studentArray, Student s) {
	   for(int i = 0; i < studentArray.length; i++) {
		   if(studentArray[i].equals(s)) {
	           return i;
	         }
	      }
	      
	      return -1;
	   }
   
   // A. Board[] 버젼
   public static int indexOf(Board[] postArray, Board c) {
	      for(int i = 0; i < postArray.length; i++) {
	         if(postArray[i].equals(c)) {
	            return i;
	         }
	      }
	      return -1;
	   }
   
   
   //5. 배열에 해당 인덱스를 삭제하는 removeByIndex 메소드
   //   A. Car[] 버젼
 public static Car[] removeByIndex(Car[] carArray, int index) {
    
    // index의 유효성 검증 ??
    if(index < 0 || index >= carArray.length) {
       return carArray;
    }
    
    // 임시배열에 현재 배열 복사
    Car[] temp = new Car[carArray.length];
    
    for(int i = 0; i < carArray.length; i++) {
       temp[i] = carArray[i];
    }
          
    // 원본 배열의 크기 축소
    carArray = new Car[carArray.length - 1];
    
    //index의 위치에 따른 잘라내기 실행
    if(index == 0) {
       //1. 인덱스가 제일 앞일때
       for(int i = 1; i < temp.length; i++) {
          carArray[i-1] = temp[i];
       }
    }else if(index == temp.length - 1) {
       //2. 인덱스가 제일 마지막일때
       for(int i = 0; i < temp.length - 1; i++) {
          carArray[i] = temp[i];
       }
    }else {
       //3. 인덱스가 중간일때
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
 
 // B.	Student[] 버젼
 public static Student[] removeByIndex(Student[] studentArray, int index) {
	    
	    // index의 유효성 검증
	    if(index < 0 || index >= studentArray.length) {
	       return studentArray;
	    }
	    
	    // 임시배열에 현재 배열 복사
	    Student[] temp = new Student[studentArray.length];
	    
	    for(int i = 0; i < studentArray.length; i++) {
	       temp[i] = studentArray[i];
	    }
	    
	    // 원본 배열의 크기 축소
	    studentArray = new Student[studentArray.length - 1];
	    
	    //index의 위치에 따른 잘라내기 실행
	    if(index == 0) {
	       //1. 인덱스가 제일 앞일때
	       for(int i = 1; i < temp.length; i++) {
	          studentArray[i-1] = temp[i];
	       }
	    }else if(index == temp.length - 1) {
	    	//2. 인덱스가 제일 마지막일때
	        for(int i = 0; i < temp.length - 1; i++) {
	           studentArray[i] = temp[i];
	        }
	     }else {
	    	 //3. 인덱스가 중간일때
	         for(int i = 0; i < temp.length; i++) {//인덱스를 제외한 앞과 뒤를 복사
	            if(i < index) {					// 앞
	               studentArray[i] = temp[i];
	            }else if(i > index){			// 뒤
	               studentArray[i - 1] = temp[i];// 인덱스가 빠진 자리 즉 -1 을해주어야한다
	            }
	         }
	      }
	      return studentArray;
	   }
 	
 
 //   C. Board[] 버젼
public static Board[] removeByIndex(Board[] postArray, int index) {
  
  // index의 유효성 검증 ??
  if(index < 0 || index >= postArray.length) {
     return postArray;
  }
  
  // 임시배열에 현재 배열 복사
  Board[] temp = new Board[postArray.length];
  
  for(int i = 0; i < postArray.length; i++) {
     temp[i] = postArray[i];
  }
        
  // 원본 배열의 크기 축소
  postArray = new Board[postArray.length - 1];
  
  //index의 위치에 따른 잘라내기 실행
  if(index == 0) {
     //1. 인덱스가 제일 앞일때
     for(int i = 1; i < temp.length; i++) {
        postArray[i-1] = temp[i];
     }
  }else if(index == temp.length - 1) {
     //2. 인덱스가 제일 마지막일때
     for(int i = 0; i < temp.length - 1; i++) {
        postArray[i] = temp[i];
     }
  }else {
     //3. 인덱스가 중간일때
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
 	//6. 배열에서 파라미터로 넘어온 객체를 삭제하는 remonveByElement 메소드
 	// 		A. Student[] 버젼
 	public static Student[] removeByElement(Student[] studentArray, Student s) {
 		return removeByIndex(studentArray, indexOf(studentArray, s));
  }
  //   B. Car[] 버젼
 	public static Car[] removeByElement(Car[] carArray, Car c) {
 		return removeByIndex(carArray, indexOf(carArray, c));
  }

 	//	A. Post[] 버젼
 	public static Board[] removeByElement(Board[] postArray, Board s) {
 		return removeByIndex(postArray, indexOf(postArray, s));
	
	}	
}
	    



//int[] arr = new int[5]
//arr에 int 공간 5개가 있다
//= arr은 int 공간 5개를 뭉쳐놨다
//= arr[0], arr[1], arr[2], arr[3], arr[4] 는 각각의 int 공간이다
//즉 arr[0]이라는 변수가 있는것과 똑같다
//
//carArray = new Car[5] 는 무슨 뜻인가
//carArray는 Car라는 객체 5개를 위한 공간이 있다.
//
//int[0] 이 int 변수
//carArray[0] 은 car 변수
//
//그럼 carArray[0] 은 무엇인가?
//carArray -> "3반"
//carArray[0] -> "3반 1번학생 나와"
//
//인스턴스와 객체의 차이
//Car c -> 객체
//c = new Car(); 이후 c는 인스턴스가 된다.
//객체와 인스턴스는 거의 같은말이지만
//객체라는 개념안에 인스턴스가 포함
//필드가 포함된게 객체
//carArray[i].equals(c)) 이렇게해서 현재잇는객체랑 들어오는객체의 필드를 비교해주는건가여? 네
//
//(Car[] carArray, Car c) Car 객체 c
//(Car[] carArray, Car student) Car 객체 student 객체 일뿐 어떤 이름으로 해도 상관없다 하지만 안좋은습관 이렇게 해도상관없다

//Student 배열은 studentArray 이고 
//studentArray[i] 는 Student 클래스의 객체이고,
//studentArray[i] 는 객체의 주소값을 가지고 있다














