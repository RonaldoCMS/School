let flag = 0; // 0 -> Server || 1 -> Locale
let obj;  //Contenuto JSON

if(flag == 0) {
  //live server
  const xhttp = new XMLHttpRequest();

xhttp.open("GET", "../venditaAutoveicoli.json", true);
xhttp.send();

console.log(xhttp);

xhttp.onreadystatechange = function () {
    if (this.readyState === 4 && this.status === 200) {
      obj = JSON.parse(this.responseText);
      console.log(obj);
      caricaFile();
    }
  }
}
else if(flag == 1) {
  obj = {
    "auto": [
       {
         "immagine" : "https://i.ebayimg.com/00/z/yTMAAOSwgMde9MUY/$_62.JPG",
         "id": "01",
         "nome": "RS6",
         "marca": "Audi",
         "cilindrata": 3966,
         "tipoMotore": "a scoppio",
         "alimentazione": "benzina",
         "cavalli": 600,
         "consumo": "12,5 l / 100km",
         "dimensioni": {
           "altezza": "1.460 mm",
           "lunghezza": "4.995 mm",
           "larghezza": "1.951 mm"
         },
         "prezzo": 90000,
         "usato": false
       },
       {
         "immagine" : "https://lh3.googleusercontent.com/nqFXAj7thz50_ncNx0ux5DJmv0QOtpuaBi6a7dL1fNF89hjE7_aB0non8xmM_HLGP1p6Ssc=s122",
         "id": "02",
         "nome": "A4",
         "marca": "Audi",
         "cilindrata": 1968,
         "tipoMotore": "a diesel",
         "alimentazione": "diesel",
         "cavalli": 122,
         "consumo": "4,9 l / 100km",
         "dimensioni": {
           "altezza": "1.428 mm",
           "lunghezza": "4.762 mm",
           "larghezza": "1.847 mm"
         },
         "prezzo": 30000,
         "usato": true
       },
       {
          "immagine" : "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.mkfp1nfYgUw9hHLMfWCERwHaEK%26pid%3DApi&f=1",
          "id": "03",
          "nome": "X3",
          "marca": "BMW",
          "cilindrata": 1597,
          "tipoMotore": "a Scoppio",
          "alimentazione": "Benzina",
          "cavalli": 122,
          "consumo": "4,4 l / 100 km",
          "dimensioni": {
            "altezza": "1.678 mm",
            "lunghezza": " 4.657 mm",
            "larghezza": "1.881 mm"
          },
          "prezzo": 48750 ,
          "usato": true
        },
        {
          "immagine" : "https://cdn.drivek.it/configurator-imgs/cars/it/800/HONDA/NSX/6980_TARGA-2-PORTE/honda-nsx-promo.jpg",
          "id": "04",
          "nome": "NSX",
          "marca": "Honda",
          "cilindrata": 3493,
          "tipoMotore": "ibrido",
          "alimentazione": "full Hybrid",
          "cavalli": 581,
          "consumo": "10,6 l / 100 km",
          "dimensioni": {
            "altezza": "1200 mm",
            "lunghezza": "4480 mm",
            "larghezza": "1930 mm"
          },
          "prezzo": 201000,
          "usato": false
        },
        {
          "immagine" : "https://cdn.drivek.it/configurator-imgs/cars/it/800/ABARTH/500/3642_BERLINA-3-PORTE/abarth-595-promo.jpg",
          "id": "05",
          "nome": "500 1.4 T-Jet 595",
          "marca": "Abarth",
          "cilindrata": 1368,
          "tipoMotore": "a Scoppio",
          "alimentazione": "Benzina",
          "cavalli": 165,
          "consumo": "6,8 L / 100 km",
          "dimensioni": {
            "altezza": "1.480 mm",
            "lunghezza": "3.660  mm",
            "larghezza": "1.620 mm"
          },
          "prezzo": 26700,
          "usato": false
        }
     ]
   };

   caricaFile();
}

function caricaFile() {
  for (let i = 0; i < obj.auto.length; i++) {
    document.getElementById("auto").innerHTML +=
      `

                <div class="card">
                <img src="
                ` +
      obj.auto[i].immagine +
      `" alt="Avatar" style="width:100%">
                <div class="container">
                <h4><b>` +
      obj.auto[i].nome +
      `</b></h4>
                <p>Marca : ` +
      obj.auto[i].marca +
      `</p>
                    <p>Cilindrata : ` +
      obj.auto[i].cilindrata +
      `</p>
                    <p>tipo motore: ` +
      obj.auto[i].tipoMotore +
      `</p>
                    <p> alimentazione:` +
      obj.auto[i].alimentazione +
      `</p>
                    <p> cavalli: ` +
      obj.auto[i].cavalli +
      `</p>
                    <p> consumo: ` +
      obj.auto[i].consumo +
      `</p>
                    <p> a partire da: ` +
      obj.auto[i].prezzo +
      `</p>
                </div>
            </div>
            
            `;
  }
}
