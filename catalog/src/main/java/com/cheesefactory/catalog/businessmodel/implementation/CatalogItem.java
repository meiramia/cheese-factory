package com.cheesefactory.catalog.businessmodel.implementation;

import com.cheesefactory.catalog.businessmodel.interfaces.ICatalogItem;

public class CatalogItem implements ICatalogItem {

	
	private String name;
	private String catalogId;
	private String type;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getCatalogId() {
		return catalogId;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setName(String v) {
		name = v ;
	}

	@Override
	public void setCatalogId(String v) {
		catalogId = v ;
	}

	@Override
	public void setType(String v) {
		type = v;
	}

}
