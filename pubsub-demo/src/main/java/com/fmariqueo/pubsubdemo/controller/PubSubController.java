package com.fmariqueo.pubsubdemo.controller;

import com.fmariqueo.pubsubdemo.gcp.PubSub.PubsubOutboundGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubSubController {

    @Autowired
    private PubsubOutboundGateway messagingGateway;

    @GetMapping("/")
    public String root() {
        return "hello world";
    }

    @GetMapping("/publishMessage")
    public String publishMessage(@RequestParam("message") String message) {
        messagingGateway.sendToPubsub(message);
        return "Success";
    }
}
