const btn = document.getElementById('adivinar');
const NUMERO_RANDOM = Math.floor((Math.random()*100) + 1);
let numerosHistorial = [];


btn.addEventListener('click', () => {
    let numero = document.getElementById('numero').value;
    numero = parseInt(numero);
    
    if (isNaN(numero)) {
        resultado.textContent = '';
        return alert('Error: Número ingresado inválido, vuelva a ingresar el número')
    };
    
    if (numero < 1 || numero > 100) {
        resultado.textContent = '';
        return alert('Error: El número a ingresar debe de estar en el rango del 1 al 100')

    };

    numerosHistorial.push(numero);

    if (numero === NUMERO_RANDOM) {
        let random = document.getElementById('num-random');
        let resultado = document.getElementById('resultado');
        random.textContent = `Número secreto: ${NUMERO_RANDOM}`;
        resultado.textContent = `Historial de números ingresados: ${numerosHistorial}`;
        btn.disabled = true;
        document.getElementById('numero').disabled = true;
        return alert(`Felicidades, adivinaste el número secreto ${NUMERO_RANDOM}!!`)
    };


    if (numero < NUMERO_RANDOM) {
        return alert(`El número ingresado ${numero} en menor al número a adivinar`)
    };

    if (numero > NUMERO_RANDOM) {
        return alert(`El número ingresado ${numero} en mayor al número a adivinar`)
    };
    
    
});
