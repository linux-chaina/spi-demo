package spi.api.impl;

import java.util.List;

import spi.api.Search;

public class FileSearch implements Search{

	@Override
	public List search() {
		System.out.println("文件系统搜索数据");
		return null;
	}

}
