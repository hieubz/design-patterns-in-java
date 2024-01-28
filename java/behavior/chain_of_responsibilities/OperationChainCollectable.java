package behavior.chain_of_responsibilities;

import java.util.List;

public interface OperationChainCollectable<T> {
  List<T> handle(List<T> objs);
}
