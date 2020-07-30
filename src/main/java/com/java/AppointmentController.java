package com.java;

import com.java.dao.AppointmentDAO;
import com.java.dao.DoctorDAOImpl;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;


@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    @PostMapping
    public String getAppointmentDates(@RequestParam String doc, @RequestParam String firstname, @RequestParam String lastname, Model model) {

        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);
        model.addAttribute("doctorID", doc);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.toString());

        return "appointments";
    }

    @PostMapping("/book")
    public String selectDateForDoctor(@RequestParam String apptDate, @RequestParam String doctorID,
                                      @RequestParam String firstname, @RequestParam String lastname, Model model) {
        AppointmentDAO ad = new AppointmentDAO();

        model.addAttribute("appt", ad.getDoctor(doctorID, apptDate));
        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);

        return "selection";
    }

    @GetMapping("/confirm")
    public String confirmBooking(@RequestParam String apptID,
                                 @RequestParam String timeSlot, Model model){
        model.addAttribute("message", "Your appointment has been successfully booked");

        AppointmentDAO ad = new AppointmentDAO();
        ad.setAppointment(apptID, timeSlot);

        return ("success");
    }

    //method that gets parameter as
}
