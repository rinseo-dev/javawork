package set_map02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Member {
	String name;
	int age;

	/*
	 필드 내용을 작성 후 Alt+Shift+S를 클릭하면 메뉴-Source 가 실행됨
	 toString, constructor using field, getter/setter, hashCode and equals() 네가지 생성함.
	*/

	//총 3개의 오버라이딩이 있는 상태
	@Override
	public int hashCode() {
		
		//원래 만들었던 자동생성 return값
		//return Objects.hash(age, name);
		
		return name.hashCode()+age;
		//String은 hashCode를 오버라이딩 하지 않아도 이미 되어있는 상태
		//이거 설명 맨밑에 붙여놓음 주석
		
		//추가 : 같은 값을 해시코드로 만들어서 같다고 나옴
		
	}


	@Override
	public boolean equals(Object obj) { //obj는 매개변수에 넣은 객체(?)엥
	if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //내 클래스와 넣은 값의 클래스가 같지않으면 false
			return false;
		Member other = (Member) obj;//obj에 있는 걸 Member라는 자식타입으로 형변환으로 넣어서 값 비교
		return age == other.age && Objects.equals(name, other.name);
		
		/* 이건 쌤이 간단하다고 작성해주셨지만 아니었다.. 는 결론
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (member.age == age) && (member.name.equals(name)); //양쪽일 모두 참일때만 참
			//age 는 int형이므로 '=='로 같은지 비교
			//age가 같고, name이 같고, 객체가 name으로 만들어져있을때만 true
			
			//추가: ==뒤에 age는 this.age를 가리킴
			//name도 String으로 오버라이드 되어있어서 name과 name이 같다고 나옴
		}
		return false;
		*/
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}


	//getter,setter를 만들 때 잔액같은건 set안해도 되므로 체크안하는 등 방법.
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Member() {
		super();
	}

	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

/*
 일반적으로 `hashCode` 메서드를 재정의할 때는 다음의 원칙을 따릅니다:

1. 같은 객체는 항상 같은 해시 코드를 반환해야 합니다.
2. 다른 객체라도 가능한 한 서로 다른 해시 코드를 반환해야 합니다.

`hashCode` 메서드를 재정의한 이유는 주로 객체가 동등성(equality)을 판단할 때 사용되는 `equals` 메서드와 함께 사용하기 위함입니다. 즉, 두 객체가 `equals` 메서드로 동등한지 판단할 때, 그 먼저 해시 코드가 일치하는지 확인하고, 해시 코드가 일치하면 실제로 `equals` 메서드를 호출하여 두 객체가 동등한지 비교합니다.

주어진 코드에서는 `name.hashCode()`와 `age` 값을 더한 결과를 반환합니다. 이는 `name` 문자열의 해시 코드와 `age`의 값을 합하여 객체의 해시 코드를 생성하는 방식입니다. 이렇게 구현된 `hashCode` 메서드는 `name`과 `age` 값이 같은 두 객체에 대해서는 동일한 해시 코드를 반환하며, `equals` 메서드도 적절하게 재정의된 경우, 두 객체를 동등한 것으로 판단할 수 있습니다.

하지만 중요한 점은 `hashCode` 메서드를 재정의할 때, `equals` 메서드와 일관성을 유지해야 하며, 해시 코드를 생성하는 방식은 객체의 동등성 판단에 맞아야 합니다. 객체의 해시 코드가 일치하면 `equals` 메서드를 통해 객체가 동등한지 판단하므로, 이러한 관점에서 해시 코드를 재정의해야 합니다.
 */

public class HashSet02 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));//오버라이드 해놔서 두 값이 같게 나옴
		//set을 사용하는 이유는 값이 같은거면 중복을 제외하고 1개만 남기고 싶기 때문.
		System.out.println(set.size());
		/*
		String - hashCode()
				 equals() 
		이미 toString이 되어 있는 상태
		name.hashCode()로 서로 다른 객체에 같은 hashCode값을 넣어줌.
		
		hashCode의 return값이 같고, equals()가 true면 저장..?
		
		hashCode를 주석처리하면 두개의 홍길동은 값이 다른 걸로 인식됨.
		오버라이딩을 통해서 같다고 해줘야 함.
		*/		
	}

}

/* 전체 설명
 주어진 코드는 `Member` 클래스와 `Set02` 클래스를 포함하고 있습니다. 
이 코드는 Java에서 `Set` 컬렉션을 사용하여 `Member` 객체를 저장하고 
중복된 요소를 처리하는 방법을 보여줍니다.

`Member` 클래스:
- `Member` 클래스는 두 개의 속성인 `name` (문자열)과 `age` (정수)를 가지고 있습니다.
- `hashCode`, `equals`, `toString` 메서드가 재정의되어 있습니다.
  - `hashCode` 메서드는 `name`의 해시 코드와 `age`를 합하여 객체의 해시 코드를 생성합니다. 
이렇게 함으로써 `name`과 `age`가 같은 `Member` 객체는 동일한 해시 코드를 가지게 됩니다.
  - `equals` 메서드는 다른 `Member` 객체와 현재 객체를 비교하여 `name`과 `age`가 동일한지 확인합니다.
  - `toString` 메서드는 객체를 문자열로 표현하는데 사용됩니다.

`Set02` 클래스:
- `Set02` 클래스는 `main` 메서드를 포함하고 있습니다.
- `HashSet`을 사용하여 `Member` 객체를 저장하고 중복된 요소를 처리합니다.
- 두 개의 동일한 `Member` 객체를 `set`에 추가하고, 중복된 요소가 자동으로 제거됩니다.
- `set.size()`를 호출하여 `set`의 크기를 출력하면 중복이 제거된 요소의 개수가 출력됩니다.

결과:
코드 실행 결과, `set`에는 중복이 제거된 두 개의 `Member` 객체가 포함되므로 
`set.size()`의 반환값은 1이 됩니다. 따라서 결과로 1이 출력됩니다.

이렇게 `Set`을 사용하면 중복을 허용하지 않는 컬렉션을 쉽게 관리할 수 있으며, 
`hashCode` 및 `equals` 메서드를 재정의하여 중복 여부를 판단할 수 있습니다.
*/
