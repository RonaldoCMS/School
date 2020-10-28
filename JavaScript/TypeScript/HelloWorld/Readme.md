Appunti

Per inizializzare il progetto bisogna scrivere npm init.

Per installare Typescript, si può fare in maniera globale (npm i -g typescript) dove sarà disponibile in tutti i progetti.
Per installarlo nello specifico progetto si utilizza npm i --save-dev typescript.

verrà importato il file package-lock.json e node_modules, dove all'interno sono installate le librerie che importiamo con node. (In questo caso Typescript).

Come convertire codice typescript in Javascript.
*** Se è solo un singolo progetto ***
Aprire package.json e inserire nuova stringa:
"compile": "tsc nome.ts"
inoltre usare il comando 'npm run compile'.