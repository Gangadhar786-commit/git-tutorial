package com.lambda.program;

abstract class Shape{ 
	abstract void draw();
	void meow(){System.out.println("This is cat meow");}
}
class Rectangle extends Shape{
	void draw(){System.out.println("This is Rectangle");
	}
}
class Circle1 extends Shape{
	void draw(){System.out.println("This is Circle");}
}
class Square extends Shape{
	void draw(){System.out.println("This is Square");
	}
}
class Abstraction2{
	public static void main(String args[]){
		Shape s=new Rectangle();
		s.draw();
		Shape sh=new Circle1();
		sh.draw();

		Shape s1=new Square();
		s1.draw();

		Shape m=new Square();
		m.meow();

	}
}
