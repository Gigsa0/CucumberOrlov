# language: ru
@pow
Функция: Проверка перевода XML в JSON

  Сценарий: Чтение файла
    Пусть Чтение файла "src/main/resources/XML/test"
    Пусть Чтение строки "<root><d>Hello!</d></root>"
    Тогда Строка корректна "src/main/resources/XML/StringXML"
    Тогда Результат "src/main/resources/XML/test"