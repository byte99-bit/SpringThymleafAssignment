package in.demoit.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import in.demoit.bindings.Register;
import in.demoit.repository.RegistrationRepository;

@Controller
public class RegisterController {
 
	@Autowired 
	private RegistrationRepository repo;
	
	
	@GetMapping("/register-form")
	public String loadForm(Model model)
	{
		Register reg=new Register();
		model.addAttribute("user", reg);
		return "index";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(Register reg, Model model)
	{
		repo.save(reg);
		model.addAttribute("msg","User Saved Successfully");
		
		return "dashboard";
	}
}
