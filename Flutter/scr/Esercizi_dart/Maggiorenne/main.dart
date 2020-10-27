/*
Scrivi un programma che stabilisce se una persona è maggiorenne o minorenne in base all'età.
*/

main(List<String> args) {
  int eta = 20;

  /*
  if (maggiorenne(eta)) {
    print("Maggiorenne");
  } else {
    print("Minorenne");
  }
  */

  if (maggiorennee(eta, risultato: (e) => print(e)));
  else;
}

bool maggiorennee(int eta, {Function risultato}) {
  if (eta >= 18) {
    try {
      risultato("Maggiorenne");
    } catch (e) {}
    return true;
  } else {
    try {
      risultato("Minorenne");
    } catch (e) {}
    return false;
  }
}

bool maggiorenne(int eta) {
  if (eta >= 18) {
    return true;
  } else {
    return false;
  }
}
