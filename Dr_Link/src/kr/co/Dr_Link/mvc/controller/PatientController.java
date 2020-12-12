package kr.co.Dr_Link.mvc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.Dr_Link.mvc.dao.PrescriptionDaoImp;
import kr.co.Dr_Link.mvc.dto.PrescriptionDTO;

@Controller
@RequestMapping(value = "/patients")
public class PatientController {

	@Autowired	
	private PrescriptionDaoImp pre_dao;
	
	
	@RequestMapping(value = "{step}")
	public String accessAnyFiles(@PathVariable String step) {
		System.out.println("patients 컨트롤러");
		return "/patients/"+step;
	}
	
	@RequestMapping(value = "/detail_prescription") 
	public String end_prescription(PrescriptionDTO vo,Model model) {
		List<PrescriptionDTO> precescription = pre_dao.detail_prescription(vo); 
		model.addAttribute("precescription",precescription);
		System.out.println("controller detail_prescription 실행 완료");	    
		return "/patients/detail_prescription";
	}

}
