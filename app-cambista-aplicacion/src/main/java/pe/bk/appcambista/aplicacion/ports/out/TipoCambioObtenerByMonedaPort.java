package pe.bk.appcambista.aplicacion.ports.out;

import pe.bk.appcambista.dominio.TipoCambio;

@FunctionalInterface
public interface TipoCambioObtenerByMonedaPort {
  TipoCambio obtenerByMoneda(String monedaOrigen, String monedaDestino);
}
