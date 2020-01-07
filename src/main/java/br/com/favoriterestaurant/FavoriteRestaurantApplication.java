package br.com.favoriterestaurant;

import java.util.Arrays;

import br.com.favoriterestaurant.business.entity.CandidatoRodada;
import br.com.favoriterestaurant.business.entity.Facilitador;
import br.com.favoriterestaurant.business.entity.Restaurante;
import br.com.favoriterestaurant.business.entity.Rodada;
import br.com.favoriterestaurant.business.entity.Usuario;
import br.com.favoriterestaurant.business.entity.Voto;
import br.com.favoriterestaurant.business.reposity.CandidatoRodadaRepository;
import br.com.favoriterestaurant.business.reposity.FacilitadorRepository;
import br.com.favoriterestaurant.business.reposity.RestauranteRepository;
import br.com.favoriterestaurant.business.reposity.RodadaRepository;
import br.com.favoriterestaurant.business.reposity.UsuarioRepository;
import br.com.favoriterestaurant.business.reposity.VotoRepository;
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

    @Autowired
    private FacilitadorRepository facilitadorRepository;

    @Autowired
    private RodadaRepository rodadaRepository;

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private CandidatoRodadaRepository candidatoRodadaRepository;


    @Override
    public void run(String... args) throws Exception {


        Usuario usuario1 = new Usuario(null, "user 1");
        Usuario usuario2 = new Usuario(null, "user 2");
        Usuario usuario3 = new Usuario(null, "user 3");
        Usuario usuario4 = new Usuario(null, "user 4");
        Usuario usuario5 = new Usuario(null, "user 5");
        Usuario usuario6 = new Usuario(null, "user 6");
        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6));


        Rodada rodada1 = new Rodada();
        rodada1.setIdRodada(null);
        rodada1.setNomeRodada("rodada 1");
        rodadaRepository.save(rodada1);

        Facilitador facilitador1 = new Facilitador(null, "facilitador 1", rodada1);
        facilitadorRepository.save(facilitador1);

        rodada1.setFacilitador(facilitador1);


        Restaurante r1 = new Restaurante(null, "Restaurante 1");
        Restaurante r2 = new Restaurante(null, "Restaurante 2");
        Restaurante r3 = new Restaurante(null, "Restaurante 3");
        Restaurante r4 = new Restaurante(null, "Restaurante 4");
        restauranteRepository.saveAll(Arrays.asList(r1, r2, r3, r4));


        CandidatoRodada cd1 = new CandidatoRodada(null, r1, rodada1 );
        CandidatoRodada cd2 = new CandidatoRodada(null, r2, rodada1 );
        CandidatoRodada cd3 = new CandidatoRodada(null, r3, rodada1 );
        candidatoRodadaRepository.saveAll(Arrays.asList(cd1, cd2, cd3));

//        rodada1.setCanditatoRodadas(candidatoRodadaList);
//        rodadaRepository.save(rodada1);

        System.out.println("----");


        //realizar voto

        Voto voto1 = new Voto(null, usuario1, cd1 );
        Voto voto2 = new Voto(null, usuario2, cd2 );
        Voto voto3 = new Voto(null, usuario3, cd2 );
        Voto voto4 = new Voto(null, usuario4, cd2 );
        Voto voto5 = new Voto(null, usuario5, cd2 );
        Voto voto6 = new Voto(null, usuario6, cd2 );
        votoRepository.saveAll(Arrays.asList(voto1, voto2, voto3, voto4, voto5, voto6));


        System.out.println("--");

    }
}
