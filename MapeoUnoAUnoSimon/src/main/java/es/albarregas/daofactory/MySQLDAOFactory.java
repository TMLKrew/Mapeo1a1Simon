package es.albarregas.daofactory;

import es.albarregas.dao.GenericoDAO;
import es.albarregas.dao.IGenericoDAO;
import es.albarregas.dao.IPuertoDAO;
import es.albarregas.dao.PuertoDAO;

public class MySQLDAOFactory extends DAOFactory{


    @Override
    public IGenericoDAO getGenericoDAO() {
        return new GenericoDAO();
    }

    @Override
    public IPuertoDAO getPuertoDAO() {
        return new PuertoDAO();
    }

    

    
    
}
