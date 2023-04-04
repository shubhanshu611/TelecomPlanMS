package com.example.TelecomPlanController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TelecomPlanModel.PlanModel;
import com.example.TelecomPlanRepository.PlanRepository;

@RestController
@RequestMapping("/plans")
public class PlanController {
    
    @Autowired
    private PlanRepository planRepository;
    
    @GetMapping("/getAllPlans")
    public List<PlanModel> getAllPlans() {
        return planRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public PlanModel getPlanById(@PathVariable Long id) {
        return planRepository.findById(id)
                .orElseThrow();
    }
}