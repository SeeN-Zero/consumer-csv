package org.seen.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Path("/base")
@ApplicationScoped
public class BaseController {
    private final List<String> messages = Collections.synchronizedList(new ArrayList<>());
    @Incoming("file-channel")
    public void receive(String message) {
        System.out.println(message);
    }

}
