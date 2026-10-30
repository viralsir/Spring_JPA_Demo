package org.arham.spring_jpa_demo.service;

import org.arham.spring_jpa_demo.model.Standard;
import org.arham.spring_jpa_demo.repo.StandardRepo;
import org.arham.spring_jpa_demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StandardService
{
    @Autowired
    StandardRepo standardRepo;

    @Autowired
    StudentService studentService;

    public String addStandard(Standard std)
    {
         standardRepo.save(std);
         return "New Standard Added Successfully";
    }

    public List<Standard> viewStandard(){
        return standardRepo.findAll();
    }



    public Standard viewStandardById(int std)
    {
        return standardRepo.findByStd(std);
    }

}

