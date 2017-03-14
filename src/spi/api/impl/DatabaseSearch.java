package spi.api.impl;

import java.util.List;

import spi.api.Search;

public class DatabaseSearch implements Search {
	public DatabaseSearch() {
	}

	@Override
	public List search() {
		System.out.println("数据库搜索数据");
		return null;
	}

}
