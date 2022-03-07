package com.example.labAndroid_Amr_Waseem.Repositries;

import com.example.labAndroid_Amr_Waseem.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRep extends JpaRepository <Tenant,Long> {
    Tenant findTenantByEmail(String Email);
}
