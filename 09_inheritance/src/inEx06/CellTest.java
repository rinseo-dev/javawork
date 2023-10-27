package inEx06;

public class CellTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		sp.call();
		
		sp.setVolume(9);
		System.out.println("현재 볼륨 : " + sp.getVolume());
		System.out.println(sp.ott("왓챠"));
		
		sp.call();
	}

}
