/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {
    
    @Override
    public Empleado create(Empleado p) {
        ConexionDB cx=ConexionDB.getInstance();
        TransaccionDB tdb= new TransaccionDB<Empleado>(p) {
            @Override
            public boolean execute(Connection con) {
                try{
                String sql="insert into empleados(clave, nombre, direccion,"
                 +"telefono) values (?,?,?,?)";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setLong(1, p.getClave());
                pst.setString(2, p.getNombre());
                pst.setString(3, p.getDireccion());
                pst.setString(4, p.getTelefono());
                pst.execute();
                return true;
            } catch (SQLException ex){
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.SEVERE,null, ex);
             return false;
            }
        }
    };
    boolean res= cx.execute(tdb);
    if(res)
        Logger.getLogger(Programa04.class.getName()).log(Level.INFO, "Se guardo");
    else
        Logger.getLogger(DAOEmpleado.class.getName()).log(Level.INFO, "Error...");

    return null;
 }

    /*@Override
    public boolean delete(Long id) {
        ConexionDB cx=ConexionDB.getInstance();
        TransaccionDB tdb= new TransaccionDB<Empleado>(p) {
            @Override
            public boolean execute(Connection con) {
                try{
                String sql = "Delete from empleados where n_serie= " 
                        +tablalumnos.getValueAt(filaseleccionada, 0);
            Statement st =con.createStatement();

                pst.setLong(1, p.getClave());
                pst.setString(2, p.getNombre());
                pst.setString(3, p.getDireccion());
                pst.setString(4, p.getTelefono());
                pst.execute();
                return true;
            } catch (SQLException ex){
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.SEVERE,null, ex);
             return false;
            }
        }
    };
        return true;
    }*/

    @Override
    public Empleado update(Empleado p, Long id) {
        return null;
    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public Empleado findById(Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
