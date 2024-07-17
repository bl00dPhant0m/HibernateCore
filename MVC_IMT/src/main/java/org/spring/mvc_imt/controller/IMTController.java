package org.spring.mvc_imt.controller;

import org.spring.mvc_imt.service.IMTService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IMTController {
    private IMTService imtService;

    public IMTController(IMTService imtService) {
        this.imtService = imtService;
    }

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public String indexPost(
            Model model,
            @RequestParam int height,
            @RequestParam String weight
    ) {
        Double weightDouble = Double.valueOf(weight);
        double IMT = imtService.calculateBMI(height, weightDouble);
        String IMTinfo = imtService.info(IMT);
        String sentInfo = "Ваш индекс массы тела : " + IMT + ". " + IMTinfo;



        model.addAttribute("message", sentInfo);
        return "result_imt";
    }
}
