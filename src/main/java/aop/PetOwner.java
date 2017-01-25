package aop;

import javax.annotation.Resource;

/**
 * Created by NESOY on 2017-01-25.
 */
public class PetOwner {

    //@Autowired //wiring by type
    //@Qualifier("qf_cat")
    @Resource(name = "cat")
    private AnimalType animal;


    public void play() {
        animal.sound();
    }
}
