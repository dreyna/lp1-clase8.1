/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.clase8.daoImpl;

import pe.edu.upeu.clase8.dao.IUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.upeu.clase8.config.Conexion;
/**
 *
 * @author docente.fia
 */
public class UsuarioDaoImpl implements IUsuario{
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    @Override
    public int validar(String correo, String clave) {
         String SQL = "SELECT *FROM usuario WHERE correo=? and clave=?";
         int x = 0;
         try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while(rs.next()){
                x = 1;
            }
        } catch (SQLException e) {
             System.out.println("Error: "+e);
        }
         return x;
    }
    
}
