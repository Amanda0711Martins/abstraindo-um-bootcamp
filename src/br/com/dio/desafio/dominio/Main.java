package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //atributos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        /*bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
         */


        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Amanda" + devAmanda.getConteudosInscritos());

        devAmanda.progredir();
        System.out.println("***************");

        System.out.println("Conteudos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Amanda" + devAmanda.getConteudosConcluidos());
        System.out.println("XP total: " + devAmanda.calcularTotalXp());

        System.out.println("***************");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luiz" + devLuiz.getConteudosInscritos());

        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("***************");

        System.out.println("Conteudos Inscritos Luiz" + devLuiz.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Luiz" + devLuiz.getConteudosConcluidos());
        System.out.println("XP total: " + devLuiz.calcularTotalXp());


    }
}
