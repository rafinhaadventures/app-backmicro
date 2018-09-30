package app.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Controller {
	
	@RequestMapping(value="/prueba", method=RequestMethod.GET)
	public String prueba(){
		return "OK";
	}
	
}
