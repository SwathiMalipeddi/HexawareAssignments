package resource;

import com.TeamAssessment.Rest.Response;
import exception.ExceptionErrors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExceptionResource {

    @GetMapping("/testExceptionHandling")
    public ResponseEntity readEmployee(@RequestParam(name="code") String code){
        Response response = new Response();
        if(ExceptionErrors.getErrorMessageByCode(Integer.valueOf(code)) != null )
            response.setStatus(ExceptionErrors.getErrorMessageByCode(Integer.valueOf(code)));
        else
            response.getErrors().add("INVALID INPUT");

        return ResponseEntity.ok(response);
    }


}
