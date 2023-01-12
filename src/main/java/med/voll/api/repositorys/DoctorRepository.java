package med.voll.api.repositorys;

import med.voll.api.domain.DoctorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {


    Page<DoctorEntity> findAllByActiveTrue(Pageable pagination);
}
