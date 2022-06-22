package resource;

import com.TeamAssessment.Rest.Employee;
import com.TeamAssessment.Rest.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class EmployeeResource {

    @PostMapping("/createEmployee")
    public ResponseEntity readEmployee(@Valid @RequestBody Employee employee, Errors errors){
        Response response = new Response();
        if(errors.hasErrors()){
            response.setStatus("ERROR");
            for(ObjectError message: errors.getAllErrors()){
                response.getErrors().add(message.getDefaultMessage());
            }

        } else response.setStatus("VALID");

    return ResponseEntity.ok(response);
    }


}
