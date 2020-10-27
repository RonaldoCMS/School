main(List<String> args) {
  var n = valore();
  //print(n);

  var s = valore2();

  var tot = somma(n, s);
  print(tot);

  int x = 10, y = 10;
  value(x, y, res : (e) => print(e));
}

int value(int x, int y, {Function res}) {
  int tot = x + y;
  try {
    res(tot);
  } catch (e) {
    print("funzione non utilizzata");
  }
}

int valore() {
  return 5;
}

int valore2() {
  return 2;
}

int somma(int n1, int n2) {
  return (n1 + n2);
}
