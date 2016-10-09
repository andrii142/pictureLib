package com.artemon;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Artemon on 09.10.2016.
 */

@Controller
public class TestController {

    @RequestMapping(value = "/showAdEntities")
    public ModelAndView test() {

        ModelAndView modelAndView = new ModelAndView("artemon/ArtView.vm");
        List<AdEntity> adEntities = new ArrayList<>();
        adEntities.add(new AdEntity(1, "Kiev", "asd", new Date(), 100));
        adEntities.add(new AdEntity(2, "London", "asd", new Date(), 200));
        adEntities.add(new AdEntity(3, "Baku", "asd", new Date(), 300));
        adEntities.add(new AdEntity(4, "Moscow", "asd", new Date(), 400));
        adEntities.add(new AdEntity(5, "Boston", "asd", new Date(), 500));
        modelAndView.addObject("adEntities", adEntities);
        return modelAndView;
    }
}
