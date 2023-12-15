package com.corenetworks.presentacion;

import com.corenetworks.modelo.Socio;
import com.corenetworks.persistencia.AccesoSocios;

import java.sql.SQLException;

public class ProbarSocios {

    public static void main(String[] args) {
        AccesoSocios as = new AccesoSocios();
        Socio s = new Socio("1234567A","123456");
        try {
            System.out.println("Se ha insertado el socio ? " + as.alta(s));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
