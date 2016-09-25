package com.dima_b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Lil Wayne on 25.09.2016.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/showAdEntities")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("dima_bTest");
        modelAndView.addObject(new AdEntity(1, "Kharokv", "1", new Date(), 10) );
        modelAndView.addObject(new AdEntity(2, "Poltava", "2", new Date(), 20) );
        modelAndView.addObject(new AdEntity(3, "Odessa", "3", new Date(), 30) );
        modelAndView.addObject(new AdEntity(4, "Kiev", "4", new Date(), 40) );
        modelAndView.addObject(new AdEntity(5, "Rivne", "5", new Date(), 50) );
        return modelAndView;
    }

}
