import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JAVA");
        curso1.setDescricao("descrição Curso de JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("descrição Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descriçao mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gustavo" + devGustavo.getConteudosInscritos());

        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos  Gustavo" + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gustavo" + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());
        System.out.println("--------------");

        Dev devRafa = new Dev();
        devRafa.setNome("Rafael");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rafa" + devRafa.getConteudosInscritos());
        devRafa.progredir();
        devRafa.progredir();
        devRafa.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Rafa" + devRafa.getConteudosConcluidos());
        System.out.println("XP: " + devRafa.calcularTotalXp());


    }
}