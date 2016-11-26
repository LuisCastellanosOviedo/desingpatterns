package strategyPattern;

public abstract class Duck {
	
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;
   
   public void perfomrQuack(){
	   quackBehavior.quack();
   }
   
   public void performFly(){
	   flyBehavior.fly();
   }
   
   public abstract void display();

   public void swim (){
	   System.out.println("Todos los patos nadan :) ");
   }

public void setQuackBehavior(QuackBehavior quackBehavior) {
	this.quackBehavior = quackBehavior;
}

public void setFlyBehavior(FlyBehavior flyBehavior) {
	this.flyBehavior = flyBehavior;
}
   
   
   
}
