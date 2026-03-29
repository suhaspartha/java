import java.util.Objects;

public record Address(Integer doorNum, String street) {
     public Address {
        Objects.requireNonNull(street);
        Objects.requireNonNull(doorNum);
    }
}
