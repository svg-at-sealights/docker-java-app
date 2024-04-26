package com.sldemo;

import com.sldemo.service.MessageService;

public class App {

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        System.out.println(messageService.getMessage());
    }
}