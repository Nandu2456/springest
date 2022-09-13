package com.springrest.springest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springest.entities.Load;
import com.springrest.springest.services.LoadService;

@RestController
public class MyController {
	@Autowired
	private LoadService l1;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	@PostMapping("/load")
	public List<Load> getLoads()
	{
		return this.l1.getLoads();
		
	}
	
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId)
	{
		return this.l1.getLoad(Long.parseLong(loadId));
	}
	
	@GetMapping("/load")
	public Load addLoad(@RequestBody Load load)
	{
	
		return this.l1.addLoad(load);
	}
	
	

	@PutMapping("/load")
	public Load UpdateLoad(@RequestBody Load load)
	{
		
		return this.l1.UpdateLoad(load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteload(@PathVariable String loadId)
	{
		try
		{
		  this.l1.deleteload(Long.parseLong(loadId));
		  return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
