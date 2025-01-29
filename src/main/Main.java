package main;

import core.services.Bank;
import core.services.Client;
import core.services.Provider;
import core.services.Store;
import core.services.interfaces.BankInterface;
import core.services.interfaces.ProviderInterface;
import core.services.interfaces.StoreInterface;

public class Main {

	public static void main(String[] args) {
		ProviderInterface prov = new Provider();
		BankInterface bank = new Bank();
		StoreInterface store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
