package com.cheesefactory.catalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cheesefactory.catalog.businessmodel.implementation.CatalogItem;
import com.cheesefactory.catalog.businessmodel.interfaces.ICatalogItem;
import com.cheesefactory.catalog.services.implementation.GetCatalogItemsService;
import com.cheesefactory.catalog.services.inetrfaces.IGetCatalogItemsService;


@Configuration
public class BusinessItemsConfig {

@Bean
public ICatalogItem getCatalogItem()
	{
		return new CatalogItem ();
	}

@Bean
public IGetCatalogItemsService getCatalogItemsService()
{
	return new GetCatalogItemsService();
}

}
