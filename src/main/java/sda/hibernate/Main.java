package sda.hibernate;

import sda.hibernate.entity.Film;

import java.util.List;

public class Main {
    public static void main(String[] arg) {
        FilmDAO filmDAO = new FilmDAO();
        Film film1 = filmDAO.createNamedQueryById(1L);
        Film film2 = filmDAO.createNativeQueryById(2L);
        Film film3 = filmDAO.createQueryById(3L);

        System.out.println(film1.getId() + " " + film1.getNazwa_filmu() + " " + film1.getGatunek_filmu() + " " + film1.getRezyser_filmu() + " " + film1.getRokprodukcji());

        System.out.println(film2.getId() + " " + film2.getNazwa_filmu() + " " + film2.getGatunek_filmu() + " " + film2.getRezyser_filmu() + " " + film2.getRokprodukcji());

        System.out.println(film3.getId() + " " + film3.getNazwa_filmu() + " " + film3.getGatunek_filmu() + " " + film3.getRezyser_filmu() + " " + film3.getRokprodukcji());

        List<Film> listaFilmow = filmDAO.createQueryAll();
        for (Film film : listaFilmow) {
            System.out.println(film.getId() + " " + film.getNazwa_filmu() + " " + film.getGatunek_filmu() + " " + film.getRezyser_filmu() + " " + film.getRokprodukcji());

        }

        listaFilmow = filmDAO.createNamedQueryByRokprodukcji(2001);
        for (Film film : listaFilmow) {
            System.out.println(film.getId() + " " + film.getNazwa_filmu() + " " + film.getGatunek_filmu() + " " + film.getRezyser_filmu() + " " + film.getRokprodukcji());

        }
    }
}
