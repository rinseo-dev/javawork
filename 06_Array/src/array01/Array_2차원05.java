package array01;

public class Array_2차원05 {

	public static void main(String[] args) {
		
		//2차원 배열 [행][열] 순서
		int[][] score = {{1,2,3},
						 {4,5,6}};//2행 3열
		
		//int score2[][] = new int[3][5]; 이런 느낌
		int[][] score2 = {{ 1, 2, 3, 4, 5}, //[0] index번호
						  { 4, 5, 6, 7, 8}, //[1]
						  { 9,10,11,12,13}};//[2]
						 //[0][1][2][3][4] index
						 //3행 5열
		
		
		System.out.println(score2[1][2]); // 6 출력
		System.out.println(score2[2][3]); // 12
		
		System.out.println("score2의 길이(행길이) : " + score2.length);
		//score2는 행[0],[1],[2]를 가리킴.각 행은 열의 정보를 담고 있음.
		//score2의 길이는 '행'의 길이. score.length -> 3이 됨. 3개의 행이 있으므로.
		//행[0]에는 {1,2,3,4,5}를 담고 있고, 행[1]은 { 4, 5, 6, 7, 8}, 행[2]는 { 9,10,11,12,13}를 담음.
		System.out.println("score[0]의 길이(열길이) : " + score2[0].length);
		
		//2차원 배열을 출력 할 경우 행은 바깥쪽 for문, 열은 안쪽 for문에서 돌려줘야 함.
		for(int i=0; i<score2.length; i++) {
			for(int j=0; j<score2[i].length; j++) {
				//for문 첫번째는0번의 length, 두번째는 1번의 length, 세번째는 2번의 length를 돌아야 함
				//그래서 안쪽 for문이 돌 때 score[i]로 돌려줌.
				System.out.print(score2[i][j] + " ");//2차원 배열이므로 앞은 행, 뒤는 열 번호를 넣어줌.

			}
			System.out.println();//한 행이 끝날때마다 \n를 하기 위해서 넣음.
		}
		
		//score[0][2] = 67;//라고 하면 3의 자리에 67을 넣게 됨.
		
		System.out.println("------------------------");
		
		//중첩 for문 사용
		int iArr[][] = new int[4][3];
		int count = 1;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {//iArr[]배열의 길이로 잡음.
				//count += 1;을 따로 선언해줘도 되지만 count++로 코드 줄임
				iArr[i][j] = count++; //for문이 1번 돌 때마다 count값이 1씩 증가하게 
				//count=1로 설정했으므로 count++을 사용하면 순차적으로 숫자가 늚
				//count=0으로 설정했으면 ++count로 해서 숫자가 증가한 상태로 iArr[k][l]에 들어가게 함.
				System.out.print(iArr[i][j] + " ");
				
				//2의 배수를 출력하려면 초기값을 int count=2, iArr[i][j] = count; count +=2;로늘여주고
				//홀수는 count=1, count+=2
				//3의 배수는 count=3, count+=3의 방식을 사용함.
			}
			System.out.println();
		}
	
		System.out.println("------------------------");
		/*
		 iArr2.length=3
		 iArr2[0].length=3
		 iArr2[1].length=2
		 노션에 설명 캡쳐 있음.
		 */
		
		int iArr2[][] = {{1,2,3}, //index별 길이가 다르므로 for문을 돌릴 때 행을 선택하는 것 보다 i값을 주는게 나음
						 {4,5},
						 {6,7,8,9}};
		
		for(int i=0; i<iArr2.length; i++) {
			for(int j=0; j<iArr2[i].length; j++){//행의 길이가 모두 다르므로 iArr2[0].length는 선언 될 수 없음.
				System.out.print(iArr2[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}
