package calculator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {

//	@RequestMapping("add")
//	public void add(HttpServletRequest req,HttpServletResponse res) throws IOException{
//		int num1=Integer.parseInt(req.getParameter("num1"));			
//		int num2=Integer.parseInt(req.getParameter("num2"));
//		
//		int num3=num1+num2;
//		res.getWriter().print("<h1>The sum of "+num1+"+"+num2+"="+num3);
//	}
//	
//	@RequestMapping("sub")
//	public void sub(@RequestParam int num1,@RequestParam int num2,HttpServletResponse res) throws IOException{
//		int num3=num1-num2;
//		res.getWriter().print("<h1>The substraction of "+num1+"-"+num2+"="+num3);	
//	}
//	@RequestMapping("mul")
//	@ResponseBody
//	public String mul(@RequestParam int num1,@RequestParam int num2) {
//		int num3=num1*num2;
//		return "<h1> The product of "+num1+" and "+num2+" is "+num3 +"</h1>";
//	}
	@RequestMapping("add")
	public ModelAndView sum(@RequestParam int num1,@RequestParam int num2) {
		int num3=num1+num2;
		ModelAndView andView=new ModelAndView();
		andView.setViewName("Result.jsp");
		andView.addObject("num1",num1);
		andView.addObject("num2",num2);
		andView.addObject("operation","sum");
		andView.addObject("num3",num3);//add attribute setting the attribute
		return andView;
	}
	
	@RequestMapping("sub")
	public ModelAndView sub(@RequestParam int num1,@RequestParam int num2) {
		int num3=num1-num2;
		ModelAndView andView=new ModelAndView();
		andView.setViewName("Result.jsp");
		andView.addObject("num1",num1);
		andView.addObject("num2",num2);
		andView.addObject("operation","substraction");
		andView.addObject("num3",num3);//add attribute setting the attribute
		return andView;
	}
	@RequestMapping("mul")
	public ModelAndView mul(@RequestParam int num1,@RequestParam int num2) {
		int num3=num1*num2;
		ModelAndView andView=new ModelAndView();
		andView.setViewName("Result.jsp");
		andView.addObject("num1",num1);
		andView.addObject("num2",num2);
		andView.addObject("operation","multiplication");
		andView.addObject("num3",num3);//add attribute setting the attribute
		return andView;
	}
	@RequestMapping("div")
	public ModelAndView div(@RequestParam double num1,@RequestParam double num2) {
		double num3=num1/num2;
		ModelAndView andView=new ModelAndView();
		andView.setViewName("Result.jsp");
		andView.addObject("num1",num1);
		andView.addObject("num2",num2);
		andView.addObject("operation","Division");
		andView.addObject("num3",num3);//add attribute setting the attribute
		return andView;
	}
	
}
