let size = Number(prompt("Enter the size of the array:"));

let numbers = [];

for (let i = 0; i < size; i++) {
    numbers[i] = Number(prompt("Enter element " + (i + 1) + ":"));
}

let largest = numbers[0];

for (let i = 1; i < size; i++) {
    if (numbers[i] > largest) {
        largest = numbers[i];
    }
}

alert("Largest number is: " + largest);
console.log("Array:", numbers);
console.log("Largest number:", largest);