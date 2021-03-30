package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.controllers;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.model.Users;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String get(@RequestParam(value="filter", required=false) String filter,Model model) {
        List<Users> users;
        if(filter != null && !filter.equals("")){
            System.out.println("." + filter + ".");
            users = userService.findUsersByName(filter);
        }else{
            users = userService.findAll();
        }
        //List<Users> users = userService.findAll();
        for(Users user : users){
            System.out.println(user);
        }
        model.addAttribute("list_items", users);
        return "welcome";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.GET)
    public String add(Model model) {
        return "fill_table";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.POST)
    public String post(@RequestParam("number") Long number,
                       @RequestParam("name") String name,
                       @RequestParam("familyname") String familyname,
                       @RequestParam("age") Integer age,
                       @RequestParam("email") String email,
                       Model model) {
        Users data = new Users();
        data.setId(number);
        data.setName(name);
        data.setfName(familyname);
        data.setAge(age);
        data.setEmail(email);
        System.out.println(data);
        userService.create(data);
       return get("", model);
    }

    @RequestMapping(value = {"/update"}, method = RequestMethod.GET)
    public String updateGet(@RequestParam("number") String number,
                         @RequestParam("name") String name,
                         @RequestParam("familyname") String familyname,
                         @RequestParam("age") String age,
                         @RequestParam("email") String email,
                         Model model) {
        Users data = new Users();
        data.setId(Long.parseLong(number.substring(0, number.length()-1)));
        data.setName(name);
        data.setfName(familyname);
        data.setAge(Integer.parseInt(age.substring(0, age.length()-1)));
        data.setEmail(email);
        model.addAttribute("data", data);
        //userService.update(data);
        return "update";
    }

    @RequestMapping(value = {"/update"}, method = RequestMethod.POST)
    public String update(@RequestParam("number") String number,
                      @RequestParam("name") String name,
                      @RequestParam("familyname") String familyname,
                      @RequestParam("age") String age,
                      @RequestParam("email") String email,
                      Model model) {
        Users data = new Users();
        Long id = Long.parseLong(number);
        Integer a = Integer.parseInt(age);
        data.setId(id);
        data.setName(name);
        data.setfName(familyname);
        data.setAge(a);
        data.setEmail(email);
        userService.update(data);
        return get("", model);
    }

    @RequestMapping(value = {"/delete"}, method = RequestMethod.GET)
    public String delete(@RequestParam("number") String number, Model model) {
        number = number.substring(0, number.length()-1);
        userService.delete(Long.parseLong(number));
        return get("", model);
    }


}
