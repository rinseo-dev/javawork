package object01;

class Value{
	int value; ////value1.value = 20;
	//이게 value1이 가리키는 값인가봄
	
	Value(int value) {
		this.value = value;
	}
	/*
	@Override //equals하고 나서 나온 ()괄호 안의 객체인 value2가 Object o자리에 들어옴.
	public boolean equals(Object o) { //o에 new Value(10)값이 들어온 상황. 자식타입을 o라는 부모의 타입으로 형변환 된 상태. new Value(10)가 자식이므로.
					//여기서 Object를 사용하는 이유는 모든 클래스는 명시하지않으면 Object를 상속하므로 활용도가 높음
					//Object를 상속받은 값들이 모두 들어올 수 있음. 가장 상위의 부모클래스이므로
					//Object로 받아서 자식타입으로 형변환하지 않으면 부모타입이 가지고 있는 것만 쓸 수 있음.
					//Object로 받고 나서 자식타입으로 형변환하면 자식타입, 부모타입의 필드를 쓸 수 있음 그래서 형변환 함.
		//o.value라고 하면 int value값을 의미함.
		Value v  = (Value)o; //여기선 부모타입이 된 것'o'을 다시 자식타입'Value'으로 강제형변환
		int num = v.value; //v.value는 int형임. 값을 value로 가져옴
		//여기서 value가 가리키는 값은 Value2객체의 value값 10. 그걸 num에 넣음.
		
		//int num = ((Value)o).value; 위의 두줄을 한줄로 표현
		
		return value == num;//같으면true
		//여기서 비교되는 value는 Value1객체에 있는 value값 10
		//그래서 Value1,2객체에 있는 value값이 같은지 비교 하는 것
	}
	*/
	//이 방식을 쓰면 위의 주석된 4줄 대신 2줄로 리턴구문을 완성할 수 있음
	//num대신 ((Value)o).value를 써도 됨.그럼 내용 없이 return만 있어도 됨.
	public boolean equals(Object o) {
		return value ==((Value)o).value; //((Value)o)자식의 객체에서 .value라는 필드에 값을 넣음.
	}
	
	
}

public class Equals01 {//extends Object는 명시하지 않아도 모든 클래스에 자동으로 들어감.

	public static void main(String[] args) {
		/*
		주소는 다르고 값은 같은 상황이었는데 설명 쉬우라고 10,20으로 값 변경됨
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		*/
		Value value1 = new Value(10); //value1.value = 10; Value1객체를 생성할 때 생성자를 통해서 Value()의 int value에 10이 들어감. 
		Value value2 = new Value(20); //value2.value = 20;
				 
		//오버라이딩 하기 전 - equals()를 사용하면 주소가 같은지를 봄
		/*
		System.out.println("----- equals로 비교 주소가 같은지 -----");
		if(value1.equals(value2))
			//equals()메서드가 호출되어서 value2값이 Object o에 전달됨
			//value1.equals()라고 보면 value1과 연관있는 equals()메서드를 호출한 것.
			System.out.println("value1과 value2의 주소가 같다");
		else
			System.out.println("value1과 value2의 주소가 다르다");
			
			여기서는 '주소가 다르다' 가 출력됨
		*/
		//오버라이딩 하고 난 후 
		System.out.println("----- equals로 비교 오버라이딩 후 값이 같은지 -----");
		if(value1.equals(value2)) //value2라는 값을 만들어서 equals()의 Object o에 넣어줌.
			System.out.println("value1과 value2의 값이 같다");
		else
			System.out.println("value1과 value2의 값이 다르다");
		//10,20으로 값이 달라졌으므로 값이 다르다가 출력됨
		
		//String으로 오버라이딩 하지 않은 equals는 '=='과 같은 결과를 가짐.
		System.out.println("----- '=='로 비교 주소가 같은지 -----");
		if(value1==value2)
			System.out.println("value1과 value2의 주소가 같다");
		else
			System.out.println("value1과 value2의 주소가 다르다");
		
		System.out.println("----- value1에 value2값을 넣어주고 equals로 비교 주소가 같은지 -----");
		value1 = value2;//여기선 주소도, 값도 같음.Value2를 Valu1e1에 넣었으므로
		
		if(value1.equals(value2))
			System.out.println("value1과 value2의 주소가 같다");
		else
			System.out.println("value1과 value2의 주소가 다르다");
	}

}
