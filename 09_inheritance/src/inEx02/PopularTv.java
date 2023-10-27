package inEx02;

public class PopularTv extends Tv{
	String title;
	String video(String title) {
		this.title = title;
		return this.title + "비디오를 볼 수 있습니다";
	}

}
