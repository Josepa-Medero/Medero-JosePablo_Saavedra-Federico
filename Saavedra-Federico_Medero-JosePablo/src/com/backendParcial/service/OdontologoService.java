package com.backendParcial.service;


import com.backendParcial.dao.IDao;
import com.backendParcial.entity.Odontologo;
import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao){this.odontologoIDao = odontologoIDao;}

    public Odontologo guardarOdontologo(Odontologo odontologo) { return odontologoIDao.guardar(odontologo);}

    public List<Odontologo> listarOdontologo() { return odontologoIDao.listarTodos();}


}



