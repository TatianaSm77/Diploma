# Отчёт по итогам тестирования
Отчёт по результату автоматизированного тестированию функционала покупки и оформления кредита по данным карты веб-сервиса покупки тура
"Путешествие дня".

### Краткое описание.
Выполнена автоматизация тестирования веб-сервиса "Путешествие дня". В ходе тестирования были проверены:

1) Возможность оплаты двумя способами (покупка по карте и покупка в кредит);
2) Взаимодействие с банковскими сервисами;
3) Взаимодействие с СУБД (MySQL и PostgreSQL);
4) Обработка ответа и демонстрация соответствующих уведомлений;
5) Выдача сообщений об ошибках при неверном заполнении формы.
## Количество тест-кейсов
Всего было проведено 50 автотестов. Общий процент успешных тестов равен 56%.
Из них успешных — 28, неуспешных — 22. Количество успешных и неуспешных сценариев не зависит от типа подключенной СУБД.
![2023-07-19_14-01-28](https://github.com/TatianaSm77/Diploma/assets/125288096/6fa9bb0a-59e0-46e0-a77c-109d75f2a391)


### Общие рекомендации.
1) Устранить найденные [ошибки](https://github.com/TatianaSm77/Diploma/issues)
2) Добавить в код страницы специально подготовленные CSS атрибуты для тестирования (data-test-id).
3) Подсказки об ошибках при заполнении полей формы должны быть более информативные и приведены к единому формату.
