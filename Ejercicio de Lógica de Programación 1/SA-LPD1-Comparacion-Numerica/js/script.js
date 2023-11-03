let numeroUno, numeroDos, numeroTres;

do {
    numeroUno = prompt('Ingresa el primer número:');
    numeroUno = parseFloat(numeroUno);
} while (isNaN(numeroUno));

do {
    numeroDos = prompt('Ingresa el segundo número:');
    numeroDos = parseFloat(numeroDos);
} while (isNaN(numeroDos));

do {
    numeroTres = prompt('Ingresa el tercer número:');
    numeroTres = parseFloat(numeroTres);
} while (isNaN(numeroTres));


const resultado = (numeroUno, numeroDos, numeroTres) => {
    let arrNumeros = [numeroUno, numeroDos, numeroTres];

    const MENOR_MAYOR = arrNumeros.sort((a,b) => a-b); //Ordenando arreglo de menor a mayor
    document.getElementById('mayor-menor').textContent = `Menor a mayor: ${MENOR_MAYOR[0]}, ${MENOR_MAYOR[1]}, ${MENOR_MAYOR[2]}`;

    const MAYOR_MENOR = arrNumeros.reverse(); //Ordenando arreglo de mayor a menor
    document.getElementById('menor-mayor').textContent = `Mayor a menor: ${MAYOR_MENOR[0]}, ${MAYOR_MENOR[1]}, ${MAYOR_MENOR[2]}`;

    if (numeroUno === numeroDos && numeroDos === numeroTres) {
        document.getElementById('num-iguales').textContent = 'Los 3 números ingresados son iguales.';
    } else {
        document.getElementById('num-iguales').textContent = '';
    }
};

resultado(numeroUno, numeroDos, numeroTres);
