package com.example.labAndroid_Amr_Waseem.Repositries;

import com.example.labAndroid_Amr_Waseem.Model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public interface HouseRep extends JpaRepository<House,Long> {

}
