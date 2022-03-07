package com.example.labAndroid_Amr_Waseem.Services;

import com.example.labAndroid_Amr_Waseem.Model.House;
import com.example.labAndroid_Amr_Waseem.Repositries.HouseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;
@Service
public class HouseServices {
    @Autowired
HouseRep houseRep;
    public void registerHouse(House h)  {

        houseRep.save(h);

    }
}
