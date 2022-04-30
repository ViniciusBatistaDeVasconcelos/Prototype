package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Edicao implements Cloneable {

    private int numero;
    private LocalDateTime data;
    private int qtdArtigos;

    public Edicao(int numero, LocalDateTime data, int qtdArtigos) {
        this.numero = numero;
        this.data = data;
        this.qtdArtigos = qtdArtigos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getQtdArtigos() {
        return qtdArtigos;
    }

    public void setQtdArtigos(int qtdArtigos) {
        this.qtdArtigos = qtdArtigos;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Edicao{" + "numero='" + numero + '\'' + ", data='" + (!Objects.isNull(data) ? data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) : null) + '\'' + ", qtdArtigos='" + qtdArtigos + '\'' + '}';
    }
}
