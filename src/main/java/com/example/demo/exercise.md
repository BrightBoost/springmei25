## To do app
0. Maak een nieuw project met dependencies: web, data, h2 + configureer h2 in application.properties
1. Maak een ToDo entity met een id, name, completed (ja/nee), duedate
2. Maak een ToDoRepository
3. Maak een ToDoService 
4. Maak een controller aan die todo's kan:
   - allemaal laten zien
   - eentje laten zien obv id
   - alle kan laten zien obv completed

Om stap 4 te laten werken moet de controller kunnen aanroepen methodes nodig in de service en de service moet hiervoor methodes in de repo kunnen aanroepen.

