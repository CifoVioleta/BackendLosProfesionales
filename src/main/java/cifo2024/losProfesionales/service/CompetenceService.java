package cifo2024.losProfesionales.service;

import cifo2024.losProfesionales.model.Competence;
import cifo2024.losProfesionales.repository.CompetenceRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Locale;
import java.util.UUID;

@Service
public class CompetenceService {

    @Autowired
    CompetenceRepository competenceRepository;

    public Iterable<Competence> getAllCompetences(){
        return competenceRepository.findAll();
    }


    public void populate() {

        // locale in english
        Faker faker = new Faker(new Locale("es-ES"));
        String[] typeOfCompetence = {"FrontEnd","BackEnd", "DevOps"} ;

        // ref variable creation UUID
        String uniqueID;

        for (int i = 0; i < 4; i++) {
            Instant instant = Instant.now();
            long timeStampMillis = instant.toEpochMilli();


            uniqueID = UUID.randomUUID().toString();
            competenceRepository.save(
                    new Competence(uniqueID,
                            timeStampMillis,
                            faker.gameOfThrones().character(),
                            faker.lorem().paragraph(),
                            typeOfCompetence[ faker.number().numberBetween(0, 2)]));

        }

    }
}