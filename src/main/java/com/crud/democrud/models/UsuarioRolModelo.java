package com.crud.democrud.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UsuarioRolModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long Idrol;
    private Long IdUsuario;
    private String Rol;

    public Long getIdrol() {
        return Idrol;
    }

    public void setIdrol(Long idrol) {
        Idrol = idrol;
    }

    public Long getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public UsuarioRolModelo(Long Idrol, Long IdUsuario, String rol) {
        this.Idrol = Idrol;
        this.IdUsuario = IdUsuario;
        this.Rol = Rol;
    }

    public UsuarioRolModelo() {

    }
}
