package creation.factory_method;


public class PricedProduct extends Product {

  public PricedProduct(String name, long price) {
    super(name, price);
  }

  @Override
  public long order(long amount) {
    return getPrice() * amount;
  }
}
