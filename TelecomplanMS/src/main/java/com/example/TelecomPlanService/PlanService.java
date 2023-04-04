package com.example.TelecomPlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TelecomPlanModel.PlanModel;
import com.example.TelecomPlanRepository.PlanRepository;

@Service
public class PlanService {
	
	@Autowired
	private PlanRepository planRepo;
	
	public PlanModel savePlan(PlanModel planModel)
	{
		return planRepo.save(planModel);
	}
	
	

}
