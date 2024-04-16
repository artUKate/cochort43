//Homework 1

const getElementByIndex = (array, index) => array[index];
const res = getElementByIndex(['lime', 'orange', 'banana'],2);
console.log(res);

// Homework 2

function weather(code, decode){
    return decode(code);
    
}
function decodeWeather(code) {
    switch(code) {
        case 'SQ':
            return 'Шквал';
        case 'PO':
            return 'Пыльный вихрь';
        case 'FC':
            return 'Торнадо';
        case 'BR':
            return 'Дымка (видимость от 1 до 9 км)';
        case 'HZ':
            return 'Мгла (видимость менее 10 км)';
        case 'FU':
            return 'Дым (видимость менее 10 км)';
        case 'DS':
            return 'Пыльная буря (видимость менее 10 км)';
        case 'SS':
            return 'Песчаная буря (видимость менее 10 км)';
        default:
            return 'Неизвестный код погоды';
    }
}


console.log(weather('SQ', decodeWeather)); 
console.log(weather('FC', decodeWeather)); 
console.log(weather('BR', decodeWeather)); 
console.log(weather('XX', decodeWeather)); 