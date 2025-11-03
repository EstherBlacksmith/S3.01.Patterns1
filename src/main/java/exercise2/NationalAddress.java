package exercise2;

import java.util.Objects;

public class NationalAddress implements AddressInterface {
    private String streetType;
    private String street;
    private String streetNum;
    private String floor;
    private String stair;
    private String door;


    public NationalAddress(String street, String streetNum) {
        this.street = Objects.requireNonNull(street);
        this.streetNum = Objects.requireNonNull(streetNum);
    }

    @Override
    public AddressInterface createAddress(String street, String streetNum) {
        return new NationalAddress(street, streetNum);
    }

    protected void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    protected void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    protected void setFloor(String floor) {
        this.floor = floor;
    }

    protected void setStair(String stair) {
        this.stair = stair;
    }


    protected void setDoor(String door) {
        this.door = door;
    }
}
