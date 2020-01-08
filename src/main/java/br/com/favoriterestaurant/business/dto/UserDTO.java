package br.com.favoriterestaurant.business.dto;

public class UserDTO {

//    private Long idUsuario;
    private String nome;

    public UserDTO() {
    }

    public UserDTO(String nome) {
//        this.idUsuario = idUsuario;
        this.nome = nome;
    }

//    public Long getIdUsuario() {
//        return idUsuario;
//    }

//    public void setIdUsuario(Long idUsuario) {
//        this.idUsuario = idUsuario;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
