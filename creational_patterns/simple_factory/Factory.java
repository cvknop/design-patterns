import java.util.Optional;

public class Factory {
    public static Product getProductByType(String type) {
        if (Optional.ofNullable(type).isPresent()) {
            if ("A".equals(type)) {
                return new Apple();
            }
            if ("C".equals(type)) {
                return new Car();
            }
        }
        return null;
    }
}
