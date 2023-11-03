package object01;

class Point implements Cloneable{ //Cloneable를 implements해야 Clone을 사용할 수 있음
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	//clone의 반환형은 Object
	public Object clone() {
		
		Object obj = null;
		
		//obj = clone(); //본인걸 복제할때는 예외처리 없음
		
		try {
			obj = super.clone(); //부모걸 복제할 때는 예외처리 필요.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}

public class Clone04 {

	public static void main(String[] args) {
		Point originP = new Point(3,5);//부모->자식을 
		Point copy = (Point)originP.clone();//다시 자식->부모로 형변환인가봄
		
		System.out.println(originP); // toString()메서드가 호출됨.
		System.out.println(copy);//카페된 값의 toString()메서드 호출
		
		//clone하면 객체를 하나 더 만든것. hashcode를 호출해보면 다른 값이 나옴.
		//hashcode를 오버라이딩 해주면 같은 값이 나옴
		System.out.println(originP.hashCode());
		System.out.println(copy.hashCode());
		
		int[] arr = {1,2,3,4,5};
		//int[] coppyArr = arr; //arr과 copyArr은 같은 곳을 가리킴. arr값을 수정하면 copyArr도 수정됨. - 얕은 복사
		
		int[] arrClone = arr.clone();
		System.arraycopy(arr, 0, arrClone, 0, arr.length);
		
		System.out.println(arrClone[0]);//값 1 출력.
		
		System.out.println("---------------------");
		
		arrClone[0] = 9; //clone된 인덱스 0번의 값을 바꿈
		System.out.println(arr[0]);
		System.out.println(arrClone[0]);
		
		
	}

}
