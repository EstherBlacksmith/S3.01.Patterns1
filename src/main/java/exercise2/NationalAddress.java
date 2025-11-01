package exercise2;

public class NationalAddress implements AddressInterface {
    @Override
    public AddressInterface createAddress() {
        return NationalAddress::new;
    }
}
