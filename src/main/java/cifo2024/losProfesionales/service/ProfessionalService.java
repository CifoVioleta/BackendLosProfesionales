package cifo2024.losProfesionales.service;

import cifo2024.losProfesionales.model.Employer;
import cifo2024.losProfesionales.model.Professional;
import cifo2024.losProfesionales.repository.ProfessionalRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Locale;
import java.util.UUID;

@Service
public class ProfessionalService {
    @Autowired
    ProfessionalRepository professionalRepository;

    public Iterable<Professional> getAllProfessionals(){
        return professionalRepository.findAll();
    }

    public void populate() {

        // locale in español
        Faker faker = new Faker(new Locale("es-ES"));

        String uniqueID;

        for (int i = 0; i < 8; i++) {
            Instant instant = Instant.now();
            long timeStampMillis = instant.toEpochMilli();


            uniqueID = UUID.randomUUID().toString();
            professionalRepository.save(
                    //creamos un nuevo Profesional
                    new Professional(uniqueID,
                            timeStampMillis,
                            faker.name().firstName(),
                            faker.dune().toString(),
                            faker.number().digits(6),
                            faker.number().toString(),
                            faker.funnyName().toString())
            );

        }

    }
}
