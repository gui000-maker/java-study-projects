package VehicleRegistry;

import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object comparedObj) {
        if (this == comparedObj) {
            return true;
        }

        if (!(comparedObj instanceof LicensePlate comparedLicensePlate)) {
            return false;
        }

        if (this.country.equals(comparedLicensePlate.country)
                && this.liNumber.equals(comparedLicensePlate.liNumber)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, liNumber);
    }
}
