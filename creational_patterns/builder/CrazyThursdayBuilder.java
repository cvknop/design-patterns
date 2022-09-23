public class CrazyThursdayBuilder implements KfcBuilder {

    SetMeal setMeal;

    public CrazyThursdayBuilder() {
        setMeal = new SetMeal();
    }

    public SetMeal buildSetMeal() {
        buildCake();
        buildChicken();
        buildDrink();
        return setMeal;
    }

    @Override
    public void buildChicken() {
        setMeal.setChicken("香辣yun指鸡");
    }

    @Override
    public void buildDrink() {
        setMeal.setDrink("cola");
    }

    @Override
    public void buildCake() {
        setMeal.setCake("薯条");
    }
}
