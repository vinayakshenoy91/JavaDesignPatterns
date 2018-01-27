package builderPattern;

public class PizzaOrder {
	
	public static class PizzaBuilder{
	
		private String bread;
		
		private String sauce;
		
		private String mushrooms;
		
		private String tomatoes;
		
		private String cheese;
		
		
		public PizzaOrder build() {
			return new PizzaOrder(this);
		}
			
		public PizzaBuilder bread(String bread) {
			this.bread=bread;
			return this;
		}
		
		public PizzaBuilder sauce(String sauce) {
			this.sauce=sauce;
			return this;
		}
		public PizzaBuilder tomatoes(String tomatoes) {
			this.tomatoes=tomatoes;
			return this;
		}
		public PizzaBuilder cheese(String cheese) {
			this.cheese=cheese;
			return this;
		}
		public PizzaBuilder mushrooms(String mushrooms) {
			this.mushrooms=mushrooms;
			return this;
		}
			
	}
	
	private String bread;
	
	private String sauce;
	
	private String mushrooms;
	
	private String tomatoes;
	
	private String cheese;

	public PizzaOrder(PizzaBuilder builder) {
		this.bread = builder.bread;
		this.sauce =  builder.sauce;
		this.mushrooms = builder. mushrooms;
		this.tomatoes =  builder.tomatoes;
		this.cheese =  builder.cheese;
	}

	public String getBread() {
		return bread;
	}

	public String getSauce() {
		return sauce;
	}

	public String getMushrooms() {
		return mushrooms;
	}

	public String getTomatoes() {
		return tomatoes;
	}

	public String getCheese() {
		return cheese;
	}

	@Override
	public String toString() {
		return "PizzaOrder [bread=" + bread + ", sauce=" + sauce + ", mushrooms=" + mushrooms + ", tomatoes=" + tomatoes
				+ ", cheese=" + cheese + "]";
	}
	
	

}
