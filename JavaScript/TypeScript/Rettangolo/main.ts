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


 class Rettangolo {

    _base:number;
    _altezza:number;

    constructor(base:number, altezza:number) {
        this._base = base;
        this._altezza = altezza;
    }

    public get base() : number {
        return this._base; 
    }

    public get altezza() : number {
        return this._altezza; 
    }
    
    public set base(v : number) {
        this._base = v;
    }

    public set altezza(v : number)  {
        this._altezza = v;
    }

    public ridimensiona(base:number, altezza:number): void {
        this.base = base;
        this.altezza = altezza;
    }

    public perimetro(): number{
        return (this.base + this.altezza) / 2;
    }

    public area(): number {
        return this.base * this.altezza;
    }

 }

 
 let ret = new Rettangolo(2,2);
 console.log(ret.area());