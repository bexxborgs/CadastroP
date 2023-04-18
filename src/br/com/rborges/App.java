package br.com.rborges;

public class App {
    public static void main (String args[]) {


        Fisica fisica = new Fisica();
        fisica.setCpf(00011122233d);
        fisica.setNome("Rebeca ");
        System.out.println( fisica.getNome() +" correponde a uma pessoa Fisica  com o CPF "+ fisica.getCpf());


        Juridica juridica = new Juridica();
        juridica.setCpnj(111112223333d);
        juridica.setNomeEmpresa("cats corporation");
        System.out.println(juridica.getNomeEmpresa()+ " corresponde a uma pessoa Juridica com o cnpj "+juridica.getCpnj());


        }
}

