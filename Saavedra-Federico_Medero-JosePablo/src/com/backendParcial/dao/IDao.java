package com.backendParcial.dao;

import com.backendParcial.entity.Odontologo;

import java.util.List;

    public interface IDao<T> {

        T guardar(T odontologo);

        T listar(T odontologo);

            List<T> listarTodos();

        Odontologo guardarOdontologo(Odontologo odontologo);

        void guardarOdontologos(Odontologo odontologo);

        List<Odontologo> listarOdontologos();
    }


