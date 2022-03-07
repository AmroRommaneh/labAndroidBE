package com.example.labAndroid_Amr_Waseem.Controllers;

import com.example.labAndroid_Amr_Waseem.DTO.HouseDto;
import com.example.labAndroid_Amr_Waseem.DTO.TenantDto;
import com.example.labAndroid_Amr_Waseem.Model.House;
import com.example.labAndroid_Amr_Waseem.Repositries.HouseRep;
import com.example.labAndroid_Amr_Waseem.Services.HouseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("api/House")
@Controller
public class HouseController {
    @Autowired
HouseServices houseServices;
    @Autowired
    HouseRep houseRep;
    @PostMapping(path = "/saveHouse")
    public ResponseEntity<String> registerHouse(@RequestBody HouseDto houseDto) {
        System.out.println("reached1");
        House house = new House();
        house.setAge(houseDto.getAge());
        house.setBalcony(houseDto.isBalcony());
        house.setCity(houseDto.getCity());
        house.setGarden(houseDto.isGarden());
        house.setParking(houseDto.isParking());
        house.setPrice(houseDto.getPrice());
        house.setNumberOfRooms(houseDto.getNumberOfRooms());
        house.setSize(houseDto.getSize());
        house.setStatus(houseDto.getStatus());
        houseServices.registerHouse(house);
        return new ResponseEntity<>("tmam",HttpStatus.OK);
    }

    @GetMapping(path = "/getTop5")
    public ResponseEntity<List<House>> getTopFive (){

        return new ResponseEntity<>(houseRep.findAll(), HttpStatus.OK);
    }

    @PostMapping(path  ="/searchForProperty")
    public ResponseEntity<List<House>> search (@PathVariable HouseDto houseDto){



        return new ResponseEntity<>(houseRep.findAll(), HttpStatus.OK);

    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<House>> getAll (){
System.out.println("reached get ");
        return new ResponseEntity<>(houseRep.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/test")
    public ResponseEntity<String> test (){
        System.out.println("reached get ");
        return new ResponseEntity<>("weeeeen", HttpStatus.OK);
    }








}
