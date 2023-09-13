package project.dummy;

import io.restassured.response.ValidatableResponse;
import project.Requests;

public class ListaEmployees extends Requests {

    public ValidatableResponse daneEmployees(String path){
        return get("https://dummy.restapiexample.com/api/v1/employees");
    }
}
