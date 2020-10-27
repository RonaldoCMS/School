import 'package:flutter/cupertino.dart';

class Centralizzato extends Center {
  String _testo;

  Centralizzato(String testo) {
    this._testo = testo;
  }

  Center getDisplay() {
    return Center(
        child: Text(
      _testo,
      textDirection: TextDirection.ltr,
    ));
  }
}
