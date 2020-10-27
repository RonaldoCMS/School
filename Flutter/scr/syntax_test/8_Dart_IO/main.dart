import 'dart:convert';
import 'dart:io';

main(List<String> args) {
  print('1 + 1 = ...');
  var line = stdin.readLineSync(encoding: Encoding.getByName('utf-8'));
  print(line.trim() == '2' ? 'Yup!' : 'Nope :(');

  print("Scrivi 'Hello World' ");
  var hello = stdin.readLineSync(encoding: Encoding.getByName('utf-8'));
  print(hello);

  print("Inserisci primo numero: ");
  int tot = 1 + int.parse(line);
  print(tot);
}
