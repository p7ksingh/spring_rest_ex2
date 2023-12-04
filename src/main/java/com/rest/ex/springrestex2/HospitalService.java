package com.rest.ex.springrestex2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    List<Hospital> hospitalList = new ArrayList<Hospital>(List.of(new Hospital(101, "AIIMS", "Delhi", 5.0),
            new Hospital(102, "PMCH", "Bihar", 3.0), new Hospital(103, "KMCH", "Kerla", 3.5)));

    public List<Hospital> getHospitalLists() {
        return hospitalList;
    }

    public boolean saveHospital(Hospital hospital) {

        return hospitalList.add(hospital);
    }

    public boolean saveHospitalList(List<Hospital> hospitalLists) {
       return hospitalList.addAll(hospitalList);
    }

}
