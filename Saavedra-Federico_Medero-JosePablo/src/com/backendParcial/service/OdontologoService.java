package com.backendParcial.service;


import com.backendParcial.dao.IDao;
import com.backendParcial.entity.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoService implements IDao {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao){this.odontologoIDao = odontologoIDao;}

    public Odontologo guardarOdontologo(Odontologo odontologo) { return odontologoIDao.guardar(odontologo);}

    public Odontologo listarOdontologo(Odontologo odontologo) { return odontologoIDao.listar(odontologo);}



    //CONSIGNA 2:

    private List<Odontologo> odontologos;

    public void IDao() {
        odontologos = new ArrayList<>();
    }

    @Override
    public void guardarOdontologos(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologos;
    }


    //METODOS DE IDAO

    @Override
    public Object guardar(Object odontologo) {
        return null;
    }
    @Override
    public Object listar(Object odontologo) {
        return null;
    }
    @Override
    public List listarTodos() {
        return null;
    }
}

