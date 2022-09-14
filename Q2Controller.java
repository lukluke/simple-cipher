import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller class routes HTTP requests to the handler methods here.
 * 
 * @author Luke
 */
@RestController
@RequestMapping("/api")
public class Q2Controller {
    
    private MessageService messageSer;
    
    @Autowired
    public void setup(MessageService messageSer) {
        this.messageSer = messageSer;
    }
    
    @RequestMapping(value = "/encrypt", method = RequestMethod.POST)
    public TextResponseJson encryptList() {
        return messageSer.encrypt();
    }
    
    @RequestMapping(value = "/decrypt", method = RequestMethod.POST)
    public TextResponseJson decryptList() {
        return messageSer.decrypt();
    }
    
    
    /*** complete this class by adding a logger, two handlers and other annotations as necessary ***/
    
    
    
    

}
