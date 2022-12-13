package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	
	//얕은 복사 (shallow :얕은)
	// -> 주소를 복사하여 서로 다른 두 변수가(주소값만 참조!!)
	// 	   하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	
	public void ShallowCopy() {
		int arr[] = {1, 2, 3, 4, 5};
		
		//얕은 복사 진행
		
		int[] copyarr = arr; //주소만 복사
		
		System.out.println("주소확인");
		System.out.println("arr :" + arr);
		System.out.println("copyarr :" + arr);
		
		//배열 값 변경
		System.out.println("변경 전");
		System.out.println("arr :" + Arrays.toString(arr));
		System.out.println("copyarr :" + Arrays.toString(copyarr));
		
		//얕은 복사한 배열의 값을 변경해봄
		
		copyarr[2] = 999;
		
		//배열 값 변경 확인
		
		System.out.println("변경 후");
		System.out.println("arr :" + Arrays.toString(arr));
		System.out.println("copyarr :" + Arrays.toString(copyarr));
	}
	public void DeepCopy() {
		
		//깊은 복사 (deep)
		// -> 같은 자료형의 새로운 배열을 만들어서
		// 기존 배열의 데이터를 모두 복사하는 방법
		
			int[] arr = {1, 2, 3, 4, 5}; //원본
			
			// 1. for문을 이용한 깊은 복사
			int[] coppyArr1 = new int[arr.length]; // 5칸짜리 배열 생성
			
			for(int i = 0; i < arr.length; i++) {
				coppyArr1[i] = arr[i];
			}
			
			// 2. System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사배열, 복사배열의 삽입 시작 인덱스,
								// 복사길이)
			int[] coppyArr2 = new int[arr.length];
			System.arraycopy(arr, 0 , coppyArr2, 0, arr.length);
			
			// 3. Arrays.copyOf(원본 배열, 복사한 길이);
			
			int[] coppyArr3 = Arrays.copyOf(arr, arr.length);
			
			// 값 변경 후 확인
			
			coppyArr1[4] = 0;
			coppyArr2[4] = 152;
			coppyArr3[4] = 10;
			
			System.out.println("arr :" + Arrays.toString(arr));
			System.out.println("copyarr1 :" + Arrays.toString(coppyArr1));
			System.out.println("copyarr2 :" + Arrays.toString(coppyArr2));
			System.out.println("copyarr3 :" + Arrays.toString(coppyArr3));
	}
}
