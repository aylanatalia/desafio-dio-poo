import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Conteudo;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); 
        curso2.setTitulo("Js");
        curso2.setDescricao("Curso de javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("mentoria java");
        mentoria1.setData(LocalDate.now());
        
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootecamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAyla = new Dev();
        devAyla.setNome("Ayla");
        devAyla.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos de Ayla: " + devAyla.getConteudoInscritos());
        devAyla.progredir();
        devAyla.progredir();
        System.out.println("Conteudos incritos de Ayla: " + devAyla.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Ayla: " + devAyla.getConteudoConcluidos());
        System.out.println("XP: " + devAyla.calcularTotalXp());

        System.out.println("-**************************-");

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Natalia: " + devNatalia.getConteudoInscritos());
        devNatalia.progredir();
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("Conteudos inscritos de Natalia: " + devNatalia.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Natalia: " + devNatalia.getConteudoConcluidos());
        System.out.println("XP: " + devNatalia.calcularTotalXp());

        

    }
}
