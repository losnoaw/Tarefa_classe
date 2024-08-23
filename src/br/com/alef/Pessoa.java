package br.com.alef;

public class Pessoa {

    private String  nome;
    private Integer idade;
    private Integer altura;
    private String email;
    private Integer peso;
    private String estado;
    private String cidade;
    private String endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String toString() {
        return "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Altura: " + altura + " m" + "\n" +
                "Email: " + email + "\n" +
                "Peso: " + peso + " kg" + "\n" +
                "Estado: " + estado + "\n" +
                "Cidade: " + cidade + "\n" +
                "Endereço: " + endereco;
    }

    public void imprimirSeparador() {
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
