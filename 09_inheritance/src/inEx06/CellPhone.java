package inEx06;

public class CellPhone {
	
	private boolean call;//전화 걸고 끊기
	private int volume;
	
	public void call() {
		call = !call;
		
		if(call) {
			System.out.println("전화를 걸었습니다.");
		}else {
			System.out.println("전화를 끊었습니다.");
		}
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	

}
