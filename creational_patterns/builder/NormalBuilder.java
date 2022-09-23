public class NormalBuilder implements KfcBuilder {
    @Override
    public void buildChicken() {
        System.out.println("error");
    }

    @Override
    public void buildDrink() {
        System.out.println("water");
    }

    @Override
    public void buildCake() {
        System.out.println("fresh air");
    }
}
