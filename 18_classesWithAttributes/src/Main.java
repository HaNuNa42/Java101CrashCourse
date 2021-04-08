public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"laptop","asus",3000, 5, "gold");
 /*       product.setName("laptop");
        product.setId(1);
        product.setDescription("lenovo");
        product.setPrice(7500);
        product.setStockAmount(3);
*/
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getName());

        System.out.println(product.getKod());
    }
}
