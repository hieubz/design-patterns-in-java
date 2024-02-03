package structure.proxy;

import lombok.AllArgsConstructor;

/** our Proxy controls access to the real networkClient object */
@AllArgsConstructor
public class NetworkClientProxy implements NetworkClient {
  private final NetworkClient realNetworkClient;

  @Override
  public String call(String url) {
    // perform something either before or after the request to the original object
    filterUrl(url);
    return realNetworkClient.call(url);
  }

  private void filterUrl(String url) {
    if (url.contains("xxx")) {
      throw new IllegalArgumentException(url + " is invalid!");
    }
  }
}
