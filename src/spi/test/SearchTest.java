package spi.test;

import spi.api.Search;
import spi.factory.SearchFactory;

public class SearchTest {
	public static void main(String[] args) {
		Search search =  SearchFactory.newSearch();
		search.search();
	}
}
