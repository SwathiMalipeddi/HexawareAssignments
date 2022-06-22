package com.spring.jpa.controller;


import com.spring.jpa.data.Mobile;
import com.spring.jpa.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @PostMapping("/saveMobile")
    private Mobile saveMobile(@RequestBody Mobile mobile){
       return mobileService.createMobile(mobile);
    }

    @GetMapping("/getMobiles")
    public List<Mobile> getMobiles(){
       return mobileService.getMobiles();
    }

    @GetMapping("/getMobileName/{name}")
    public Mobile getMobileByName(@PathParam("name") String mobileName){
        return mobileService.getMobileByName(mobileName);
    }


}
