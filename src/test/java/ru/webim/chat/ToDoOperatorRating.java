package ru.webim.chat;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToDoOperatorRating {


    @Test
    public void testOperatorRating(){

        //выбираем браузер

        Configuration.browser = "chrome";

        open("http://demo.webim.ru/webim/client.php");
        //внимание в моем случае оператор был выключен!!! Поэтому что-то может пойти не так...
        $("button.webim-action:nth-child(1)").click();
        $("li.webim-chat-action:nth-child(4)").click();
        $("ul.webim-form-control > li:nth-child(4) > svg:nth-child(1)").click();
        $(".webim-js-button-style").click();


}}
