package cifo2024.losProfesionales.controller;

import cifo2024.losProfesionales.model.Competence;
import cifo2024.losProfesionales.service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/")
public class CompetenceRestController {
    @Autowired
    CompetenceService competenceService;

    //CRUD: Read
    @RequestMapping("/Competences")
    public Iterable<Competence> getAllCompetences(){
        return competenceService.getAllCompetences();
    }
}
