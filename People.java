package ru.people.study;

public class People {
int age;
String name;
	public static void main(String[] args) {
		Students student1 = new Students("John",20);
		Schoolers schooler1 = new Schoolers("Jane", 13, 1411);
		Schoolers schooler2 = new Schoolers("Ivan", 16);
schooler1.output(1411);
System.out.println();
schooler2.output("Нет");
	}

}
