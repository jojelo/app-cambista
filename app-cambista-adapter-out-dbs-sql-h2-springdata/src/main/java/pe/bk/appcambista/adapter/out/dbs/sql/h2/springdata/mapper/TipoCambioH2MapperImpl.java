package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.mapper;

import org.springframework.stereotype.Component;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity.TipoCambioEntity;
import pe.bk.appcambista.dominio.TipoCambio;

@Component
public class TipoCambioH2MapperImpl implements TipoCambioH2Mapper {
  @Override
  public TipoCambio returnTipoCambio(TipoCambioEntity tipoCambioEntity) {
    return TipoCambio.builder()
      .id(tipoCambioEntity.getId())
      .monto(tipoCambioEntity.getMonto())
      .monedaOrigen(tipoCambioEntity.getMonedaOrigen())
      .monedaDestino(tipoCambioEntity.getMonedaDestino())
      .factor(tipoCambioEntity.getFactor())
      .build();
  }
}
