# QA.GURU.HW-5.Selenide
## 5. Selenide №2
### Домашнее задание №5

Разработайте следующий автотест:
1) На главной странице GitHub выберите: Меню -> Solutions -> Enterprize (с помощью команды hover для Solutions)
2) Убедитесь, что загрузилась нужная страница (например, что заголовок: "The AI-powered developer platform.")
   
(опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions():
1) Откройте https://the-internet.herokuapp.com/drag_and_drop
2) Перенесите прямоугольник А на место В
3) Проверьте, что прямоугольники действительно поменялись
4) В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
