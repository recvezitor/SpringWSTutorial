
package com.dimas.simpleSpringWS.endpoint;

import com.dimas.simpleSpringWS.SquareService;
import com.dimas.simpleSpringWS.generated.ObjectFactory;
import com.dimas.simpleSpringWS.generated.SquareServiceRequest;
import com.dimas.simpleSpringWS.generated.SquareServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class SquareWSEndpoint {
    //To calculate square of the input.
    @Autowired
    private SquareService squareService;

    //This is like @RequestMapping of Spring MVC
    @PayloadRoot(localPart = "SquareServiceRequest", namespace = "http://dimas.com/spring-ws2-square")
    @ResponsePayload
    public SquareServiceResponse getSquare(@RequestPayload SquareServiceRequest request) {
        SquareServiceResponse response = new ObjectFactory().createSquareServiceResponse();
        response.setOutput(squareService.square(request.getInput()));
        return response;
    }
}
