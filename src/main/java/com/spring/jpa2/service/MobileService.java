package com.spring.jpa2.service;


import com.spring.jpa2.data.Mobile;
import com.spring.jpa2.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MobileService {

    @Autowired
    private MobileRepository mobileRepository;

    @Transactional
    public Mobile createMobile(Mobile mobile){
        return mobileRepository.save(mobile);
    }



    public List<Mobile> getMobiles(){
        return mobileRepository.findAll();
    }

   public Mobile getMobileByName(String mobileName){
        return mobileRepository.findByMobileName(mobileName);
    }
}
