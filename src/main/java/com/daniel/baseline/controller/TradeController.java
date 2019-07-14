package com.daniel.baseline.controller;

import com.daniel.baseline.config.WebConfig;
import com.daniel.baseline.model.Trade;
import com.daniel.baseline.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = WebConfig.TRADE)
@RestController
public class TradeController extends CrudController<Trade, TradeRepository> {

    @Autowired
    public TradeController(TradeRepository repository) {
        super(repository);
    }

    public TradeController() {}
}
