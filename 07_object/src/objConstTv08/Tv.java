package objConstTv08;

public class Tv {
	String company;
	String model;
	int inch;
	
	Tv(String company, String model, int inch){
		System.out.println("생성자 호출 : ");
		this.company = company;
		this.model = model;
		this.inch = inch;
	}
}
