package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentDao dao;
	@RequestMapping(value="addstd",method=RequestMethod.GET)
	public String showAddStudentForm(){
		return "AddStudent";
	}
	@RequestMapping(value="addstd",method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student std){
		ModelAndView mav = new ModelAndView();
		String msg;
		int rows = dao.addStudent(std);
		/*if(rows>0)
			 msg = "Record inserted";
		else
		    msg = "Record not inserted";
		mav.addObject("message",msg);
		mav.addObject("std",std);
		mav.setViewName("welcome");*/
		
		mav.setViewName("redirect:viewstd");
		return mav;
	}
	@RequestMapping("viewstd")
	public ModelAndView viewStudents(){
		ModelAndView mav = new ModelAndView();
		List<Student> stdlist = dao.getStudents();
		mav.addObject("list",stdlist);
		mav.setViewName("ViewStudents");
		return mav;
	}
	@RequestMapping("")
	public ModelAndView deleteStudents(@ModelAttribute("student") int rno)
	{
		ModelAndView mav = new ModelAndView();
		int rows = dao.deleteStudent(rno);
		mav.setViewName("redirect:viewstd");
		return mav;
		
	}

}
