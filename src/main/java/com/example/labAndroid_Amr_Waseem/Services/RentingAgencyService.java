package com.example.labAndroid_Amr_Waseem.Services;

import com.example.labAndroid_Amr_Waseem.Model.House;
import com.example.labAndroid_Amr_Waseem.Model.RentingAgency;
import com.example.labAndroid_Amr_Waseem.Repositries.HouseRep;
import com.example.labAndroid_Amr_Waseem.Repositries.RentingAgencyRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentingAgencyService {
    @Autowired
    RentingAgencyRep rentingAgencyRep;
    public void registerAgency(RentingAgency h)  {

        rentingAgencyRep.save(h);

    }
}
