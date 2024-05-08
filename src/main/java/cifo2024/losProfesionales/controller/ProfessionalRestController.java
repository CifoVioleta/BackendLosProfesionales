package cifo2024.losProfesionales.controller;

import cifo2024.losProfesionales.model.Professional;
import cifo2024.losProfesionales.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/")
public class ProfessionalRestController {
    @Autowired
    ProfessionalRepository professionalRepository;

    //CRUD: Read
    @RequestMapping("/Professionals")
    public Iterable<Professional> getAllUsers(){
        return professionalRepository.findAll();
    }
}
