class Plant{
    constructor(height, age){
        
        this.height = height;
        this.age = age;
    }

grow() {
    this.height += 10;
}
}
class Rose extends Plant {
    constructor(height, age, numberOfFlowers) {
        super(height, age);
        this.numberOfFlowers = numberOfFlowers;
    }
}
// Создаем объект класса Rose
let rose = new Rose(30, 2, 5);
console.log(`Исходная высота: ${rose.height} см, Возраст: ${rose.age} лет, Количество бутонов: ${rose.numberOfFlowers}`);

// Вызываем метод grow для увеличения роста на 10 см
rose.grow();
console.log(`Высота после роста: ${rose.height} см`);