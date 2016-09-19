package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class Test {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/getUsers")
    public ModelAndView getUsers() {
        ModelAndView modelAndView = new ModelAndView("getUsers.vm");

        testService.init();

        modelAndView.addObject("users", testService.getAll());
        return modelAndView;
    }


    @RequestMapping(value = "/")
    public ModelAndView amin() {
        return new ModelAndView("main.vm");
    }


    @RequestMapping(value = "/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("msg", "Some text");
        modelAndView.addObject("name", "Ann");
        return modelAndView;
    }

    @RequestMapping(value = "/user/info")
    public ModelAndView userInfo() {
        ModelAndView modelAndView = new ModelAndView("404.vm");
        User user = new User(1001, 100, new Date(), "Kiev");

         modelAndView.addObject("curUser", user);

        return modelAndView;
    }

    /*@RequestMapping(value = "/example")
    public void testMap() {
       /* ModelAndView modelAndView = new ModelAndView("test");

        View view = new View() {
            public String getContentType() {
                return null;
            }

            public void render(Map<String, ?> map, javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

            }
        };

        view.render();
    }*/

    public int example() {
        return 105;
    }
}
