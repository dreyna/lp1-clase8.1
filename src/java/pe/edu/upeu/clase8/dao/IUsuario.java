/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.clase8.dao;

import pe.edu.upeu.clase8.entity.Usuario;

/**
 *
 * @author docente.fia
 */
public interface IUsuario {
    int validar(String correo, String clave);
}
