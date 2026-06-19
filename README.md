# Sistema di Catalogo Bibliotecario e Prestiti

## Scelte di Modellazione del Database
<img width="1514" height="753" alt="progettobackend2-DrawSQL-06-19-2026_04_22_PM" src="https://github.com/user-attachments/assets/d77b5466-514e-472e-bb0c-3f563f4b8973" />

Per la gestione dell’ereditarietà tra le entità **Book** e **Magazine**, ho scelto la strategia **JOINED**. Ho preferito questa strategia rispetto a *SINGLE_TABLE* per i seguenti motivi:

* **Struttura ordinata e assenza di valori NULL:** Mi garantisce una struttura pulita nel database. Evita di avere campi vuoti (*null*) nelle tabelle (ad esempio, una rivista non avrà colonne inutilizzate dedicate all'autore o al genere di un libro).
* **Separazione dei dati:** I campi comuni (come ISBN, titolo, anno di pubblicazione e numero di pagine) sono definiti in una tabella base (**CatalogItem**), mentre quelli specifici (come autore/genere per i libri o la periodicità per le riviste) sono salvati solo nelle relative tabelle figlie (**Book** e **Magazine**).
* **Gestione efficiente dei Prestiti:** In questo modo ogni elemento ha un ID univoco, utile per collegarlo facilmente alla tabella dei prestiti (**loans**), tramite una relazione `@ManyToOne` verso la superclasse `CatalogItem`. Questo permette di gestire il prestito di qualsiasi articolo del catalogo in modo polimorfico e centralizzato.
