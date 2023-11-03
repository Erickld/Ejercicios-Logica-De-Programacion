const btn = document.getElementById('conversion');

btn.addEventListener('click', () => {
    let celsius = document.getElementById('celsius').value;
    celsius = parseFloat(celsius);
    
    let fahrenheit = document.getElementById('fahrenheit');
    let kelvin = document.getElementById('kelvin');

    if (isNaN(celsius)) {
        fahrenheit.textContent = '';
        kelvin.textContent = '';
        return alert('Error: Ingresa un número de temperatura válido.')
    }

    fahrenheit.textContent = `${celsius} °C equivalen a ${(celsius*9/5) + 32}°F`;
    kelvin.textContent = `${celsius} °C equivalen a ${celsius + 273.15}°K`;

});
