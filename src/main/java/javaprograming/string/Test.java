package javaprograming.string;

public class Test {
	
	public boolean solution(int[] A) {
		int temp = -1;
		int tempIndex=-1;
		
		boolean sortable = true;
		boolean tempB=false;
		
		for (int i = 1 ; i< A.length;i++) {			
			if(A[i]<A[i-1]) {
				temp = A[i-1];
				tempIndex = i-1;
				tempB=true;
				break;
			}
		}
		
		if(!tempB) {
			return false;
		}
		
		System.out.println(temp);
		System.out.println(tempIndex);
		
		int smallestAfterTemp = temp;
		int smallestAfterTempIndex = -1;
		
		if(tempIndex<A.length-2) {
			for(int i = tempIndex+1;i< A.length;i++) {
				if(smallestAfterTemp>=A[i]) {
					smallestAfterTemp = A[i];
					smallestAfterTempIndex=i;
				}
			}
		}
		
		System.out.println(smallestAfterTempIndex);
		System.out.println(smallestAfterTemp);
		
		if(smallestAfterTempIndex!=-1) {
			int swapTemp = A[tempIndex];
			A[tempIndex] = A[smallestAfterTempIndex];
			A[smallestAfterTempIndex] = swapTemp;
		}
		
		if(tempIndex!=-1) {
			for (int i = 1 ; i< A.length;i++) {			
				if(A[i]<A[i-1]) {
					sortable = false;
				}
			}
		}else {
			sortable = false;
		}
		
		System.out.println(sortable);
		//System.out.println(A);
		
		return sortable;
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		int[] A = {1,5,3,3,7};
		System.out.println(t.solution(A));
	}

}
