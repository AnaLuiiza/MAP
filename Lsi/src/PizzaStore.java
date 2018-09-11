
public class PizzaStore {
	
	protected PizzaBuilder pizza;
	 
    public PizzaStore(PizzaStore pizzaStore) {
        this.pizza = pizzaStore;
    }
 
    public void construirCarro() {
        pizza.buildPreco();
        pizza.buildAnoDeFabricacao();
        pizza.buildDscMotor();
    
    }
 
    public Pizza getCarro() {
        return pizza.getCarro();
    }

}
