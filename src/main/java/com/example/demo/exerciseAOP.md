1. Maak een custom annotation voor het loggen
2. In je ToDo controller annotate the CRUD operations
3. Maak een aspect (bijv ToDoLogAspect) en geef deze twee advices:
   - Reguliere logging, voer deze op endpoints met de annotatie
   - Foutmelding logging, voor deze uit nadat een NoSuchElement exception gethrowd is (hiervoor is geen annotatie nodig)
