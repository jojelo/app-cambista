package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity.TipoCambioEntity;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.mapper.TipoCambioH2Mapper;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.repository.TipoCambioRepository;
import pe.bk.appcambista.aplicacion.ports.out.TipoCambioActualizarPort;
import pe.bk.appcambista.aplicacion.ports.out.TipoCambioObtenerByMonedaPort;
import pe.bk.appcambista.dominio.TipoCambio;

@RequiredArgsConstructor
public class TipoCambioAdapter implements TipoCambioActualizarPort,
  TipoCambioObtenerByMonedaPort {

  private final TipoCambioRepository tipoCambioRepository;
  private final TipoCambioH2Mapper tipoCambioMapper;

  @Override
  public boolean actualizar(TipoCambio tipoCambio) {
    TipoCambioEntity tipoCambioEntity = tipoCambioRepository
      .findById(tipoCambio.getId()).orElseThrow();
    tipoCambioEntity.setMonto(tipoCambio.getMonto());
    tipoCambioRepository.save(tipoCambioEntity);
    return true;
  }


  @Override
  public TipoCambio obtenerByMoneda(String monedaOrigen, String monedaDestino) {
    TipoCambioEntity tipoCambioEntity =  tipoCambioRepository
      .findByMonedaOrigenAndMonedaDestino(monedaOrigen.toLowerCase(), monedaDestino.toLowerCase()).orElseThrow();
    return tipoCambioMapper.returnTipoCambio(tipoCambioEntity);
  }
}
