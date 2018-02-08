package org.uGrow.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.uGrow.models.data.FruitDao;

import java.util.ArrayList;

@Controller
@RequestMapping("fruit")
public class FruitController {

    @Autowired
    private FruitDao fruitDao;

    // Request path: /fruit
    @RequestMapping(value = "")
    public String index(Model model) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");

        model.addAttribute("fruits", fruitDao.findAll());

        model.addAttribute("title", "My Fruits");

        return "fruit/index";
    }


}
