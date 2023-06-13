package models;
import java.util.Date;

public class Caes extends Animais {
    private String porte;    

    public Caes(String nome, Date dataNascimento, String cor, String peso, String genero, String raca,
            FichaMedica fichaMedica, String porte) {
        super(nome, dataNascimento, cor, peso, genero, raca, fichaMedica);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
}