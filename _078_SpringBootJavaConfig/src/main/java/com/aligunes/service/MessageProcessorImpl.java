package com.aligunes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {
    private SelectService selectService; //interface i getirip sınıfın içine enjeckde edildi.

    @Autowired
    public MessageProcessorImpl(@Qualifier("aService") SelectService selectService) {
    this.selectService = selectService;
    }

    public void setSelectService(SelectService selectService) {
        this.selectService = selectService;
    }

    @Override
    public void processingMsg(String message) {
    selectService.sendMsg(message);
    }

}
