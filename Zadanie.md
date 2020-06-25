Celem zadania jest stworzenie encji reprezentującej nagłówki faktur,
a także pozycje faktury. Pozycje będą posiadały również relację
do listy towarów. Aby zrealizować zadanie:

W katalogu src/main/java utwórz pakiet
 com.kodilla.hibernate.invoice
 
W utworzonym pakiecie stwórz klasę:
reprezentującą pozycję asortymentu sklepu o nazwie Product
 (powinna zawierać pola: int id, String name),
 a następnie zrób z niej encję i dopisz kontroler repozytorium 
 (w podpakiecie repository).

W utworzonym pakiecie stwórz klasę 
reprezentującą pozycję faktury o nazwie Item
 (powinna zawierać pola: 
 int id, Product product, BigDecimal price, int quantity, BigDecimal value).
  Zrób z niej encję (zauważ, że występuje tu relacja N:1 z encją Product).
  Napisz kontroler repozytorium (w podpakiecie repository).

W utworzonym pakiecie stwórz klasę
 reprezentującą nagłówek faktury o nazwie Invoice
  (powinna zawierać pola: int id, String number, List<Item> items).
  Utwórz z niej encję – zauważ, że występuje tu relacja 1:N z encją Item.
   Napisz kontroler repozytorium (w podpakiecie repository)

W katalogu src/test/java utwórz pakiet
 com.kodilla.hibernate.invoice.repository.

W utworzonym pakiecie stwórz zestaw testów InvoiceRepositoryTestSuite.

Napisz test o nazwie testInvoiceRepositorySave(),
który sprawdza czy faktura z kilkoma pozycjami zapisuje się
poprawnie w bazie danych.
