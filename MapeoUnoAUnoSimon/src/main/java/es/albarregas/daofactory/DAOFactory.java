package es.albarregas.daofactory;

import es.albarregas.dao.IGenericoDAO;
import es.albarregas.dao.IPuertoDAO;
import es.albarregas.dao.IServicioDAO;

public abstract class DAOFactory {

    public abstract IGenericoDAO getGenericoDAO();
    public abstract IServicioDAO getServicioDAO();
    public abstract IPuertoDAO getPuertoDAO();

    public static DAOFactory getDAOFactory() {
        DAOFactory daof = null;

        daof = new MySQLDAOFactory();

        return daof;
    }

}
