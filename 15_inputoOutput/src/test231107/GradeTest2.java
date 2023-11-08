package test231107;

import java.util.*;

public class GradeTest2 {

	public static void main(String[] args) {
		/*
		int select //사용자로부터 입력받은 선택번호
		boolean check // 로그인 되었는지 체크
		ArrayList<Grade> gList //학생 정보 및 점수를 입력받아 저장
		int gListIndex // 로그인 된 후 출력시 필요한 index번호 
		*/
		
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int gListIndex = -1;
		
		ArrayList<Grade> gList = new ArrayList<>();
		
	
        int loginTry = 0;
        
		while(true) {
			System.out.println("===========================");
			System.out.println("1. 학생 정보 및 점수 입력");
            System.out.println("2. 로그인");
            System.out.println("3. 학생 정보 출력");
            System.out.println("4. 합계와 평균 출력");
            System.out.println("5. 로그아웃");
            System.out.println("6. 프로그램 종료");
            System.out.println("---------------------------");
            System.out.print("번호를 선택하세요: ");
			
            int select = sc.nextInt();
            
            switch(select) {
            case 1:
            		System.out.print("id 입력: ");
                    String id = sc.next();
                    System.out.print("이름 입력: ");
                    String name = sc.next();
                    System.out.print("비밀번호 입력: ");
                    String password = sc.next();
                    System.out.print("나이 입력: ");
                    int age = sc.nextInt();
                    System.out.print("국어점수 입력: ");
                    int kor = sc.nextInt();
                    System.out.print("영어 입력: ");
                    int eng = sc.nextInt();
                    System.out.print("컴퓨터 입력: ");
                    int com = sc.nextInt();
                    System.out.print("수학 입력: ");
                    int math = sc.nextInt();

                    Grade grade = new Grade(id, name, password, age, kor, eng, com, math);
                    gList.add(grade);
            	
            	break;
			/*
			case 2:
			//loginTry = 0;
			//while(loginTry < 3) {
				if(check) {
					System.out.println("이미 로그인 되어 있습니다");
					
				}else {
					loginTry = 0;
					while(loginTry < 3) {
			    		System.out.print("ID를 입력하세요 : ");
			            String loginId = sc.next();
			            System.out.print("PASSWORD를 입력하세요 : ");
			            String loginPassword = sc.next();
			            
			            for(int i=0; i< gList.size(); i++) {
			            	if(gList.get(i).getId().equals(loginId) && gList.get(i).getPassword().equals(loginPassword)) {
			            		check = true;
			            		gListIndex = i;
			            		loginTry = 0;
			            		System.out.println("로그인 성공");
			            		break;
			            	}
			            }
			            if(check) {
			            	break;
			            }else{
			            	loginTry++;
			            	System.out.println("ID혹은 PASSWORD가 틀렸습니다. 다시 입력하세요");
			            }
			            if(loginTry >= 3) {
			        		System.out.println("3번의 로그인에 실패하였습니다.본인 확인이 필요합니다");
			        	}
					}//while
				}
			//}//while
			
			break;
			*/
            case 2:
            	loginTry = 0;
            	outter:while(loginTry < 3) {
            		if(check) {
                		System.out.println("이미 로그인 되어 있습니다");
                	}else {
                		System.out.print("ID를 입력하세요 : ");
                        String loginId = sc.next();
                        System.out.print("PASSWORD를 입력하세요 : ");
                        String loginPassword = sc.next();
                        
                        for(int i=0; i< gList.size(); i++) {
                        	if(gList.get(i).getId().equals(loginId) && gList.get(i).getPassword().equals(loginPassword)) {
                        		check = true;
                        		gListIndex = i;
                        		loginTry = 0;
                        		System.out.println("로그인 성공");
                        		break outter;
                        	}
                        }
                        if(!check) {
                        	loginTry++;
                        	System.out.println("ID혹은 PASSWORD가 틀렸습니다. 다시 입력하세요");
                        	if(loginTry >= 3) {
                        		System.out.println("3번의 로그인에 실패하였습니다.본인 확인이 필요합니다");
                        		select=2;
                        		
                        	}
                        }
                	}
            	}
            	
            	break;
            case 3:
            	if(!check) {
            		System.out.println("로그인 후에만 출력 가능합니다");
            	}else {
            		System.out.println(gList.get(gListIndex));
            	}
            	break;
            case 4:
            	if(!check) {
            		System.out.println("로그인 후에만 출력 가능합니다");
            	}else {
            		System.out.println("합계" + gList.get(gListIndex).getTotalScore());
            		System.out.println("평균" + gList.get(gListIndex).getAvg());
            	}
            	break;
            case 5:
            	check=false;
            	gListIndex = -1;
            	System.out.println("로그아웃 되었습니다");
            	break;
            case 6:
            	System.out.println("프로그램을 종료합니다");
            	return;
            default:
            	System.out.println("1~6사이의 번호를 선택해주세요");
            	break;
            }
            
		}
		
	}
}
