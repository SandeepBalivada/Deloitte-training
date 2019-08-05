package boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	@RequestMapping("welcome")
	public String welcome()
	{
		System.out.println("printing something");
		return "Welcome";
	}

}
