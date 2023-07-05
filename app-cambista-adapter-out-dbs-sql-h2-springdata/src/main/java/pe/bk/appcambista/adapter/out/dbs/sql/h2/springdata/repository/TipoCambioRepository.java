package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity.TipoCambioEntity;
import pe.bk.appcambista.dominio.TipoCambio;

import java.util.Optional;

public interface TipoCambioRepository extends JpaRepository<TipoCambioEntity, Long> {

  Optional<TipoCambioEntity> findByMonedaOrigenAndMonedaDestino(String monedaOrigen,
                                                                String monedaDestino);

}
