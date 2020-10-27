/*Creare una classe Televisione sapendo che lo stato di una televisione è caratterizzato dal fatto di essere accesa o spenta,
dal volume (che è compreso tra zero e 10), dal canale (che è compreso tra 0 e 99) e dal fatto che sia in modalità silenzioso o meno.

Creare un opportuno costruttore, e iseguenti metodi: pulasanterosso(), canaleSuccessivo(), canalePrecedente(), aumentaVolume(), abbassaVolume(), impostaCanale(int c), print(), pulsanteSilenzioso().
Si rendano esplicitino le scelte implementative fatte nei commenti all’inizio del codice.
Testare la classe con un opportuno main.

Si rispettino i dettami della programmazione orientata agli oggetti con gli attributi privati e i metodi pubblici */

import 'backend/Televisore.dart';

import 'dart:io';
import 'dart:convert';


var televisore = new Televisore();
main(List<String> args) {
  darshboard();
}

void darshboard() {
  int x = 1;
  while (x != 0) {
    print("1. Accendi Televisore");
    print("2. Canale successivo");
    print("3. Canale precedente");
    print("4. Alza volume");
    print("5. Abbassa volume");
    print("6. Inserisci numero canale");
    print("99. Spegni Televisore");
    print("0. shutdown");

    String str = stdin.readLineSync(encoding: Encoding.getByName('utf-8'));
    x = int.parse(str);
    selezione(x);
    clearConsole();
    informazioni();
  }

  print("Programma chiuso");
}

void selezione(int value) {
  switch (value) {
    case 1:
      televisore.status = true;
      break;

    case 2:
      televisore.canaleSuccessivo();
      break;

    case 3:
      televisore.canalePrecedente();
      break;

    case 4:
      televisore.aumentaVolume();
      break;

    case 5:
      televisore.diminuisciVolume();
      break;

    case 6:
      print("Inserisci canale : ");
      String std = stdin.readLineSync(encoding: Encoding.getByName('utf-8'));
      int canale = int.parse(std);
      televisore.canale = canale;
      break;

    case 99:
      televisore.status = false;
      break;

    default:
      print("Errore, inserisci valore selezionabile");
      break;
  }
}

void informazioni() {
  if (televisore.status == false) {
    print("Televisore spenta.");
  } else {
    print("Canale occorente : " + televisore.canale.toString());
    print("Volume attuale: " + televisore.volume.toString());
    print("Muto: " + televisore.mute.toString());
  }
}

void clearConsole() {
  for (int i = 0; i < 50; i++) {
    print("");
  }
}
