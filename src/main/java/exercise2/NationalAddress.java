package exercise2;

public class NationalAddress implements Address {
    @Override
    public Address createAddress() {
        return NationalAddress::new;
    }
}
