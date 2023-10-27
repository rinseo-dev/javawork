package in01;


class AA{
	int i;
	int j;
	
	void setIJ(int x, int y) {
		//this.i = i;//이름이 같을 때 어떤게 지역변수인지 전역변수인지 명확해야 하므로 this해줌
		//변수 이름이 다르면 명확함(?)
		
		i = x;
		j = y;
	}
}

class BB extends AA{
	int total;
	
	void sum() {
		total = i + j;
	}
}
public class InheritanceTest2 {

	public static void main(String[] args) {
		BB b = new BB(); //b변수 생성/ b는 AA,BB의 모든 내용을 사용 가능
		b.setIJ(10, 20);
		
		//int a = b.sum();//sum()은 void라 반환값이 없으므로 저장, 출력 모두 안됨 
		//System.out.println(b.sum());
		
		b.sum();
		System.out.println(b.total);//total을 사용해서 저장, 출력 가능.
	}

}
