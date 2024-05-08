package cifo2024.losProfesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Professional {
    //propiedades del Usuario
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    //propiedades de profesional
    private String dniNif; // posible ID?
    private String companyName;

/* ----- relación con sus Competencias / servicios

 //Relación one to many con sus competencias/servicios disponibles a contratar
  @OneToMany(mappedBy = "professional", cascade = CascadeType.ALL)
  //Creamos la array list de Competencias que tendrá cada profesional
    private  List <Competence> professionalCompetencesList= new ArrayList<>();


    public void addCompetence(Competence competence) {
        this.getProfessionalCompetencesList().add(competence);
        //if (competence.getId() != null) competence.getId().getProfessionalCompetencesList().remove(competence);
        competence.setProfessional(this);
    }

  */
}
