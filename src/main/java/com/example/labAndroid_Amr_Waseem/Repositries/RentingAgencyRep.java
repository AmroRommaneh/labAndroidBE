package com.example.labAndroid_Amr_Waseem.Repositries;

import com.example.labAndroid_Amr_Waseem.Model.RentingAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentingAgencyRep extends JpaRepository<RentingAgency,Long> {
}
