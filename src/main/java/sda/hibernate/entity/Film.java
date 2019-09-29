package sda.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(schema = "ksiegarnia", name = "film")
@NamedQueries({@NamedQuery(name = "film.selectById", query = "SELECT n FROM Film n where n.id=:id"), @NamedQuery(name = "film.selectByRokprodukcji", query = "SELECT n FROM Film n where n.rokprodukcji=:rokprodukcji")})
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nazwa_filmu;
    @Column
    private String gatunek_filmu;
    @Column
    private String rezyser_filmu;
    @Column
    private Integer rokprodukcji;

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa_filmu() {
        return nazwa_filmu;
    }

    public void setNazwa_filmu(String nazwa_filmu) {
        this.nazwa_filmu = nazwa_filmu;
    }

    public String getGatunek_filmu() {
        return gatunek_filmu;
    }

    public void setGatunek_filmu(String gatunek_filmu) {
        this.gatunek_filmu = gatunek_filmu;
    }

    public String getRezyser_filmu() {
        return rezyser_filmu;
    }

    public void setRezyser_filmu(String rezyser_filmu) {
        this.rezyser_filmu = rezyser_filmu;
    }

    public Integer getRokprodukcji() {
        return rokprodukcji;
    }

    public void setRokprodukcji(Integer rokprodukcji) {
        this.rokprodukcji = rokprodukcji;
    }
}
