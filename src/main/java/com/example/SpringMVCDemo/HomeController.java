package com.example.SpringMVCDemo;


import com.example.SpringMVCDemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlienRepo repo;
    @ModelAttribute
    public void modelData(Model model){
        model.addAttribute("name","Lovepreet Singh");
    }
    @RequestMapping("/")
    public String home(){
        return "index";
    }

//    @PostMapping("add")
//    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model model ){
//        int num3 = i+j;
//        model.addAttribute("num3",num3);
//    return "add";
//    }
    @GetMapping("getAliens")
    public String getAlien(@RequestParam int id ,Model model){
        System.out.println("bedugdjebjfhe");
//        List<Alien> alien = Arrays.asList(new Alien(101,"Love"), new Alien(102,"Preet"));
        model.addAttribute("result",repo.findById(id));
        return "showAliens";
    }

    @GetMapping("getAliensByName")
    public String getAlienByName(@RequestParam String name ,Model model){
        model.addAttribute("result",repo.findByName(name));
        return "showAliens";
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien ){
        repo.save(alien);
    return "add";
    }
}
