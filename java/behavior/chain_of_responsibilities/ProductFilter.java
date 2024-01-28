package behavior.chain_of_responsibilities;

import java.util.List;

public interface ProductFilter<T, R> {
  List<R> handle(List<T> input);
}
