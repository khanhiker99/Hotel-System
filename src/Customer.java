import java.util.Objects;

public class Customer extends Person{
    private String type;
    private String passport;

    public Customer(String name, String address, String phone) {
        super(name, address, phone);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Customer{" + "type='" + type + '\'' + ", passport='" + passport + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(type, customer.type) && Objects.equals(passport, customer.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, passport);
    }
}
