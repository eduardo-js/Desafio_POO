public class PessoaJuridica extends Pessoa {
    String cnpj;

    PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

}
