package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {

    @Test
    void testClone() throws CloneNotSupportedException {

        Revista revista = new Revista(
                new Editora("AA0000", "ENCONTRO IMPORTANTE EDITORA LTDA", "04.889.743/0001-15", "ssantos@revistaencontro.com.br", "(31) 2126-8000", "(31) 3116-1500"),
                new Edicao(1, LocalDateTime.of(2022, 4, 28, 8, 0, 0), 10),
                "ESPORTES",
                "AA000000",
                "Adicione um título...",
                "Adicione um resumo..."
        );

        Revista revistaClone = revista.clone();
        revistaClone.getEditora().setCodigo("AX0237");
        revistaClone.setCodigo("AX023701");
        revistaClone.getEdicao().setQtdArtigos(40);
        revistaClone.getEdicao().setData(LocalDateTime.of(2022, 4, 30, 9, 30, 0));
        revistaClone.setTipo("CULTURA");
        revistaClone.setTitulo("Pela primeira vez em dois anos, Filarmônica de MG se apresenta ao ar livre");
        revistaClone.setResumo("As apresentações desse tipo haviam sido suspensas por causa da pandemia. Primeiro concerto do retorno será na Praça da Savassi, em BH");

        assertEquals("Revista{" +
                        "editora=Editora{codigo='AA0000', razaoSocial='ENCONTRO IMPORTANTE EDITORA LTDA', email='ssantos@revistaencontro.com.br', telefone1='(31) 2126-8000', telefone2='(31) 3116-1500'}, " +
                        "edicao=Edicao{numero='1', data='28/04/2022 08:00:00', qtdArtigos='10'}, " +
                        "tipo='ESPORTES', " +
                        "codigo='AA000000', " +
                        "titulo='Adicione um título...', " +
                        "resumo='Adicione um resumo...'}",
                revista.toString()
        );
        assertEquals("Revista{" +
                        "editora=Editora{codigo='AX0237', razaoSocial='ENCONTRO IMPORTANTE EDITORA LTDA', email='ssantos@revistaencontro.com.br', telefone1='(31) 2126-8000', telefone2='(31) 3116-1500'}, " +
                        "edicao=Edicao{numero='1', data='30/04/2022 09:30:00', qtdArtigos='40'}, " +
                        "tipo='CULTURA', " +
                        "codigo='AX023701', " +
                        "titulo='Pela primeira vez em dois anos, Filarmônica de MG se apresenta ao ar livre', " +
                        "resumo='As apresentações desse tipo haviam sido suspensas por causa da pandemia. Primeiro concerto do retorno será na Praça da Savassi, em BH'}",
                revistaClone.toString()
        );
    }
}