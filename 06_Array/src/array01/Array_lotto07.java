package array01;

public class Array_lotto07 {

	public static void main(String[] args) {

		//45개
		int lotto[] = new int[45];
		
		//중복 번호 제거 필요
		//랜덤으로 나온 번호를 index 0과 1에 넣어서 비교 [0]==[1]인 경우 i값을 하나 감소시켜서 for문을 한 번 더 돌게
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i +1; //이렇게 하면 1~45까지가 생김
		}
		
		int index = 0;
		for(int i=0; i<6; i++) {
			index = (int)(Math.random()*45);//0~44
			//Math.random()으로 뽑는건 index번호
			//lotto[0] lotto[index] index값으로 뽑아서 [0]자리에 넣어줘야함.
			// 1,2,3,5,5 <-> 35,36,37,38..
			//36,2,3,4,5 <-> 35, 1,37,38.. 이런방식으로 lotto 1번자리에 36을 넣고 36자리에 1을 넣는 자리 바꿈
			
			//쌤이 lotto[0]으로 작업했지만 난 그냥 i로 고침
			int tmp = lotto[i]; //임시저장공간에 lotto[0]을 넣고
			lotto[i] = lotto[index];//lotto[0]자리에 새로운 index번호 넣고
			lotto[index] = tmp;//index자리에 저장해놨던 tmp값을 넣어서 자리 바꿈.
			//이렇게 6번 하고 나서 출력하면 되는 상황
			System.out.print(lotto[i]+", ");
			
			//아니 쌤은 왜 lotto[0]으로 뽑는거지? lotto[i]를 뽑으면 숫자가 잘 나오는데
		}
	}

}
