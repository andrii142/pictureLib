package com.asya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Asenka on 18.09.16.
 */

@Controller
public class TestController {

    @RequestMapping(value = "/showAdEntities")
    public ModelAndView showAdEntities() {
        ModelAndView modelAndView = new ModelAndView("users.vm");

        List<AdEntity> adEntities = createAdEntities();

        modelAndView.addObject("adEntities", adEntities);

        return modelAndView;
    }


    private List<AdEntity> createAdEntities() {

        List<AdEntity> adEntities = new ArrayList<AdEntity>();
        adEntities.add(new AdEntity(1001, "Kiev", "whatIsIt", new Date(), 100));
        adEntities.add(new AdEntity(1002, "NY", "whatIsIt", new Date(), 200));
        adEntities.add(new AdEntity(1003, "LA", "whatIsIt", new Date(), 300));
        adEntities.add(new AdEntity(1004, "Dnepr", "whatIsIt", new Date(), 400));
        adEntities.add(new AdEntity(1005, "Boston", "whatIsIt", new Date(), 500));

        return adEntities;
    }
}
