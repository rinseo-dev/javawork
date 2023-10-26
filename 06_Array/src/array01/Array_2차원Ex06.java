package array01;

public class Array_2차원Ex06 {

	public static void main(String[] args) {
		//2차원 배열에 각 학생(5명)별 점수 입력
		//국어, 영어, 수학
		int score[][] = {{95, 100, 78},
						 {68, 57, 100},
						 {62, 97, 85},
						 {85, 83, 69},
						 {86, 74, 38}};
		
		/*
		  번호  국어  영어  수학  총점   평균
		 -----------------------------
		   1   95  100   78  273  83.3
		 ...
		 -----------------------------
		 총점   479  500   387
		 평균   95.0 100.0 783.3
		 */

		/*	int sum = 0;
			int avg = 0;
			int count=0;
			//System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			//System.out.printf("%5s%5s%5s%5s%5s%5s\n","번호","국어","영어","수학","총점","평균");
			System.out.println("번호  국어  영어  수학  총점  평균");
			for(int i=0; i<score.length; i++) {
				sum = 0;
				System.out.print(i+1);
				for(int j=0; j<score[i].length; j++) {
					count=i+1;
					sum += score[i][j];
					avg = sum/score[i].length;
					System.out.print(" "+score[i][j]+" ");
				}
				System.out.print(" "+sum+" "+avg);
				
				System.out.println();
			}*/
		
		//** 출력을 여러 줄에 걸쳐서 ln없이 하면 붙는다는걸 생각을 못함. 멍청
		
		//선생님 답
		
		/*
		 score[0][0]+
		 score[1][0]+
		 score[2][0]+
		 score[3][0]+
		 score[4][0] = 국어 총점
		 */
		/*for(int i=0; i<3; i++) { //score[i].length해도 되지만 어차피 3개라 직관적
				int sum = 0;
				for(int j=0; j<score.length; j++) {
					sum += score[j][i];
					//System.out.print(score[j][i]);//계속 변하는 값이 j라서 j가 앞이라고..?
				}
			} 이런 형태로 작성하게 될 것 */
		
		
		System.out.println(" 번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		
		for(int i=0; i<score.length; i++) {
			int sum=0;
			//korSum = score[0][0]+score[1][0]+score[2][0] ..이렇게 더하면 국어점수의 합계
			//안쪽 for문이 3번 돌고 나면 바깥쪽 for문의 i값이 변함. i, i+1, (i+1)+1 숫자가 하나씩 늘어남
			korSum += score[i][0];//이게 국어 점수의 합. 국어점수는 i값은 바뀌지만 열은 0으로 그대로이므로.
			engSum += score[i][1];//영어는 열의 index번호가 1번
			mathSum += score[i][2];//수학 열 index 2
			//이렇게 하면 국어, 영어, 수학점수 각각 합계가 구해짐
			
			System.out.print(i+1+"\t"); //번호 출력
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
				//sum을 여기서 출력하면 3번 출력되므로 안됨.
			}
			
			double avg = (double)sum / score[i].length;
			//sum이나 socre[i].length중 하나를 double형으로 형변환 해줘야 소수점이 나옴.아니면 몫만 나옴.
			//소수점 첫째자리까지 출력할거라 avg를 double형으로 선언함.
			
			/*System.out.print(sum+"\t");
			System.out.printf("%.1f\n",avg);//float형으로 첫째자리까지 출력
			이렇게 두줄을 아래 한줄로 해결할 수 있음*/
			System.out.printf("%d\t%.1f\n",sum,avg);
		}
		System.out.println("============================================");
		System.out.print("총점\t"+korSum+"\t"+engSum+"\t"+mathSum+"\n");
		System.out.printf("%s\t%.1f\t%.1f\t%.1f","평균",korSum/(double)5,engSum/(double)5,mathSum/(double)5);
	}

}
