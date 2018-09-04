

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	


	public Dough createDough() {

		return new ThinCrustDough();

	}



	public Sauce createSauce() {

		return new MarinaraSauce();

	}




	public Veggies[] createVeggies() {

		Veggies veggies[] = { new BlackOlives(), new Spinach(),new Eggplant() };

		return veggies;

	}



	public Pepperoni createPepperoni() {

		return new SlicedPepperoni();

	}



	public Clams createClam() {

		return new FreshClams();

	}



	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

}

