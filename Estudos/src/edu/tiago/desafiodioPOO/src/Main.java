import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Java");
        curso1.setDescricao(" Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" JavaScript");
        curso2.setDescricao(" Curso JavaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Orientação a objetos com Java");
        mentoria.setDescricao(" Visão geral de Programação Orientada a Objetos");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Orange Tech");
        bootcamp.setDescricao(" Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        /*
         * Dev devTiago = new Dev();
         * devTiago.setNome("Tiago");
         * devTiago.inscreverBootcamp(bootcamp);
         * System.out.println("Tiago");
         * System.out.println("Conteúdos Inscritos: " +
         * devTiago.getConteudosInscritos());
         * devTiago.progredir();
         * devTiago.progredir();
         * devTiago.progredir();
         * System.out.println("-----");
         * System.out.println("Conteúdos Concluídos: " +
         * devTiago.getConteudosConcluidos());
         * System.out.println("-----");
         * System.out.println("Conteúdos Inscritos: " +
         * devTiago.getConteudosInscritos());
         * System.out.println("XP: " + devTiago.calcularTotalXP());
         * System.out.println("-----");
         * 
         * Dev devEduarda = new Dev();
         * devEduarda.setNome("Eduarda");
         * devEduarda.inscreverBootcamp(bootcamp);
         * System.out.println("Eduarda");
         * System.out.println("Conteúdos Inscritos: " +
         * devEduarda.getConteudosInscritos());
         * devEduarda.progredir();
         * devEduarda.progredir();
         * devEduarda.progredir();
         * System.out.println("-----");
         * System.out.println("Conteúdos Concluídos: " +
         * devEduarda.getConteudosConcluidos());
         * System.out.println("-----");
         * System.out.println("Conteúdos Inscritos: " +
         * devEduarda.getConteudosInscritos());
         * System.out.println("XP: " + devEduarda.calcularTotalXP());
         * System.out.println("-----");
         */
    }
}