package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  @RequestMapping("hello")
  public String welcome()
  {
	  return "welcome";
  }
  @RequestMapping("display")
  public String display()
  {
	  return "Display";
  }
  @RequestMapping("login")
  public String showLoginPage()
  {
	  return "Login";
  }
  @RequestMapping("checkuser")
  public String validate(@RequestParam("username") String username, @RequestParam("pwd") String password)
  {
	  if(username.equalsIgnoreCase("admin") && password.equals("admin"))
	      return "Admin";
	  else
		  return "Login";
  }
	 
}
