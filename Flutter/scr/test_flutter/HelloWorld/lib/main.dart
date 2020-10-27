import 'package:flutter/material.dart';

void main() => runApp(MyApp("Hello World"));

class MyApp extends StatelessWidget {
  
  String _titolo;

    MyApp(String titolo) {
      this._titolo = titolo;
    }
  
  @override
  Widget build(BuildContext context) {

    return Center(
      child: Text(this._titolo, textDirection: TextDirection.rtl,),
    );

    throw UnimplementedError();
  }
}
