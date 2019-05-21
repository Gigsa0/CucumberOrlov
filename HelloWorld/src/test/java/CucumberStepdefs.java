import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CucumberStepdefs {

    private Main main = new Main();

    @Пусть("Чтение файла {string}")
    public void ReadXML(String fileName) throws ParserConfigurationException, SAXException, IOException {
        Assert.assertTrue("Ошибка! Некорректный файл или файл не найден!", main.ReadXML(fileName));
    }

    @Пусть("Чтение строки {string}")
    public void ReadString(String stringXML){
        Assert.assertTrue("Ошибка! Некорректная строка!", main.ReadXMLString(stringXML));
    }

    @Тогда("Строка корректна {string}")
    public void ChekStringJSON(String fileName) throws IOException {
        Assert.assertTrue("Ошибка! Не окректный JSON строки!", main.ChekJSON(fileName));
    }

    @Тогда("Результат {string}")
    public void ChekJSON(String fileName) throws IOException {
        Assert.assertTrue("Ошибка! Не корректный JSON файл!", main.ChekJSON(fileName));
    }

    @Тогда("Проверка подстроки {string}")
    public void ChekSubstring(String subString) throws IOException {
        String file = "src/main/resources/XML/XMLString.json";
        String fileString = readFile(file, StandardCharsets.UTF_8);
        System.out.println(fileString);
        Assert.assertTrue("Ne soderjit podstroky", fileString.contains(subString));
    }

    static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
