package br.edu.fatecpg.fatec;

import br.edu.fatecpg.fatec.model.Aluno;
import br.edu.fatecpg.fatec.model.Receita;
import br.edu.fatecpg.fatec.repository.AlunoRepository;
import br.edu.fatecpg.fatec.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class FatecApplication implements CommandLineRunner {
	@Autowired
	private AlunoRepository rep;

	@Autowired
	private ReceitaRepository repReceita;


	public static void main(String[] args) {
		SpringApplication.run(FatecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Aluno a1 = new Aluno("We", "999.999.999-24", "211", "we2@novo.com");
		Aluno a2 = new Aluno("Mara", "999.999.993-07", "122", "mara3@novo.com");
		Aluno a3 = new Aluno("Jan", "999.999.994-08", "233", "jan4@novo.com");
		rep.save(a1);
		rep.save(a2);
		rep.save(a3);

		List<Aluno> alunos = rep.findAll();
		alunos.stream().forEach(System.out::println);

		List<Aluno> aluno = rep.findAll();
		aluno.forEach(a -> System.out.println("Nome" + a.getNome() + "CPF" + a.getCpf() + "Matricula" + a.getMatricula() + "E-mail" + a.getEmail()));

		System.out.println("\nBusca por nome");
		rep.buscarPorNome("We").forEach(a -> System.out.println(a.getNome()));

		System.out.println("\nBusca por ID 1");
		rep.findById(1L).ifPresent(a -> System.out.println(
				"Nome: " + a.getNome() + " | CPF: " + a.getCpf()
		));

		System.out.println("\nDeletando ID 2");
		rep.deleteById(3L);

		System.out.println("\nAlunos após deleção");
		rep.findAll().forEach(a -> System.out.println(
				"ID: " + a.getId() + " | Nome: " + a.getNome()
		));

		if (repReceita.count() == 0) {
			repReceita.save(new Receita("Bolo de Chocolate", "Sobremesa", 25.0, true));
			repReceita.save(new Receita("Pizza Margherita", "Salgado", 45.0, false));
			repReceita.save(new Receita("Pudim", "Sobremesa", 15.0, true));
			repReceita.save(new Receita("Lasanha", "Salgado", 60.0, false));
			repReceita.save(new Receita("Cheesecake", "Sobremesa", 35.0, true));
		}

		System.out.println("\nReceitas em Promoção");
		repReceita.buscarEmPromocao().forEach(r -> System.out.println(
				"Nome: " + r.getNome() +
						" | Categoria: " + r.getCategoria() +
						" | Preço: R$" + r.getPreco()
		));
	}
}
