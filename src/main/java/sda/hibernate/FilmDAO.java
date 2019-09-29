package sda.hibernate;

import org.hibernate.Session;
import sda.hibernate.entity.Film;

import java.util.List;

public class FilmDAO {

    public Film createQueryById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createQuery("from Film WHERE id=:id", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        return film;
    }
    public List<Film> createQueryAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Film> filmy = session.createQuery("from Film", Film.class).getResultList();
        List<Film> filmy2 = session.createNativeQuery("select * from Film", Film.class).getResultList();

        session.close();
        return filmy2;
    }

    public Film createNativeQueryById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createNativeQuery("Select * from film WHERE id=:id", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        return film;
    }

    public Film createNamedQueryById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createNamedQuery("film.selectById", Film.class).setParameter("id", id).getSingleResult();
        session.close();
        return film;
    }

    public Film createNamedQueryByRokprodukcji(Integer rokprodukcji) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Film film = session.createNamedQuery("film.selectByRokprodukcji", Film.class).setParameter("rokprodukcji", rokprodukcji).getSingleResult();
        session.close();
        return film;
    }
}
