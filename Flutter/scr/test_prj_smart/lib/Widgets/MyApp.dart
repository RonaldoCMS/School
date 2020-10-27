import 'package:flutter/cupertino.dart';
import 'Display/Centralizzato.dart';

class MyApp extends StatelessWidget {
  String titolo;
  Centralizzato centro;

  MyApp({String titolo}) {
    this.titolo = titolo;
    centro = new Centralizzato(titolo);
  }

  @override
  Widget build(BuildContext context) {
    return centro.getDisplay();
    throw UnimplementedError();
  }
}
