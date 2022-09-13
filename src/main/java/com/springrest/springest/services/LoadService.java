package com.springrest.springest.services;

import java.util.List;

import com.springrest.springest.entities.Load;

public interface LoadService {
	
	public List<Load> getLoads();
	
	public Load getLoad(long le);
	
	public Load addLoad(Load load);
	
	

	public Load UpdateLoad(Load load);
	
	public void  deleteload(long d);



	

	

}
