package list01;

import java.util.ArrayList;

public class ExTest04 {

	public static void main(String[] args) {
		
		ArrayList<Person> pList = new ArrayList<Person>(3);

		/*
		List<Person> list = new ArrayList<>();
		list.add("김첨지",35,"01077777777","행운동");
		*/
		
		pList.add(new Person("김첨지",35,"01077777777","행운동"));
		pList.add(new Person("이삿짐",24,"01024242424","이사동"));
		pList.add(new Person("동그리",00,"01000000000","동동동"));
		
		/*
		System.out.println(pList+", ");
		*/
		for(Person person : pList)
			System.out.println(person);
	}

}
