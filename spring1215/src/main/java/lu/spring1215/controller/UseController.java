package lu.spring1215.controller;

import lu.spring1215.service.UseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UseController {
    @Autowired
    public UseServiceImp useServiceImp;

    @RequestMapping(value = "/all")
    public String all(){
        return useServiceImp.service_use();
    }

    @RequestMapping(value = "avgAge")
    public Double avgAge(String city){
        return useServiceImp.service_useCity(city);
    }
}
