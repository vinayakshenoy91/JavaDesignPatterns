import builderPattern.PizzaOrder;
import builderPattern.PizzaOrder.PizzaBuilder;
import singletonPattern.SingletonPattern;

public class DemoPatterns {
	public static void main(String[] args) {

		// Singleton Pattern
		System.out.println(SingletonPattern.getInstance());
		System.out.println(SingletonPattern.getInstance());

		// Prototype Pattern
		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		PizzaOrder order = pizzaBuilder.bread("brown").cheese("mozerella").mushrooms("button").sauce("chilli").build();
		System.out.println(order.toString());
		
	}
}
