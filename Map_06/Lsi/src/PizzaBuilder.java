
public abstract class PizzaBuilder {
	protected Pizza pizza = new Pizza();
	public abstract void buildPreco();
	public abstract void buildDscMotor();
	public abstract void buildAnoDeFabricacao();
	public abstract void buildModelo();
	public abstract void buildMontadora();
	public Pizza getCarro(){
		return pizza;
	};

}
