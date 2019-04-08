package com.cheesefactory.catalog.api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cheesefactory.catalog.businessmodel.interfaces.ICatalogItem;
import com.cheesefactory.catalog.services.inetrfaces.IGetCatalogItemsService;

@RestController
public class CatalogServices {

@Inject
IGetCatalogItemsService getCatalogItemsService;
	
@RequestMapping(value ="/",		method = RequestMethod.GET , produces = {"application/json"} )
public List<ICatalogItem> getAllCatalogItems()
{
	return getCatalogItemsService.getAllCatalogItems();
	}

}
