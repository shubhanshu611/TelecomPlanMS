package com.example.TelecomPlanRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.demo.infytel.entity.Plan;
import com.example.TelecomPlanModel.PlanModel;

public interface PlanRepository extends JpaRepository<PlanModel, Long> {
	

}