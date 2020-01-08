package br.com.favoriterestaurant.business.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.favoriterestaurant.business.dto.UserDTO;
import br.com.favoriterestaurant.business.entity.Usuario;
import br.com.favoriterestaurant.business.entity.converter.UserConverter;
import br.com.favoriterestaurant.business.reposity.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        List<Usuario> allUsers = usuarioRepository.findAll();

        List<UserDTO> userDTOS = allUsers.stream().map(UserConverter::toDTO).collect(Collectors.toList());
        return userDTOS;
    }

    @Override
    public Optional<UserDTO> findUser(Long idUser) {
        return Optional.empty();
    }

    @Override
    public void addUser(UserDTO userDTO) {

    }

    @Override
    public void updateUser(Long idUser, UserDTO userDTO) {

    }
}
