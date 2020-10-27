import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return materiale();
  }
}

MaterialApp materiale() {
  return MaterialApp(
    title: "LOGIN EXAMPLE",
    theme: ThemeData(primarySwatch: Colors.blue),
    home: LoginPage(),
  );
}

class LoginPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return app();
  }
}

Scaffold app() {
  return Scaffold(appBar: appBar("Login"), body: mainContainer());
}

AppBar appBar(String titolo) {
  return AppBar(title: Text(titolo));
}

Container mainContainer() {
  return Container(
    padding: const EdgeInsets.all(16.0),
    child: Column(children: <Widget>[
      textField("USERNAME"),
      textField("PASSWORD"),

    ]),
  );
}

Container textField(String text) {
  return Container(
    margin: EdgeInsets.only(bottom: 8.0),
    child: Row(children: <Widget>[
      Text(text),
      Flexible( child: TextField(),
      ),
    ],
    ),
  );
}

