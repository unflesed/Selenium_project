Тест кейс №1
Название: Alerts
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Alerts, Frame & Windows".
3. Кликнуть по кнопке меню "Alerts".
4. Кликнуть по кнопке справа от "Click Button to see alert".
5. Получить текст с алерта.
   Ожидаемый результат: текст совпадает с "You clicked a button".
6. Нажать кнопку "Ок" на алерте.
   Ожидаемый результат: алерт отсутствует.
7. Кликнуть по кнопке справа от "On button click, alert will appear after 5 seconds"
8. Получить текст с алерта.
   Ожидаемый результат: текст совпадает с "This alert appeared after 5 seconds"
9. Нажать кнопку "Ок" на алерте.
   Ожидаемый результат: алерт отсутствует.
10. Кликнуть по кнопке справа от "On button click, confirm box will appear"
11. Получить текст с алерта.
    Ожидаемый результат: текст совпадает с "Do you confirm action?"
12. Нажать кнопку "Ок" на алерте.
    Ожидаемый результат: алерт отсутствует, появился текст "You selected Ok".
13. Кликнуть по кнопке справа от "On button click, prompt box will appear".
14. Получить текст с алерта.
    Ожидаемый результат: текст совпадает с "Please enter your name".
15. Отправить случайно сгенерированный текст из 10 символов на алерт.
16. Нажать кнопку "Ок" на алерте.
    Ожидаемый результат: алерт отсутствует, появился текст с сгенерированным 
случайным текстом "You entered random".

Тест кейс №2
Название: Iframe
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Alerts, Frame & Windows".
3. Кликнуть по кнопке меню "Nested frames".
4. Переключиться на родительский Iframe. 
5. Получить текст с родителького Iframe.
   Ожидаемый результат: текст совпадает с "Parent frame".
6. Переключиться на дочерний Iframe.
7. Получить текст с дочернего Iframe.
   Ожидаемый результат: текст совпадает с "Child Iframe".
8. Кликнуть по кнопке меню "Frames".
9. Сравнить текст верхнего и нижнего Iframe.
   Ожидаемый результат: текст совпадает.

Тест кейс №3
Название: Tables
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Elements".
3. Кликнуть по кнопке меню "Web tables".
4. Кликнуть по кнопке "Add".
5. Заполнить поля тестовыми данными.
6. Кликнуть кнопку "Submit".
7. Проверить таблицу на наличие новой строчки.
   Ожидаемый результат: данные появились в таблице.
8. Кликнуть кнопку удалить рядом с новой строчкой в таблице.
   Ожидаемый результат: количество строк в таблице уменьшилось.
9. Проверить таблицу на наличие добавленной строчки.
   Ожидаемый результат: данные отсутствуют в таблице.
10. Повторить шаги 1-9 с использованием других тестовых данных.

Тест кейс №4
Название: Handles
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Alerts, Frame & Windows".
3. Кликнуть по кнопке меню "Browser Windows".
4. Кликнуть по кнопке "New Tab".
5. Закрыть новую вкладку.
6. Кликнуть по кнопке меню "Elements".
7. Кликнуть по кнопке меню "Links".
8. Кликнуть по ссылке "Home".
9. Сравнить идентификаторы текущей и первой вкладки.
   Ожидаемый результат: идентификаторы не равны. 
10. Переключиться на исходную вкладку.
    Ожидаемый результат: открыта страница "Links".

Тест кейс №5
Название: Slider progress bar
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Widgets".
3. Кликнуть по кнопке меню "Slider".
4. Установить случайное значение на слайдере.
   Ожидаемый результат: случайное значение совпадает с установленным на слайдере.
5. Кликнуть по кнопке меню "Progress bar".
6. Кликнуть по кнопке "Start".
7. Кликнуть по кнопке "Stop", когда значение будет равно возрасту заданному в
тестовых данных.
   Ожидаемый результат: значение в пределах погрешности в 2%.

Тест кейс №6
Название: Date picker
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Widgets".
3. Кликнуть по кнопке меню "Date Picker".
4. Сравнить значения "Select Date" с текущей датой
   Ожидаемый результат: даты совпадают.
5. Сравнить значения "Date And Time" с текущей датой и временем
   Ожидаемый результат: даты и время совпадают.
6. В "Date and time picker" выбрать ближайший будущий високосный год.
   Ожидаемый результат: выбранное значение совпадает с фактическим високосным годом.

Тест кейс №7
Название: Files
Предусловия: укажите путь к папке Downloads и к полученному файлу в TestCase7_Files.
Шаги:
1. Открыть "https://demoqa.com/".
2. Кликнуть по кнопке "Elements".
3. Кликнуть по кнопке меню "Upload and Download".
4. Кликнуть по кнопке "Download".
5. Отправить скачанный файл.
   Ожидаемый результат: путь к файлу отображен, путь содержет имя файла.

