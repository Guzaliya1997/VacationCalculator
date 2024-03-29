 Приложение "Калькулятор отпускных".
 Микросервис на SpringBoot + Java 11 c одним API:
 GET "/calculacte"
 При запросе указать точные дни ухода в отпуск,
 должен проводиться рассчет отпускных с учётом праздников и выходных.
 запрос в формате:
 http://localhost:8080/calculate?averageSalary=XXXXX&startDate=yyyy-mm-dd&endDate=yyyy-mm-dd
