package creation.factory_method;

public class Factory {

  public Product newProduct(String name, long price) {
    final Product product;
    if (price == 0) {
      product = new FreeProduct(name + " FREE", price);
    } else {
      product = new PricedProduct(name, price);
    }
    return product;
  }
}
