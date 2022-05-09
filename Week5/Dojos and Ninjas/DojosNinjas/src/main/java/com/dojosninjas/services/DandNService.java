package com.dojosninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojosninjas.models.Dojo;
import com.dojosninjas.models.Ninja;
import com.dojosninjas.repositories.DojoRepository;
import com.dojosninjas.repositories.NinjaRepository;

@Service
public class DandNService {
	
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List<Dojo> listDojos(){
		return this.dojoRepo.findAll();
	}
	
	public Dojo saveDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public Ninja saveNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	
	public Dojo dojoDetails(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}

}
