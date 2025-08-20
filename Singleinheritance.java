//Implementation of Single Inheritance
class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	public void eat(){
		System.out.println(name+" is eating!");
	}
	public void sleep(){
		System.out.println(name+" is sleeping!");
	}
}
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	void bark(){
		System.out.println(name+" is barking!");
	}
}
public class Singleinheritance{
	public static void main(String args[]){
		Dog d=new Dog("Mohith");
		d.eat();
		d.sleep();
		d.bark();
	}
}								
