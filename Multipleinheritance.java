//Implementation of Multiple Inheritance
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
class Cat extends Dog{
	public Cat(String name){
		super(name);
	}
	void run(){
		System.out.println(name+" is running!");
	}
}			
public class Multipleinheritance{
	public static void main(String args[]){
		Cat c=new Cat("kitty");
		c.eat();
		c.sleep();
		c.run();
		Dog d=new Dog("chintu");
		d.eat();
		d.sleep();
		d.bark();
	}
}	
