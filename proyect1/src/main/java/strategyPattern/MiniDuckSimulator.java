package strategyPattern;

public class MiniDuckSimulator {
	
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.perfomrQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketBehavior());
		model.performFly();
	}

}
