package dependencyInversion;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void userlariFrontaOtur(){
        userService.bazadanUserlariGotur();
    }

    public void useriFrontaOturIdyeGore(int i){
        userService.bazadanUserGotur(i);
    }

}
