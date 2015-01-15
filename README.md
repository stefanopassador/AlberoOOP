# AlberoOOP
Esercitazione di programmazione orientata agli oggetti

ESERCIZIO 1
Una versione meno elegante di un albero di ricerca prevede di organizzare i nodi come oggetti NodoAlbero, ciascuno dei
quali è costituito da un campo per il dato più due campi che contengono un riferimento sx e dx ancora di tipo NodoAlbero,
rispettivamente al figlio sinistro e a quello destro.

All'interno di un package denominato alberi si realizzi un albero di ricerca Albero come sopra, in cui il tipo di dato
E sia generico, dotando la classe di:
- un costruttore Albero(E x) in grado di ricevere il dato da assegnare al nodo padre;
- un metodo trovaInserisci(E x) in grado di trovare e restituire il dato x, ovvero di inserirlo correttamente
nell'albero di ricerca in tal caso restituendo un riferimento nullo;
- un metodo ribalta() in grado di ristrutturare l'albero di ricerca in una sua versione speculare, nella quale l'ordine
di ricerca è a sua volta rovesciato;
- un metodo toString(String separatore) in grado di stampare i dati secondo l'ordinamento dato dall'albero, interponendo
il separatore tra stampe di dati adiacenti.

Nota bene: l'assenza di riferimenti di tipo Albero nei nodi impone di codificare eventuali procedure ricorsive come
parti di metodi interni alla classe NodoAlbero

ESERCIZIO 2
Si progetti una classe UsaAlbero, il cui metodo main()
i) costruisce un albero di dati String
ii) cerca ed eventualmente aggiunge delle stringhe liberamente scelte dal programmatore e/o l'utente
iii) visualizza l'albero corrispondente
iv) lo ribalta
v) visualizza l'albero risultante.
