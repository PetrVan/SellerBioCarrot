import java.time.LocalDate;

public class Seller {
    private LocalDate dateOfBirth;
    private String nameOfSeller;
    private int numberOfContracts;
    private int quantityOfCarrots;
    private String AddressOfSeller;
    private String registrationNumber;

    public String getNameOfSeller() {
        return nameOfSeller;
    }

    public void setNameOfSeller(String nameOfSeller) {
        this.nameOfSeller = nameOfSeller;
    }

    public String getAddressOfSeller() {
        return AddressOfSeller;
    }

    public void setAddressOfSeller(String addressOfSeller) {
        AddressOfSeller = addressOfSeller;
    }

    private double carConsumption;
}
