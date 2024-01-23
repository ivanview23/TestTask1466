# Тестовое задание #1466
## Разработка приложения, реализующего создание обьектов, требуемого типа фигур.
Приложение написанно на Java 8, все объекты, описанные в полученном на вход файле, созданы с помощью модуля фабрики
## Поддерживаемые фигуры:
- Point
- Line
- Rect
- Rhomb
- Square
- Circle
#### Для запроса фигур используется файл с расширением `.txt src/main/resources/Figure.txt`
## Пример ввода:
```
point 1 2
rect 1 2 3 4
line 10 10 20 20
circle 10 10 5

```

## Поддерживаемые записи во входном файле:
```
роint x y — точка в координатах (x, y)
rеct x1 y1 x2 y2 — прямоугольник, заданный точками (x1, y1) и (x2, y2)
rhomb x y h w — ромб с центром в (x, y), высотой h и шириной w
square x y l — квадрат, заданный точкой (x, y) и длиной стороны l
linе x1 y1 x2 y2 — линия, заданная точками (x1, y1) и (x2, y2)
сirclе x y r — круг с центром в (x, y) и радиусом r

```

## Пример вывода Draw:
```
роint at (10, 20)
circle at (-100, 300), rаdius = 50
rect at (100, 200), (200, 300)

```

## Пример вывода Perimeter:
```
circle at (10.0, 10.0), rаdius = 7.072
circle perimeter = 44.43468666015318

```
## Пример вывода Square:
```
rect at (7.0, 3.0), (4.0, 9.0)
rect square = 18.0

```
## Пример вывода Intersect:
```
line at (20.0, 10.0), (20.0, 40.0)
line at (10.0, 30.0), (30.0, 30.0)
lines intersect

```

## Установка и использование приложения:
### Скачать:
#### SSH
```
git clone git@github.com:ivanview23/TestTask1466.git
```
#### HTTPS
```
git clone https://github.com/ivanview23/TestTask1466.git
```
#### Запустить через Maven из корневой директории:
```
mvn -f pom.xml package
```
```
java -jar target/TestTask1466-1.0-SNAPSHOT.jar
```
