package pe.bk.appcambista.aplicacion.ports.out;

import pe.bk.appcambista.dominio.TipoCambio;

@FunctionalInterface
public interface TipoCambioActualizarPort {
  boolean actualizar(TipoCambio tipoCambio);
}
