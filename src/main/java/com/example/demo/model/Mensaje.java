package com.example.demo.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="mensaje")
@ToString @EqualsAndHashCode
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="mensajeid")
    private Long mensajeid;
    @Getter @Setter @Column(name="id")
    private Long id;
    @Getter @Setter @Column(name="mensaje")
    private String mensaje;
    @Getter @Setter @Column(name="publicador")
    private String publicador;

}
