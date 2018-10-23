package com.skysoft.sseries.uaa.application.cucumber.stepdefs;

import com.skysoft.sseries.uaa.application.SseriesHcmApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SseriesHcmApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
