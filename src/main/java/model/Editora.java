package model;

public class Editora implements Cloneable {

    private String codigo;
    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefone1;
    private String telefone2;

    public Editora(String codigo, String razaoSocial, String cnpj, String email, String telefone1, String telefone2) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Editora{" +
                "codigo='" + codigo + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", email='" + email + '\'' +
                ", telefone1='" + telefone1 + '\'' +
                ", telefone2='" + telefone2 + '\'' +
                '}';
    }
}

