package br.com.alef;

public class ProjetoPessoa {
    public static void main(String[] args) {

        /**
         * Classe que imprime um cadastro de uma pessoa
         */

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alef");
        pessoa.setIdade(31);
        pessoa.setAltura(180);
        pessoa.setEmail("alefsilvalp@hotmail.com");
        pessoa.setPeso(90);
        pessoa.setEstado("Pará");
        pessoa.setCidade("Capanema");
        pessoa.setEndereco("Av Barão de Capanema,989 Centro");
        pessoa.imprimirSeparador();
        System.out.println(pessoa);
        pessoa.imprimirSeparador();

        Pessoa pessoa2 = new Pessoa();
        pessoa.setNome("Alef");
        pessoa.setIdade(31);
        pessoa.setAltura(180);
        pessoa.setEmail("alefsilvalp@hotmail.com");
        pessoa.setPeso(90);
        pessoa.setEstado("Pará");
        pessoa.setCidade("Capanema");
        pessoa.setEndereco("Av Barão de Capanema,989 Centro");
        System.out.println(pessoa);
        pessoa.imprimirSeparador();
    }


}
