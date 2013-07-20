/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.service;

import java.util.List;

import fr.hoteia.qalingo.core.domain.Retailer;
import fr.hoteia.qalingo.core.domain.Store;

public interface RetailerService {

	// RETAILER
	
	Retailer getRetailerById(String retailerId);

	Retailer getRetailerByCode(Long marketAreaId, Long retailerId, String retailerCode);

	List<Retailer> findRetailers(Long marketAreaId, Long retailerId);
	
	void saveOrUpdateRetailer(Retailer retailer);
	
	void deleteRetailer(Retailer retailer);
	
	// STORE
	
	Store getStoreById(String storeId);

	Store getStoreByCode(String storeCode);

	List<Store> findStores();
	
	void saveOrUpdateStore(Store store);
	
	void deleteStore(Store store);

}