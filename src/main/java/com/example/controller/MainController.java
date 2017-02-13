package com.example.controller;

import com.example.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangChaohui on 13/02/2017.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/personList", method = RequestMethod.GET)
    public ModelAndView personList() {
        List<Person> personList = getPeople();
        ModelAndView mv = new ModelAndView("personList");
        mv.addObject("personList", personList);
        return mv;
    }

    @RequestMapping(value = "/person.do", method = RequestMethod.GET)
    public String personList2(Model model) {
        model.addAttribute("personList", getPeople());
        return "personList";
    }

    @RequestMapping(value = "/personList.do", method = RequestMethod.GET)
    public ModelAndView getPersonList(HttpServletRequest request,
                                      HttpServletResponse response,
                                      ModelMap modelMap) {

        modelMap.put("personList", getPeople());
        modelMap.put("zzz", "zzz222");
        return new ModelAndView("personList");
    }


    @RequestMapping(value = "/person/update.action")
    public ModelAndView getMonitorIndex(HttpServletRequest request,
                                        HttpServletResponse response,
                                        ModelMap modelMap,
                                        @RequestParam("id") Integer id) {

        modelMap.put("zzz", id);
        return new ModelAndView("personList");
    }

    private List<Person> getPeople() {
        List<Person> personList = new ArrayList<Person>();
        Person person = new Person();
        person.setId(1);
        person.setAge(33);
        person.setName("hhhhh");
        personList.add(person);
        return personList;
    }
}
