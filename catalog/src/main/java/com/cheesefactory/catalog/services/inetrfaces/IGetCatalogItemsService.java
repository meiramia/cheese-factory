package com.cheesefactory.catalog.services.inetrfaces;

import java.util.List;

import com.cheesefactory.catalog.businessmodel.interfaces.ICatalogItem;

public interface IGetCatalogItemsService {

	List<ICatalogItem> getAllCatalogItems();

}
