class Televisore {
  bool _status;
  bool _mute;
  int _volume;
  int _canale;

  Televisore({bool status}) {
    try {
      this._status = status;
    } catch (e) {
      this._status = false;
    }
    this._mute = false;
    this._canale = 1;
    this._volume = 3;
  }

  void pulsanterosso() => _status = !_status;
  void canaleSuccessivo() => canale++;
  void canalePrecedente() => canale--;
  void aumentaVolume() => volume++;
  void diminuisciVolume() => volume--;
  void impostaCanale(value) => canale = value;
  void pulsanteSilenzioso() => _mute = !_mute;

  bool get status => _status;

  set status(bool value) => _status = value;

  bool get mute => _mute;

  set mute(bool value) => _mute = value;

  int get volume => _volume;

  set volume(int value) {
    if (this._test(value, 0, 11)) {
      this._volume = value;
    }
  }

  int get canale => _canale;

  set canale(int value) {
    if (this._test(value, 0, 100)) {
      this._canale = value;
    }
  }

  bool _test(int value, int min, int max) {
    if (!(value <= min || value >= max)) {
      return true;
    }
    return false;
  }
}
