package com.example.labAndroid_Amr_Waseem.Services;

import com.example.labAndroid_Amr_Waseem.Model.RentingAgency;
import com.example.labAndroid_Amr_Waseem.Model.Tenant;
import com.example.labAndroid_Amr_Waseem.Repositries.RentingAgencyRep;
import com.example.labAndroid_Amr_Waseem.Repositries.TenantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

    @Autowired
    TenantRep repTenant;

    public void registerTenant(Tenant h)  {
        repTenant.save(h);
    }

}
