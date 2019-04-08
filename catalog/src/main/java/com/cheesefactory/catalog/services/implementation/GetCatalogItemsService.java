package com.cheesefactory.catalog.services.implementation;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Provider;

import com.cheesefactory.catalog.businessmodel.interfaces.ICatalogItem;
import com.cheesefactory.catalog.services.inetrfaces.IGetCatalogItemsService;

public class GetCatalogItemsService implements IGetCatalogItemsService {

	@Inject
	private Provider<ICatalogItem> catalogItemProvider;
	
	@Override
	public List<ICatalogItem> getAllCatalogItems() {
		List<ICatalogItem> catalogItemsList = new LinkedList<>();
	
		catalogItemsList.add(createItem("1","Milk","2 Liter"));
		catalogItemsList.add(createItem("2","Salt","1 Kilo"));
		catalogItemsList.add(createItem("3","Water","1 Liter"));
		return catalogItemsList;
	}

	private ICatalogItem createItem(String id, String name,String type) {
		ICatalogItem item;
		item = catalogItemProvider.get();
		item.setCatalogId(id);
		item.setName(name);
		item.setType(type);
		return item;
	}

}
