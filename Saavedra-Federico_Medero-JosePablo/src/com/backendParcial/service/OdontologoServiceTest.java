package com.backendParcial.service;


import com.backendParcial.dao.impl.OdontologoDaoH2;
import com.backendParcial.entity.Odontologo;
import org.junit.Test;
import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OdontologoServiceTest {

    private static Connection connection = null;
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2() {
    });

    @Test
    public void  deberiaListarOdontologo(){
    Odontologo odo1 = new Odontologo(1234,"Juan", "Perez");
    Odontologo odo2 = new Odontologo(5678,"Juana", "Lopez");

    List<Odontologo> odonTest = odontologoService.listarOdontologo();
    assertFalse(odonTest.isEmpty());
    assertTrue(odonTest.size() >= 2);

}
}
