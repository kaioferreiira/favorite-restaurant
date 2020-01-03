package br.com.favoriterestaurant.business.entity;

public class Maina {
    public static void main(String[] args) {
        Facilitador a = new Facilitador();

        a.setIdFacilitador(1);

        Rodada aRodada = new Rodada();
        aRodada.setFacilitador(a);
        aRodada.setIdRodada(5L);

//        aRodada.getCanditatoRodadas();

        Restaurante restaurante = new Restaurante();

        CanditatoRodada canditatoRodada = new CanditatoRodada();
        canditatoRodada.setRestaurante(restaurante);
        canditatoRodada.setIdCandidatoRodada(4L);
        canditatoRodada.setRodada(aRodada);

        Usuario aUsuario = new Usuario();
        aUsuario.setIdUsuario(2L);

        Voto aVoto = new Voto();
        aVoto.setCanditatoRodada(canditatoRodada);;
        aVoto.setUsuario(aUsuario);
        aVoto.setIdVoto(11L);


    }
}
