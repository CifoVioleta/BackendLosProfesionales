package cifo2024.losProfesionales.repository;

import cifo2024.losProfesionales.model.Competence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenceRepository extends CrudRepository<Competence, String> { }
