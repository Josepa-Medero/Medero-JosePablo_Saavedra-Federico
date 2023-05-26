package com.backendParcial.service;

import com.backendParcial.dao.IDao;
import com.backendParcial.dao.impl.OdontologoDaoH2;
import com.backendParcial.entity.Odontologo;
import com.backendParcial.service.OdontologoService;

import java.sql.Connection;

public class OdontologoServiceTest {

    private static Connection connection = null;
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2() {
    });

public void  deberiaListarOdontologo(){
    Odontologo odo1 = new Odontologo(1234,"Juan", "Perez");
    Odontologo odo2 = new Odontologo(5678,"Juana", "Lopez");

    odontologoService.guardarOdontologo(odo1);
}
}
