import java.time.LocalDate;

public class Seller {
    private LocalDate dateOfBirth;
    private String nameOfSeller;
    private int numberOfContracts;
    private int quantityOfCarrots;
    private String addressOfSeller;
    private String registrationNumber;

    public String getNameOfSeller() {
        return nameOfSeller;
    }

    public void setNameOfSeller(String nameOfSeller) {
        this.nameOfSeller = nameOfSeller;
    }

    public String getAddressOfSeller() {
        return addressOfSeller;
    }

    public void setAddressOfSeller(String addressOfSeller) {
        this.addressOfSeller = addressOfSeller;
    }

    private double carConsumption;
}
