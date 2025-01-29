package core.services.interfaces;

import core.services.Store;
import estorePojo.exceptions.UnknownItemException;

public interface ProviderInterface {

    int order(StoreInterface store, Object item, int qty) throws UnknownItemException;

    double getPrice(Object item) throws UnknownItemException;

}
