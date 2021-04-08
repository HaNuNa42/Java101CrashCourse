public class Main {

    public static void main(String[] args) {
        //interfaceler de new parametresi almazlar. referans tutuculardır
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
