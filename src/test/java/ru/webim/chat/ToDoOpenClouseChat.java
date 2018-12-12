package ru.webim.chat;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class ToDoOpenClouseChat {

    @Test
    public void testOpenClouse(){

        //выбираем браузер

        Configuration.browser = "chrome";

        open("http://cen.meckemerovo.ru/TestBot/");

        //открыть закрыть все элементарно

        $(".webim-html-button-element").click();
        $("div.webim-action-close").click();

    }

}
