/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.services;

import com.mcc.crud.entities.Region;
import com.mcc.crud.repositories.RegionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS-PC
 */
@Service
public class RegionService {
    
    @Autowired
    RegionRepository regionRepository;
    
    /**
     * retrieve all region
     * @return List
     */
    public List<Region> getAll() {
        return regionRepository.findAll();
    }
    
    /**
     * insert a new region
     * @param region 
     */
    public void save(Region region) {
        regionRepository.save(region);
    }
    
    /**
     * delete a region
     * @param id 
     */
    public void delete(Integer id) {
        regionRepository.delete(new Region(id));
    }
    
    public Region findById(Integer id) {
        return regionRepository.findById(id).get();
    }
}
