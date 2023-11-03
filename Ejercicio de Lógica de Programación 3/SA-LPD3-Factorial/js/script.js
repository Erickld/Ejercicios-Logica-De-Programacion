const btn = document.getElementById('calcular');

function calcFactorial(num) {
    if (num === 0) {
        return 1;
    } else {
        return num*calcFactorial(num-1);
    }
}

btn.addEventListener('click', () => {
    let numero = document.getElementById('numero').value;
    numero = parseInt(numero);
    let resultado = document.getElementById('resultado');

    if (isNaN(numero) || numero < 0) {
        resultado.textContent = '';
        return alert('Error: Ingresa un número entero válido.')
    }

    resultado.textContent = `El factorial de número ${numero} es ${calcFactorial(numero)}`;

});
