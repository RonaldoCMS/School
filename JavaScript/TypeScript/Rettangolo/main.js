/***
Esercizio 1.

Scrivere una classe Rettangolo i cui oggetti rappresentano rettangoli. Lo stato interno di
un rettangolo `e dato dai valori della base e dell’altezza. Un rettangolo deve mettere a disposizione tre
operazioni: ridimensiona() che prende come parametri due nuovi valori di base e altezza e aggiorna
lo stato, perimetro() che restituisce il perimetro e area() che restituisce l’area. Prevedere inoltre un
costruttore che inizializza base e altezza del rettangolo.
Per testare la classe, scrivere un programma TestRettangolo che crea tre rettangoli (oggetti della
classe Rettangolo) ne calcola la somma delle aree e la somma dei perimetri (stampando i risultati),
ridimensiona uno dei tre rettangoli e ristampa le somme.
 */
var Rettangolo = /** @class */ (function () {
    function Rettangolo(base, altezza) {
        this._base = base;
        this._altezza = altezza;
    }
    Object.defineProperty(Rettangolo.prototype, "base", {
        get: function () {
            return this._base;
        },
        set: function (v) {
            this._base = v;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Rettangolo.prototype, "altezza", {
        get: function () {
            return this._altezza;
        },
        set: function (v) {
            this._altezza = v;
        },
        enumerable: false,
        configurable: true
    });
    Rettangolo.prototype.ridimensiona = function (base, altezza) {
        this.base = base;
        this.altezza = altezza;
    };
    Rettangolo.prototype.perimetro = function () {
        return (this.base + this.altezza) / 2;
    };
    Rettangolo.prototype.area = function () {
        return this.base * this.altezza;
    };
    return Rettangolo;
}());
var ret = new Rettangolo(2, 2);
console.log(ret.area());
