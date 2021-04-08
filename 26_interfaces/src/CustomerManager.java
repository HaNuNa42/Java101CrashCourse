public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        //iş kodları bu kısma yazılır. bussiness layer
        customerDal.Add();
    }
}
