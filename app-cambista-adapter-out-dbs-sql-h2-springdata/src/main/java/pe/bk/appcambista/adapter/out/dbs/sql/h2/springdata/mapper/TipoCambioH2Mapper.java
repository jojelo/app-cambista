package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.mapper;


import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity.TipoCambioEntity;
import pe.bk.appcambista.dominio.TipoCambio;

public interface TipoCambioH2Mapper {
  TipoCambio returnTipoCambio(TipoCambioEntity tipoCambioEntity);
}
