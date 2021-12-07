import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do Curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: Camila.  " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: Camila.  " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: João.  " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: João.  " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: Camila.  " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: Camila.  " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        devJoao.progredir();
        System.out.println("Conteúdos Inscritos: João.  " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: João.  " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: Camila.  " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: Camila.  " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        devJoao.progredir();
        System.out.println("Conteúdos Inscritos: João.  " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: João.  " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: Camila.  " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: Camila.  " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        devJoao.progredir();
        System.out.println("Conteúdos Inscritos: João.  " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: João.  " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
