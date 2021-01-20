import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        ArrayList<Pessoa> cadastroGeralPessoas = new ArrayList<Pessoa>();
        do {
            System.out.println("1 - Cadastrar PF");
            System.out.println("2 - Cadastrar PJ");
            System.out.println("3 - Listar PF");
            System.out.println("4 - Listar PJ");
            System.out.println("5 - Sair");
            x = sc.nextInt();

            if (x == 1 || x == 2) {
                sc.nextLine();
                System.out.println("Digite: Nome");
                String nome = sc.nextLine();
                System.out.println("Digite: Telefone");
                String telefone = sc.nextLine();
                System.out.println("Digite: Email");
                String email = sc.nextLine();
                System.out.println("Digite: Identificador");
                String id = sc.nextLine();
                if (x == 1)
                    cadastroGeralPessoas.add(new PessoaFisica(nome, telefone, email, id));
                if (x == 2)
                    cadastroGeralPessoas.add(new PessoaJuridica(nome, telefone, email, id));

            }

            if (x == 3) {
                System.out.println("Pessoas Físicas");
                for (int i = 0; i < cadastroGeralPessoas.size(); i++) {
                    if (cadastroGeralPessoas.get(i) instanceof PessoaFisica) {
                        PessoaFisica p = (PessoaFisica) cadastroGeralPessoas.get(i);
                        System.out.println("Nome: " + p.nome + " email: " + p.email + " telefone: " + p.telefone
                                + " cpf: " + p.cpf);
                    }
                }
            }
            if (x == 4) {
                System.out.println("Pessoas Físicas");
                for (int i = 0; i < cadastroGeralPessoas.size(); i++) {
                    if (cadastroGeralPessoas.get(i) instanceof PessoaJuridica) {
                        PessoaJuridica p = (PessoaJuridica) cadastroGeralPessoas.get(i);
                        System.out.println("Nome: " + p.nome + " email: " + p.email + " telefone: " + p.telefone
                                + " cpf: " + p.cnpj);
                    }
                }
            }
        } while (x != 5);
        sc.close();
    }
}
