package br.com.rborges;

public class App extends Pessoa{
    public static void main (String args[]) {


        Fisica fisica = new Fisica();
        fisica.setCpf (00011122233d);
        fisica.setNome( "Rebeca ");
        fisica.setSobrenome("Borges ");

        System.out.println(fisica.getNome() +fisica.getSobrenome() + " correponde a uma pessoa Fisica  com o CPF "+ fisica.getCpf());


        Juridica juridica = new Juridica();
        juridica.setCpnj(111112223333d);
        juridica.setNome("Cats corporation");
        juridica.setTelefone (4002-8922d);
        System.out.println(juridica.getNome() + " corresponde a uma pessoa Juridica com o cnpj "+juridica.getCpnj() + " e o telefone"+ juridica.getTelefone());

        }
}

