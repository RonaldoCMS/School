/*
Scrivi un programma che consenta di calcolare l'area del cerchio in base al valore del raggio.
Il programma dovrà quindi richiedere all'utente il valore del raggio (un numero reale) e mostrare l'area del cerchio corrispondente.
*/

import 'dart:math';

main(List<String> args) {
  
  double raggio = 5;
  double area = 5;

  area = pow(raggio, 2) * 3.14;
  print(area);
}
