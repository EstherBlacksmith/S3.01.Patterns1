package exercise2;

public class InternationalAddress implements AddressInterface {
    @Override
    public AddressInterface createAddress() {
        return InternationalAddress::new;
    }
}
