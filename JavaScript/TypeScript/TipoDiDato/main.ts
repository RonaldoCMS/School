console.log("Hello World");

let num1: number = 5;
let num2: number = 15;

let tot: number = num1 + num2;

function somma() {
    document.getElementById('5').innerHTML += tot;
}

//Primitive
let str:string;
let num:number;
let bool:boolean;
let car:CharacterData;

//Obj
let arr: string[] = ['uno', 'due'];
let nums: number[] = [1,2,3,4];
let mioObj: {nome:string, eta:number};

//func

let funz: () => void = () => {

    console.log("Hello World by funz");

};

funz();

function funz2(text:string): void {
    console.log(text);
}

funz2("Hello World by funz2");

/***
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */