package com.church.Church_CSI.backend.service;


import com.church.Church_CSI.backend.model.UserDetails;
import com.church.Church_CSI.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CSIService {

    private UserRepository userRepository;
    public CSIService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }



    public void saveTheUserDetails(UserDetails user)
    {
        userRepository.save(user);
    }



}
