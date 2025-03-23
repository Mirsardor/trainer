package ru.spbu.mirsardor.gui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.spbu.mirsardor.domain.service.QuestionService;
import ru.spbu.mirsardor.gui.config.SpringConfig;
import ru.spbu.mirsardor.gui.controller.MainController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        QuestionService questionService = context.getBean(QuestionService.class);
        SwingUtilities.invokeLater(new MainController(questionService));
    }
}