package com.dh.medicamentos.dao;

public interface IDao <T>{

    public T salvar(T t);
    public T buscar(Integer id);

}
