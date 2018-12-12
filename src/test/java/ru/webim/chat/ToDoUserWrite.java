package ru.webim.chat;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToDoUserWrite {


    @Test
    public void testUserWrite(){

        //выбираем браузер

        Configuration.browser = "chrome";

        open("http://cen.meckemerovo.ru/TestBot/");
        $(".webim-html-button-element").click(); //кликаем на иконку чата
        //заполняем поля чата
        $(".scroll-content > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(2)").setValue("Александр").pressEnter();
        $(".scroll-content > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > input:nth-child(2)").setValue("89137585529").pressEnter();
        $(".scroll-content > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > input:nth-child(2)").setValue("bannov.all@mail.ru").pressEnter();
        $(".scroll-content > div:nth-child(2) > label:nth-child(1) > textarea:nth-child(2)").setValue("Помогите").pressEnter();
        //выделяем чекбокс и отправляем вопрос
        $("div.webim-processing-personal-data-block:nth-child(5) > label:nth-child(1) > svg:nth-child(2)").doubleClick();
        $("button.webim-btn-send:nth-child(2)").doubleClick();



    }

}
