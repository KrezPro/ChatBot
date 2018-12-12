package ru.webim.chat;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToDoAttachFile {


    @Test
    public void testAttachFile() {

        //выбираем браузер

        Configuration.browser = "chrome";

        open("http://cen.meckemerovo.ru/TestBot/");
        //открываем чат
        $(".webim-html-button-element").click();
        //заполняем поля
        $(".scroll-content > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(2)").setValue("Александр").pressEnter();
        $(".scroll-content > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > input:nth-child(2)").setValue("89137585529").pressEnter();
        $(".scroll-content > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > input:nth-child(2)").setValue("bannov.all@mail.ru").pressEnter();
        $(".scroll-content > div:nth-child(2) > label:nth-child(1) > textarea:nth-child(2)").setValue("Помогите").pressEnter();
        //подгружаем фаил
        $("input.webim-fileupload:nth-child(1)").uploadFile(new File("src/test/resources/XML.pdf"));

        Configuration.timeout = 100000; //увеличиваем время таймаута с 4 с до 100 чтобы дождаться загрузки файла (пропадает селектор загрузки)
        $(".webim-attached-file").should(disappear);
        Configuration.timeout = 4000; //уменьшили обратно
        $("div.webim-processing-personal-data-block:nth-child(5) > label:nth-child(1) > svg:nth-child(2)").doubleClick();
        $("button.webim-btn-send:nth-child(2)").doubleClick();
    }
}