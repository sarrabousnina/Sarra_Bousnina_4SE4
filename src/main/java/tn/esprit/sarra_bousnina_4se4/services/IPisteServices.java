package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Piste;

import java.util.List;

public interface IPisteServices{
    public Piste addPiste(Piste piste);
    public Piste retreivePiste(Long numPiste);
    public List<Piste> retreiveAll();
    void deletePiste(Long numPiste);
    Piste updatePiste(Piste piste);

}
