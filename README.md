# Simple Calculator

Калькулятор, с поддержкой веб-формы и RESTful API.

Выполнил студент группы МПИ-23-1-1 Кирвяков Владислав
## Стек
Java 17, Spring Boot, Spring Web, Lombok, Maven

## Запуск (windows)
Запуск приложения с помощью Docker:

1. Перейдите в папку docker из корневого каталога проекта:

cd src/main/docker

2. В терминале и выполните следующую команду:

docker-compose up

Контейнер доступен по локальному адресу http://localhost:8080/

## Использование

1) Запрос: POST  `/api/dev/calculate`
```json
{
  "firstNumber": 17.0,
  "operand": "ADD",
  "secondNumber": 33.0
}
```
Ответ:
```json
{
  "result": 50.0
}
```