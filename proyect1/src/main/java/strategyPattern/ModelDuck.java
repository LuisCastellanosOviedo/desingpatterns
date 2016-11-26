package strategyPattern;

public class ModelDuck extends Duck{

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println(" model duckkk ");
		
	}

}
