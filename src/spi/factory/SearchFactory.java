package spi.factory;

import java.util.Iterator;
import java.util.ServiceLoader;

import spi.api.Search;

public class SearchFactory {
	private SearchFactory(){	
	}
	
	public static Search newSearch() {
		Search search = null;
		ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class); 
		Iterator<Search> serviceIterator = serviceLoader.iterator();
		while(serviceIterator.hasNext()) {
			search = serviceIterator.next();
		}
		return search;
	}
}
