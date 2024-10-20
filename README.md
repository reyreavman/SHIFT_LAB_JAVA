# Shift_Lab Java
#### Упрощенная CRM-система.

Дает возможность управлять информацией о продавцах и их транзакциях. 
Включает в себя возможности создания, чтения, обновления и удаления данных о продавцах и транзакциях. 
Также включает в себя функции аналитики для обработки и анализа данных.

## Содержание
- [Разработка](#разработка)
- [Технологии](#технологии)
- [Тестирование](#тестирование)
- [Требования к запуску](#требования-к-запуску)
- [Запуск](#запуск)
- [Документация к API](#документация-к-api-и-примеры-запросов)
- [Функциональность](#функциональность)

### Разработка
- Для реализации задачи была выбрана Java. 
- Как основная БД была использована PostgreSQL, для тестирования использовался PostgresqlContainer.
- В качестве системы сборки использован Gradle.

### Технологии
- [Spring Boot](https://spring.io/projects/spring-boot) - инструмент для создания RESTful API
- [Spring Data JPA](https://spring.io/projects/spring-data) - механизм взаимодействия с сущностями БД
- [Spring Validation](https://docs.spring.io/spring-framework/reference/core/validation/beanvalidation.html) - API для валидации данных
- [Flyway](https://www.red-gate.com/products/flyway/community/) - инструмент миграций БД
- [Lombok](https://projectlombok.org/) - библиотека для автогенерации бойлерплейт Java кода
- [Docker](https://www.docker.com/) - платформа контейнеризации

### Тестирование
Для тестирования в проекте были использованы:

- [Spring Boot Test](https://spring.io/guides/gs/testing-web)
- [AssertJ](https://assertj.github.io/doc/)
- [TestContainers](https://testcontainers.com/)

Проект покрыт юнит-тестами. Написаны юнит тесты для всех основных сценариев использования контроллеров и слоя сервисов.
Также написаны интеграционные тесты с помощью TestContainers для тестирования слоя репозиториев.
```sh
./gradlew test
```

### Требования к запуску
Для установки и запуска проекта необходим Docker.

### Запуск
Для запуска Docker контейнера с PostgreSQL выполните команду:
```sh
$ docker compose up
```
Для запуска проекта выполните команду в терминале:
```sh
./gradlew bootRun
```

По умолчание проекта запускается на порту 8080.

### Документация к API и примеры запросов
Для генерации документации к API были использованы:

- [Spring Doc](https://spring.io/projects/spring-restdocs)
- [Swagger](https://swagger.io/)

Документация к API и примеры запросов/ответов доступны по URL: [/api-docs](localhost:8080/api-docs)  
UI для комфортного просмотра доступного API и примеров запросов: [/swagger-ui](localhost:8080/swagger-ui)

### Функциональность
Реализованный API имеет следующие методы:
- Получение списка продавцов
- Информация о конкретном продавце 
- Создание нового продавца 
- Обновить информации о продавце 
- Удаление продавца
- Получение списка всех транзакций 
- Получение информации о конкретной транзакции
- Создание новой транзакции
- Получение всех транзакций продавца 
- Получение самого продуктивного продавца 
- Получение список продавцов с суммой меньше указанной