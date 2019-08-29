package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spitter;
import spittr.data.SpitterRepository;
@Controller
@RequestMapping("spitter")
public class SpitterController {
	
	private SpitterRepository spitterRepository;
	@Autowired
	public SpitterController(SpitterRepository spitterRepository) {
		this.spitterRepository = spitterRepository;
	}
	
	/**
	 * ±íµ¥¿ØÖÆÆ÷
	 * @return
	 */
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String showRegistrationForm(){
		return "registrationForm";
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String processRegistration(@Validated Spitter spitter,Errors errors){
		if(errors.hasErrors()){
			return "registrationForm";
		}
		
		spitterRepository.save(spitter);
		System.out.println("$$$$$$$$$$$$$$");
		return "redirect:/spittles";
	}
}
