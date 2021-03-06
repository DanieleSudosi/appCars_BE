package com.finance.appCars.service;


import com.finance.appCars.domain.Cliente;
import com.finance.appCars.domain.Noleggiatore;
import com.finance.appCars.domain.Utente;
import com.finance.appCars.domain.enumeration.Tipologia;
import com.finance.appCars.repository.UtenteRepository;
import com.finance.appCars.service.dto.UtenteIdDTO;
import com.finance.appCars.service.dto.UtenteLoginDTO;
import com.finance.appCars.service.dto.UtenteNoleggiatoreDTO;
import com.finance.appCars.service.dto.UtenteRegistrazioneDTO;
import com.finance.appCars.service.mapper.UtenteIdMapper;
import com.finance.appCars.service.mapper.UtenteNoleggiatoreMapper;
import com.finance.appCars.service.mapper.UtenteRegistrazioneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private NoleggiatoreService noleggiatoreService;
    @Autowired
    private UtenteIdMapper utenteIdMapper;
    @Autowired
    private UtenteNoleggiatoreMapper utenteNoleggiatoreMapper;

    public Utente addUtente(UtenteRegistrazioneDTO uDTO, Tipologia tipologia){
            Utente u = new UtenteRegistrazioneMapper().toEntity(uDTO,tipologia);
            if(tipologia.equals(Tipologia.CLIENTE)){
               Cliente c = new Cliente();
               c.setCarta(uDTO.getCodice());
               c = clienteService.saveCliente(c);
               c.setUtente(u);
            }else {
                Noleggiatore n = new Noleggiatore();
                n.setpIva(uDTO.getCodice());
                n = noleggiatoreService.saveNoleggiatore(n);
                n.setUtente(u);

            }
        u = saveUtente(u);
            return u;
    }

    public Utente saveUtente(Utente u){return  utenteRepository.save(u);}

    public List<Utente> getUtenti(){return utenteRepository.findAll();}

    public Utente getUtenteById(long id){return utenteRepository.findById(id).get();}

    public void updateUtente(Utente u){utenteRepository.save(u);}

    public void deleteUtente(long id){utenteRepository.deleteById(id);}

    public UtenteIdDTO login(UtenteLoginDTO uDTO) throws Exception{
        Utente u = utenteRepository.findUtenteByUsername(uDTO.getUsername());
        if(!Objects.isNull(u)){
            if(u.getPassword().equals(uDTO.getPassword())){
                return utenteIdMapper.toDto(u);
            }else {
                throw new Exception(" Password non valida");
            }
        }else {
            throw new Exception("Utente non esistente");
        }
    }


    public List<UtenteNoleggiatoreDTO> getNoleggiatori(){
        List<Noleggiatore> nList = noleggiatoreService.getNoleggiatori();
        List<UtenteNoleggiatoreDTO> unDTO = new ArrayList<>();
        nList.forEach(n -> unDTO.add(utenteNoleggiatoreMapper.toDto(n)));
        return unDTO;

    }
}
