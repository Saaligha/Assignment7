/*package Assignment6.controller;

import Assignment6.domain.User.PremiumUser;
import Assignment6.services.User.PremiumUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/PremiumUser/")
public class PremiumuserController {


        @Autowired
        @Qualifier("PremiumUserServiceImpl")
        private PremiumUserService premiumUserService;

        @PostMapping("/create")
        public PremiumUser create(@RequestBody PremiumUser user){
            return premiumUserService.create(user);
        }
        @PutMapping("/update")
        public PremiumUser update(@RequestBody PremiumUser user){
            return premiumUserService.update(user);
        }
        @DeleteMapping(path ="/delete{id}")
        public void delete(@PathVariable String id){
            premiumUserService.delete(id);}

        @GetMapping(path = "/read/{id}")
        public PremiumUser read(@PathVariable String id){
            PremiumUser c = premiumUserService.read(id);
            return c;

        }
        public Set<PremiumUser> getAll(){
        return premiumUserService.getAll();
        }
        }


*/