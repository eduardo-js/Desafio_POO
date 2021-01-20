public class PessoaFisica extends Pessoa {
    private String cpf;

    PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

}
