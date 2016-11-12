package ru.people.study;

public class Schoolers extends People {
	private int form;
	int numberschool;
	String Snumberschool;
	public Schoolers(String n, int a, int s){
		name=n;
		age=a;
		numberschool = s;
	}
	public Schoolers(String n, int a){
		name=n;
		age=a;
		Snumberschool="Неизвестен";
	}
	int countform(int ag){
		age=ag;
		this.form=age-6;
		return(this.form);
	}
	public void output(int s){
		System.out.println("Имя ученика: "+this.name+"\n"+
	"Возраст ученика: "+this.age+"\n"+"Номер школы: "+numberschool+"\n"+"Номер класса: "+
				countform(this.age));
	}
	public void output(String n){
		System.out.println("Имя ученика: "+this.name+"\n"+
	"Возраст ученика: "+this.age+"\n"+"Номер школы: "+Snumberschool+"\n"+"Номер класса: "+
				countform(this.age));
	}
	
}
