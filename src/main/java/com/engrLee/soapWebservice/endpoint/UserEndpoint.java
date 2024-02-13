package com.engrLee.soapWebservice.endpoint;

import com.engrLee.soapWebservice.data.GetUserRequest;
import com.engrLee.soapWebservice.data.GetUserResponse;
import com.engrLee.soapWebservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class UserEndpoint {

    private final UserService userService;

    @PayloadRoot(localPart = "getUserRequest", namespace = "http://engineerLee.com/springboot-soapWebservice")
    @ResponsePayload
    public GetUserResponse getUserService(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        userService.getUsers(request.getName());
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
