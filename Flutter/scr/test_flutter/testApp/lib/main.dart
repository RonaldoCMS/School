import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: App(),
    );
  }
}

class App extends StatefulWidget {
  @override
  _AppState createState() => _AppState();
}

class _AppState extends State<App> {
  var usrCtrl = new TextEditingController();
  var pswCtrl = new TextEditingController();
  var testo = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: <Widget>[
          Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Row(
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Icon(Icons.arrow_forward_ios),
                  Text("Username",
                      style: TextStyle(
                          fontSize: 20,
                          decoration: TextDecoration.none,
                          fontStyle: FontStyle.italic)),
                  Flexible(
                      child: TextField(
                    textAlign: TextAlign.center,
                    controller: usrCtrl,
                  )),
                ],
              ),
              Row(
                crossAxisAlignment: CrossAxisAlignment.center,
                children: [
                  Icon(Icons.arrow_forward_ios),
                  Text("Password",
                      style: TextStyle(
                          fontSize: 20,
                          decoration: TextDecoration.none,
                          fontStyle: FontStyle.italic)),
                  Flexible(
                      child: TextField(
                    textAlign: TextAlign.center,
                    obscureText: true,
                    controller: pswCtrl,
                  )),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.end,
                children: [
                  RaisedButton(
                    child: Text("Login"),
                    onPressed: controllo,
                  )
                ],
              ),
              Row(
                children: <Widget>[
                  Text(testo),
                ],
              )
            ],
          )
        ],
      ),
    );
  }

  controllo() {
    setState(() {
      testo = (usrCtrl.text == "1") ? "0" : "1";
    }); 
  }
}
