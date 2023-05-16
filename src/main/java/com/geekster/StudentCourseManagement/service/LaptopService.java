package com.geekster.StudentCourseManagement.service;

import com.geekster.StudentCourseManagement.models.Laptop;
import com.geekster.StudentCourseManagement.repository.ILaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LaptopService {
    @Autowired
    ILaptopRepository laptopRepository;


    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Optional<Laptop> getLaptopById(Long laptopId) {
        return laptopRepository.findById(laptopId);
    }

    public Laptop updateLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public void deleteLaptop(Long laptopId) {
        laptopRepository.deleteById(laptopId);
    }
}
