/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.controllers;

import com.mcc.crud.entities.Region;
import com.mcc.crud.services.RegionService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ASUS-PC
 */
@Controller
public class RegionController {
    
    @Autowired
    RegionService regionService;
    
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("rgn", new Region());
        model.addAttribute("Region", regionService.getAll());
        return "index";
    }
    
    @PostMapping("/save")
    public String save(@Valid Region region) {
        regionService.save(region);
        return "redirect:/";
    }
}
