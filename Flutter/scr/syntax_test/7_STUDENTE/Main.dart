import 'Persona.dart';
import 'Studente.dart';

main(List<String> args) {
  var fabio = new Persona(nome: "Fabio", cognome: "Danubbio");

  print(fabio.getNome);
  print(fabio.getCognome);

  var fabio_scuola = new Studente(
      nome: fabio.getNome, cognome: fabio.getCognome, classe: "5 A INF");
  fabio_scuola.prs();
}
