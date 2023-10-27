package com.bulbakov.spring.mvc;

import javax.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.constraints.NotBlank;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

      /*  Employee emp = new Employee();
        emp.setName("Gleb");
        emp.setSurname("Petrov");
        emp.setSalary(123000);*/
        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

   /* @RequestMapping("/showDetails")
    public String showEmployeeDetails(){
        return "show-emp-details-view";
    }*/

    /*@RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {

        //we point name of form field in "ask-emp-details-view.jsp"
        String empName = request.getParameter("employeeName");
        empName = "Mr. "+ empName;
        //model this is just container for any datas
        model.addAttribute("nameAttribute", empName);

        //i got parameter employeeSurname from "ask-emp-details-view.jsp"
        String empSurname = request.getParameter("employeeSurname");
        //next we save/add our data (surname) in model
        model.addAttribute("surnameAttribute", empSurname);

        model.addAttribute("infoAttribute", "- professional programmer");

        return "show-emp-details-view";*/

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp,
                                      BindingResult bindingResult)  {

        if(bindingResult.hasErrors()){
            return "ask-emp-details-view";
        }
        else {
            return "show-emp-details-view";
        }
    }
}
