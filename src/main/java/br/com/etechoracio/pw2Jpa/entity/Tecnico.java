package br.com.etechoracio.pw2Jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_TECNICO")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TECNICO")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "TX_AREA_FONE")
    private String area_fone;

    @Column(name = "TX_FONE")
    private String fone;

    @Column(name = "TX_TIPO_FONE")
    private String tipo_fone;

    @Column(name = "TX_EMAIL")
    private String email;
}
