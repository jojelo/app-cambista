package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity.UsuarioEntity;
import pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.repository.UsuarioRepository;
import pe.bk.appcambista.aplicacion.ports.out.UsuarioObtenerByEmailPort;
import pe.bk.appcambista.dominio.Rol;
import pe.bk.appcambista.dominio.Usuario;

import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class UsuarioAdapter implements UsuarioObtenerByEmailPort {
  private final UsuarioRepository usuarioRepository;

  @Override
  public Optional<Usuario> findByEmail(String email) {
    Optional<UsuarioEntity> usuarioEntity = usuarioRepository.findByEmail(email);
    return usuarioEntity.map(us -> Usuario.builder()
        .id(us.getId())
        .email(us.getEmail())
        .password(us.getPassword())
        .rols(us.getRolEntities()
            .stream().map(rol -> Rol.builder()
                .id(rol.getId()).name(rol.getName())
                .build())
            .collect(Collectors.toList())
        )
        .build());
  }
}
