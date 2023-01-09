package med.voll.api.repositorys;

import med.voll.api.domain.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {


}
