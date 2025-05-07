/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.clase8.entity;

/**
 *
 * @author docente.fia
 */
public class Usuario {
    private int codigo;
    private String nombres;
    private String correo;
    private String password;

    public Usuario() {
    }

    public Usuario(int codigo, String nombres, String correo, String password) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.correo = correo;
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
