import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String [] arfs){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentorioa");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Devoloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulia = new Dev();

        devJulia.setNome("Júlia");

        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devJulia.getConteudosConcluidos());

        System.out.println("-");
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("Conteúdos concluidos " + devJulia.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos " + devJulia.getConteudosInscritos());
        System.out.println("XP: " + devJulia.calcularTotalXp());

    }
}
