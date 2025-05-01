package atividade2.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ContatoBean {

    private String nome;
    private String sobrenome;
    private String fone;
    private String email;

    // Método enviar básico, chamado pelo botão no formulário
    public String enviar() {
        System.out.println("Dados recebidos:");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Telefone: " + fone);
        System.out.println("E-mail: " + email);
        return null; // sem navegação após enviar
    }

    // Gerar automaticamente getters e setters pelo Eclipse
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
