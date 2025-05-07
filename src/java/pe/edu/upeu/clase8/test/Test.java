package pe.edu.upeu.clase8.test;

import pe.edu.upeu.clase8.config.Conexion;
import pe.edu.upeu.clase8.dao.IUsuario;
import pe.edu.upeu.clase8.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author docente.fia
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("Hay conexion");
        }else{
            System.out.println("No hay conexion");
        }
        IUsuario iusu = new UsuarioDaoImpl();
        System.out.println(iusu.validar("davidreynabarreto@gmail.com", "1234567"));
    }
    
}
