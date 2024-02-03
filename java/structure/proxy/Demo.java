package structure.proxy;

/** client code is accessing the network by our Proxy */
public class Demo {

  public static void main(String[] args) {
    final NetworkClient networkClient = new NetworkClientProxy(new FreeNetworkClient());
    final String response = networkClient.call("https://phamduyhieu.com");
    System.out.println(response);
  }
}
