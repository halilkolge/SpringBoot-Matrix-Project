package com.volthread.matrix.controller;

import com.volthread.matrix.response.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@RestController
@RequestMapping(value = "/")
public class HomeController {


    @GetMapping(value = {"/", "/getvalue"})
    public ModelAndView view(Model model, @RequestParam(defaultValue = "0") int m, @RequestParam(defaultValue = "0") int n) {
        ModelAndView mav = new ModelAndView("Matris");
        Result result = new Result();
        Random random = new Random();

        if (m != 0) {
            result.setN(n);
            result.setM(m);
            model.addAttribute("data", result);
        } else {
            model.addAttribute("data", new Result());
        }


        return mav;
    }

}
