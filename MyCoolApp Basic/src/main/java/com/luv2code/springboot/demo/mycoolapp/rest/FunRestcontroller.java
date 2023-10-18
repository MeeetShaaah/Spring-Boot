package com.luv2code.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestcontroller {
    // injecting properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachname;
    @Value("${team.name}")
    private String teamname;

    // expose new endpoint for "teaam info"
   @GetMapping("/teaminfo")
   public String getTeamInfo(){
    return "The name of the Coach is : "+coachname+"\n The name of the Team is :"+teamname;
   }

    // expose "/" that reaturns Hello World..... 
    @GetMapping ("/")
    public String sayHello(){
        return "Hello World....!";
    }

    // expose new endpoint for "/workout"
    @GetMapping ("/workout")
    public String Workout(){
        return "Run a hard 5k.....!!!";
    }

    // expose new endpoint for "/fortune" 
    @GetMapping ("/fortune")
    public String fortune(){
        return "Today is your lucky day";
    }
}


