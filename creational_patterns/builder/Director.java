public class Director {
    public SetMeal construct(KfcBuilder builder) {
        return new CrazyThursdayBuilder().buildSetMeal();
    }
}
