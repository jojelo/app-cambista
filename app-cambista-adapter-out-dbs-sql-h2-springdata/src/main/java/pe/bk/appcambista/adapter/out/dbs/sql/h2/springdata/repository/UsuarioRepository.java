package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity.UsuarioEntity;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    Optional<UsuarioEntity> findByEmail(String email);
}
