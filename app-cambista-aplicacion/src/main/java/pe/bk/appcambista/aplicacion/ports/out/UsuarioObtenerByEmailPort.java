package pe.bk.appcambista.aplicacion.ports.out;

import pe.bk.appcambista.dominio.Usuario;

import java.util.Optional;

@FunctionalInterface
public interface UsuarioObtenerByEmailPort {
  Optional<Usuario> findByEmail(String email);
}
