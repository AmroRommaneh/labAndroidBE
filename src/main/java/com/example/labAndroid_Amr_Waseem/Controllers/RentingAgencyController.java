package com.example.labAndroid_Amr_Waseem.Controllers;

import com.example.labAndroid_Amr_Waseem.DTO.HouseDto;
import com.example.labAndroid_Amr_Waseem.DTO.RentingAgencyDto;
import com.example.labAndroid_Amr_Waseem.Model.House;
import com.example.labAndroid_Amr_Waseem.Model.RentingAgency;
import com.example.labAndroid_Amr_Waseem.Services.HouseServices;
import com.example.labAndroid_Amr_Waseem.Services.RentingAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/Agency")
@Controller
public class RentingAgencyController {
    @Autowired
    RentingAgencyService rentingAgencyService ;
    @PostMapping(path = "/saveAgency")
    public ResponseEntity<String> registerAgency(@RequestBody RentingAgencyDto rentingAgencyDto) {
        System.out.println("reached1");
        RentingAgency rentingAgency=new RentingAgency();
        rentingAgency.setAgency_name(rentingAgencyDto.getAgency_name());
        rentingAgency.setCity(rentingAgencyDto.getCity());
        rentingAgency.setCountry(rentingAgencyDto.getCountry());
        rentingAgency.setPassword(rentingAgencyDto.getPassword());
        rentingAgency.setPhone(rentingAgencyDto.getPhone());

        rentingAgencyService.registerAgency(rentingAgency);

        return new ResponseEntity<>("tmam", HttpStatus.OK);
    }
}
