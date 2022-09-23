public class SetMeal {
    private String chicken;
    private String drink;
    private String cake;

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    @Override
    public String toString() {
        return "SetMeal{" +
                "chicken='" + chicken + '\'' +
                ", drink='" + drink + '\'' +
                ", cake='" + cake + '\'' +
                '}';
    }
}
