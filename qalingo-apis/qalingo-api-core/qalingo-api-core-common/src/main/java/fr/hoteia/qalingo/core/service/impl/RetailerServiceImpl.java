/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.hoteia.qalingo.core.dao.RetailerDao;
import fr.hoteia.qalingo.core.domain.Retailer;
import fr.hoteia.qalingo.core.domain.Store;
import fr.hoteia.qalingo.core.service.RetailerService;

@Service("retailerService")
@Transactional
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	private RetailerDao retailerDao;

	// RETAILER
	public Retailer getRetailerById(final String rawRetailerId) {
		long retailerId = -1;
		try {
			retailerId = Long.parseLong(rawRetailerId);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
		return retailerDao.getRetailerById(retailerId);
	}
	
	public Retailer getRetailerByCode(final Long marketAreaId, final Long retailerId, final String retailerCode) {
		return retailerDao.getRetailerByCode(marketAreaId, retailerId, retailerCode);
	}

	public List<Retailer> findRetailers(final Long marketAreaId, final Long retailerId) {
		return retailerDao.findRetailers(marketAreaId, retailerId);
	}
	
	public void saveOrUpdateRetailer(final Retailer retailer) {
		retailerDao.saveOrUpdateRetailer(retailer);
	}

	public void deleteRetailer(final Retailer retailer) {
		retailerDao.deleteRetailer(retailer);
	}
	
	// STORE
	
	public Store getStoreById(final String rawStoreId) {
		long storeId = -1;
		try {
			storeId = Long.parseLong(rawStoreId);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
		return retailerDao.getStoreById(storeId);
	}
	
	public Store getStoreByCode(final String storeCode) {
		return retailerDao.getStoreByCode(storeCode);
	}

	public List<Store> findStores() {
		return retailerDao.findStores();
	}
	
	public void saveOrUpdateStore(final Store store) {
		retailerDao.saveOrUpdateStore(store);
	}

	public void deleteStore(final Store store) {
		retailerDao.deleteStore(store);
	}

}