//1
const cars = [
    { brand: "BMW", price: 20000, isDiesel: true },
    { brand: "Mercedes", price: 22000, isDiesel: false },
    { brand: "Porshe", price: 50000, isDiesel: true },
    { brand: "Nissan", price: 25000, isDiesel: false },
];
console.log(cars);
const brand = cars.map(cars =>({brand: cars.brand, isDiesel: cars.isDiesel}));
console.log(brand);

//2
//Создайте новый массив, где оставьте только машины с дизельным двигателем.
const dieselCars = cars.filter(car => car.isDiesel);
console.log(dieselCars);

//3
//Создайте новый массив, где оставьте только машины не с дизельным двигателем.
const nonDieselCars = cars.filter((car) => car.isDiesel!=true);
console.log(nonDieselCars);

//4 
//Посчитайте общую стоимость всех машин не с дизельным двигателем. 
const totalPrice = cars.reduce((acc,cars)=> acc + cars.price,0);
console.log(totalPrice);

//5
//Повысьте цену всех машин в массиве на 20%.
const addPrice = cars.map(car => {
    return {
        brand: car.brand,
        price: car.price * 1.2, 
        isDiesel: car.isDiesel
    };
});
console.log(addPrice);

//6
//Создайте новый массив, где все дизельные машины заменены на 
//`{ brand: "Tesla", price: 25000, isDiesel: false }`
const updatedCars = cars.map(car => {
    if (car.isDiesel) {
        return { brand: "Tesla", price: 25000, isDiesel: false };
    } else {
        return car;
    }
});
console.log(updatedCars);