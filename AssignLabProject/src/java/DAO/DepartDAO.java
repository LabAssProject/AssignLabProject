package DAO;

import Pojo.Department;
import java.util.List;
import org.hibernate.Query;

/**
 * @author JETS_ITI
 * @version 1.0
 * @created 19-Mar-2015 10:55:46 AM
 */
public class DepartDAO extends GenericDAO{


    /**
     *
     * @param departObj
     */
    
    public DepartDAO() {
        super();
    }

    public void Delete(Department departObj) {
        // begin transaction
        beginTransaction();
        delete(departObj);
        getTransaction().commit();
    }

    /**
     *
     * @param departObj
     */
    public void Insert(Department departObj) {
        // begin transaction
        beginTransaction();
        persist(departObj);
        getTransaction().commit();
    }

    public List SelectAllActive() {
        String hql = "FROM Department p where p.idDepartment=0";
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    public List SelectAllDeactive() {
        String hql = "FROM Department p where p.idDepartment=1";
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    /**
     *
     * @param departObj
     */
    public List SelectOne(Department departObj) {
        String hql = "FROM Department p where p.idDepartment="+departObj.getIdDepartment();
        Query query = getSession().createQuery(hql);
        return query.list();
    }
    
    /**
     *
     * @param departObj
     */
    public List SelectOneByName(Department departObj) {
        String hql = "FROM Department p where p.name="+departObj.getName();
        Query query = getSession().createQuery(hql);
        return query.list();
    }

    /**
     *
     * @param departObj
     */
    public void Update(Department departObj) {
        // begin transaction
        beginTransaction();
        saveOrUpdate(departObj);
        getTransaction().commit();
    }

}
