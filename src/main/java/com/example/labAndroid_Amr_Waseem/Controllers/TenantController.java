package com.example.labAndroid_Amr_Waseem.Controllers;

import com.example.labAndroid_Amr_Waseem.DTO.HouseDto;
import com.example.labAndroid_Amr_Waseem.DTO.TenantDto;
import com.example.labAndroid_Amr_Waseem.Model.House;
import com.example.labAndroid_Amr_Waseem.Model.Tenant;
import com.example.labAndroid_Amr_Waseem.Repositries.TenantRep;
import com.example.labAndroid_Amr_Waseem.Services.HouseServices;
import com.example.labAndroid_Amr_Waseem.Services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/Tenant")
public class TenantController {
    @Autowired
    TenantService tenantService;
    @Autowired
    TenantRep repTenant;
    @PostMapping(path = "/saveTenant")
    public ResponseEntity<String> registerTenat(@RequestBody TenantDto tenantDto) {
        System.out.println("reached1");
        Tenant tenant = new Tenant();
        tenant.setCity(tenantDto.getCity());
        tenant.setCRC(tenantDto.getCRC());
        tenant.setEmail(tenant.getEmail());
        tenant.setFamilySize(tenant.getFamilySize());
        tenant.setGender(tenantDto.getGender());
        tenant.setGMS(tenantDto.getGMS());
        tenant.setNationality(tenantDto.getNationality());
        tenant.setOccupation(tenant.getOccupation());
        tenant.setSecond_name(tenantDto.getSecond_name());
        tenant.setPassword(tenantDto.getPassword());


        tenantService.registerTenant(tenant);

        return new ResponseEntity<>("tmam", HttpStatus.OK);
    }


    @PutMapping(path = "/upadate")
    public ResponseEntity<String> update(@RequestBody TenantDto tenatDto) {
        Tenant tenant = repTenant.findTenantByEmail(tenatDto.getEmail());
        tenant.setPhone(tenatDto.getPhone());
        tenant.setPassword(tenatDto.getPassword());
        tenant.setSecond_name(tenatDto.getSecond_name());
        tenant.setFirst_name(tenatDto.getFirst_name());
        repTenant.save(tenant);
        return new ResponseEntity<>("updated", HttpStatus.OK);
    }

}
