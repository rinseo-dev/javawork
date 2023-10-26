package objConstTv08;

public class TvTest {

	public static void main(String[] args) {
		Tv tv1 = new Tv("LG","커브드",50);
		
		System.out.println(tv1.company);
		System.out.println(tv1.model);
		System.out.println(tv1.inch);
		
		
		System.out.println();
		
		Tv tv2 = new Tv("삼성","와이드", 60);
		
		System.out.println(tv2.company);
		System.out.println(tv2.model);
		System.out.println(tv2.inch);
	}

}
