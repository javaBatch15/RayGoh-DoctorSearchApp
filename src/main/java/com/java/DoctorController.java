package com.java;

import com.java.dao.DoctorDAOImpl;
import com.java.model.Doctor;
import com.java.model.DoctorSearchModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/home")
public class DoctorController {
//    static DoctorDAOImpl d;

    @GetMapping
    public String getAllDoctor(Model model) {
        DoctorDAOImpl d = new DoctorDAOImpl();

        model.addAttribute("doctorList", d.getAllDoctors());
        return "doctor";
    }

    @PostMapping("/addDoctor")
    public String addDoctor(@Valid Doctor doctor, BindingResult result, HttpServletRequest request, Model model){
        if(result.hasErrors()) {
            model.addAttribute("message", result.getAllErrors());
            return "doctor";
        }
        DoctorDAOImpl d = new DoctorDAOImpl();

        d.addDoctor(doctor);

        model.addAttribute("doctorList", d.getAllDoctors());
        return "doctor";
    }

    @PostMapping("/getDoctor")
    public String getDoctor(DoctorSearchModel doctorSearchModel, Model model){
        DoctorDAOImpl d = new DoctorDAOImpl();

        model.addAttribute("doctorList", d.getDoctor(doctorSearchModel));
        return "search";
    }

    @GetMapping("/getDoctor")
    public String getDoctor(){
        return "search";
    }
}
