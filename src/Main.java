import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devAguiar = new Dev();
        devAguiar.setNome("Aguiar");
        devAguiar.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos Aguiar " + devAguiar.getConteudosInscritos());
        devAguiar.progredir();
        System.out.println("-");
        System.out.println("Contéudos inscritos Aguiar " + devAguiar.getConteudosInscritos());
        System.out.println("Contéudos concluídos Aguiar " + devAguiar.getConteudosConlcuidos());
        System.out.println("Calcular XP: " + devAguiar.calcularTotalXp());

        System.out.println("---------");

        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        devFrancisco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Francisco " + devFrancisco.getConteudosInscritos());
        devFrancisco.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Francisco " + devFrancisco.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Francisco " + devFrancisco.getConteudosConlcuidos());
        System.out.println("Calcular XP: " + devFrancisco.calcularTotalXp());

    }
}