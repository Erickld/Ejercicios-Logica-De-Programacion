const btn = document.getElementById('obtener-serie');

function calcFibonacci(num) {
    let arrFibo = [];
    for (let index = 0; index < num; index++) {

        if ([0,1].includes(index)) {
            arrFibo.push(index)
        } else {
            arrFibo.push(arrFibo[index-1]+arrFibo[index-2])
        }
    }
    return arrFibo;
}

btn.addEventListener('click', () => {
    let numero = document.getElementById('numero').value;
    numero = parseInt(numero);
    
    if (isNaN(numero) || numero <= 0) {
        resultado.textContent = '';
        return alert('Error: Número ingresado inválido.')
    }
    
    let resultado = document.getElementById('resultado');
    resultado.textContent = `Serie Fibonacci con ${numero} número(s): ${calcFibonacci(numero)}`;

});
