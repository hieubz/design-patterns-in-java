package structure.proxy;

/**
 * the real object to access free network without filters, and sometimes we can't update/inherit
 * this class
 */
public final class FreeNetworkClient implements NetworkClient {

  @Override
  public String call(String url) {
    return "It's a response from " + url;
  }
}
