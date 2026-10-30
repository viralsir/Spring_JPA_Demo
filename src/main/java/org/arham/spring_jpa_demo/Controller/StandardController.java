package org.arham.spring_jpa_demo.Controller;

import org.arham.spring_jpa_demo.model.Standard;
import org.arham.spring_jpa_demo.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/standard")
public class StandardController
{

    @Autowired
    StandardService standardService;

    @PostMapping
    public String addStandard(@RequestBody Standard std){

        return standardService.addStandard(std);
    }

    @GetMapping
    public List<Standard> viewAllStandard()
    {
        return standardService.viewStandard();
    }


    @GetMapping("/{std}")
    public Standard viewStandardByID(@PathVariable int std){

        return standardService.viewStandardById(std);
    }

}
