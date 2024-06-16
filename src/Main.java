import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Mentoria tutor = new Mentoria();
        tutor.setTitulo("Mentoria de Java");
        tutor.setDescricao("Descrição da mentoria de Java");
        tutor.setData(LocalDate.now());


        Curso curso_01 = new Curso();
        curso_01.setTitulo("Java");
        curso_01.setDescricao("Estrutura de dados Java");
        curso_01.setCargaHoraria(10);
        

        Curso curso_02 = new Curso(); 
        curso_02.setTitulo("Python");  
        curso_02.setDescricao("Estrutura de dados Python"); 
        curso_02.setCargaHoraria(12);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Backed");
        bootcamp.setDescricao("Aprendendo os conceitos Java");
        bootcamp.getConteudos().add(curso_01);
        bootcamp.getConteudos().add(curso_02);
        bootcamp.getConteudos().add(tutor);


        Dev devGiliarney = new Dev();
        devGiliarney.setNome("Giliarney");
        devGiliarney.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos :" + devGiliarney.getConteudoInscritos());
        devGiliarney.progredir();  
        System.out.println("Conteúdos Inscritos :" + devGiliarney.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos:" + devGiliarney.getConteudoConcluidos());
        System.out.println("Experiência:" + devGiliarney.calcularXP_Total());

        System.out.println();
        System.out.println();
        System.out.println();

        Dev devSofia = new Dev();
        devSofia.setNome("Sofia");
        devSofia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devSofia.getConteudoInscritos());
        devSofia.progredir();
        System.out.println("Conteúdos Inscritos: " + devSofia.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos:" + devSofia.getConteudoConcluidos());
        System.out.println("Experiência:" + devSofia.calcularXP_Total());
        }
}
