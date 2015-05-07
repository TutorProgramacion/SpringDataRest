//
// Document   : Test
// Created on : 04/07/2015, 07:16:20 AM
// Author     : Carmelo
//
package tutor.programacion.springdatarest;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String email;
    private LocalDate fecha;

    public Usuario() {
    }

    public Usuario(String nombre, String email, LocalDate fecha) {
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
