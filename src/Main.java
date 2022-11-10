import br.com.dio.desafio.dominio.Curso;

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
        System.out.println(curso1);
        System.out.println(curso2);
    }
}