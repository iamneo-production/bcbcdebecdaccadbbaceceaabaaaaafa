@RestController()
public class ApiController {
    @GetMapping("display")
    public String getName(String studentName){
        return "Welcome " + studentName + "!";
    }
}
