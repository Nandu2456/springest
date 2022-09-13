package com.springrest.springest.services;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springest.entities.Load;
import com.springrest.springest.dao.*;
@Service
public class LoadServiceImpl implements LoadService {
	@Autowired
	private LoadDoa loadDao;
	//List<Load> list;
	public LoadServiceImpl()
	{
		
		
		
	}

	@Override
	public List<Load> getLoads() {
		
		
		return loadDao.findAll();
	}

	@Override
	public Load getLoad(long le) {
		
	
		return loadDao.getOne(le);
	}

	@Override
	public Load addLoad(Load load) {
	  
		loadDao.save(load);
		return load;
	}

	@Override
	public Load UpdateLoad(Load load) {
		
		loadDao.save(load);
		return load;	
	}

	
	@Override
	public void deleteload(long d) {
		
		
		Load entity=loadDao.getOne(d);
		loadDao.delete(entity);
	}
	
}
