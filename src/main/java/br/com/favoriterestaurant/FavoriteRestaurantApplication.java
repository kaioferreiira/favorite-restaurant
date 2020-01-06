package br.com.favoriterestaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.favoriterestaurant.business.entity.CanditatoRodada;
import br.com.favoriterestaurant.business.entity.Restaurante;
import br.com.favoriterestaurant.business.entity.Rodada;
import br.com.favoriterestaurant.business.entity.Usuario;
import br.com.favoriterestaurant.business.entity.Voto;
import br.com.favoriterestaurant.business.reposity.RestauranteRepository;
import br.com.favoriterestaurant.business.reposity.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FavoriteRestaurantApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FavoriteRestaurantApplication.class, args);
    }

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;


    @Override
    public void run(String... args) throws Exception {

        Restaurante r1 =  new Restaurante();
        r1.setIdRestaurante(1l);
        r1.setNome("Restaurante 1");

        Restaurante r2 =  new Restaurante();
        r2.setIdRestaurante(2l);
        r1.setNome("Restaurante 2");
        restauranteRepository.saveAll(Arrays.asList(r1,r2));

        CanditatoRodada canditatoRodada1 = new CanditatoRodada();
        canditatoRodada1.setRestaurante(r1);

        CanditatoRodada canditatoRodada2 = new CanditatoRodada();
        canditatoRodada1.setRestaurante(r2);

        List<CanditatoRodada> restaurantesCandidatos = new ArrayList<>();
        restaurantesCandidatos.add(canditatoRodada1);
        restaurantesCandidatos.add(canditatoRodada2);

        Rodada rodada1 = new Rodada();
        rodada1.setIdRodada(1l);
        rodada1.setFacilitador(null);
        rodada1.setCanditatoRodadas(restaurantesCandidatos);


        Usuario kaio = new Usuario();
        kaio.setIdUsuario(1l);
        usuarioRepository.save(kaio);

        Voto voto1 = new Voto();
        voto1.setIdVoto(1l);
        voto1.setUsuario(kaio);
        voto1.setCanditatoRodada(canditatoRodada1);



    }
}
