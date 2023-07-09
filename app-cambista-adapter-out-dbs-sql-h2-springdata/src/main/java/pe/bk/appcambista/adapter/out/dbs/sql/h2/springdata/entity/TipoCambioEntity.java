package pe.bk.appcambista.adapter.out.dbs.sql.h2.springdata.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TIPOCAMBIO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoCambioEntity {
  @Id
  @Column(name = "id")
  private Long id;
  private double monto;
  @Column(name = "moneda_origen")
  private String monedaOrigen;
  @Column(name = "moneda_destino")
  private String monedaDestino;
  private int factor;
}
