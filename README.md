Написал метод разворота строки вручную специально, т.к., исходя из условия, именно это и требуется.
Таким образом, не стал использовать готовые решения (например, reverse()).

Судя по условию, введенное значение нужно перебирать туда и обратно, и так до 100 000 повторений (в процессе замеряя затраченное время на 1 000, 10 000 и 100 000 повторениях).
<br>Для этого создал массив, куда помещаем введенную строку, далее переворачиваем ее (это уже - одно повторение), затем перезаписываем ячейку этого массива на получившуюся строку. И с каждым повторением уже берем для переворота обновленное значение,
т.е. обеспечиваем выполнение условия - переворот строки туда и обратно.

Далее все стандартно: отлавливаем повторения на нужных нам значениях и выводим под каждое из них затраченное время.

Примечание: не стал минусовать от итогового замера еще и накопившееся время перезаписи в массив, т.к., по факту, оно также является частью всей операции, хоть и не связано непосредственно со временем переворота строки.
В любом случае, его также можно учесть: по аналогии замерить разницу во времени при перезаписи в массив и далее в каждом из рассматриваемых повторений вычитать и это время (умноженное на кол-во этих повторений).