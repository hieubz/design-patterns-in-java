package creation.factory_method;

public class FreeProduct extends Product {

  public FreeProduct(String name, long price) {
    super(name, price);
  }

  @Override
  public long order(long amount) {
    return 0;
  }
}
