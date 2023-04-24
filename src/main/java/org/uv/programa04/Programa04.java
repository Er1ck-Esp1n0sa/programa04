/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

/**
 *
 * @author erck
 */
public class Programa04 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        DAOEmpleado dAOEmpleado=new DAOEmpleado(); 
        Empleado emp=new Empleado();
        emp.setClave(10);
        emp.setNombre("Gabriel"); 
        emp.setDireccion("av1");
        emp.setTelefono ("11111");
        dAOEmpleado.create(emp);
    }
}
