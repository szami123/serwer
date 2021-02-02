package pl.szabat.serwer;


import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/danes")
@CrossOrigin
public class daneApi {

    private List<dane> danes;

    public daneApi() {
        danes = new ArrayList<>();
        danes.add(new dane(1L,"Opel","Astra", LocalDate.of(2000,1,22)));
        danes.add(new dane(2L,"Opel","Corsa", LocalDate.of(2008,6,12)));
        danes.add(new dane(3L,"Opel","Cascada", LocalDate.of(2014,8,8)));
        danes.add(new dane(4L,"Opel","Kadett", LocalDate.of(1989,11,30)));

    }


    @GetMapping("/all")
    public List<dane> getAll(){
        return danes;

    }

    @GetMapping
    public dane getById(@RequestParam int index){
        Optional<dane> first = danes.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addAuto(@RequestBody dane danee) {
        return danes.add(danee);
    }

    @PutMapping
    public boolean updateAuto(@RequestBody dane danee) {
        return danes.add(danee);
    }


    @DeleteMapping
    public boolean deleteAuto(@RequestParam int index) {
        return danes.removeIf(element -> element.getId() == index);
    }

    }

