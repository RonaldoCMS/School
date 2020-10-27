import 'Persona.dart';


class Studente extends Persona {
  String _classe;

  Studente({String nome, String cognome, String classe})
      : super(nome: nome, cognome: cognome) {
    this.classe = classe;
  }

  String get classe => _classe;
  set classe(String value) => _classe = value;

  void prs() {
    print("Mi chiamo $getNome $getCognome e frequento la $classe");
  }
}
