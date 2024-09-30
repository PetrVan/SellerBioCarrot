public class Main {
    public static void main(String[] args) {
        Seller firstSeller = new Seller();
        Seller secondSeller = new Seller();
        firstSeller.setNameOfSeller("Pepa Novák");
        firstSeller.setAddressOfSeller("Praha");
        secondSeller.setNameOfSeller("Tomáš Hotoví");
        secondSeller.setAddressOfSeller("Brno");

        System.out.println("Prodejci mrkve: ");
        System.out.println(firstSeller.getNameOfSeller());
        System.out.println(secondSeller.getNameOfSeller());
    }
}