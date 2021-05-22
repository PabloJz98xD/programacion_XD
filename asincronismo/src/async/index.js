const doSomehingAsync = () => {
    return new Promise((resolve, reject) => {
        (true)
        ? setTimeout(() => resolve('Do Something Async'), 3000)
        : reject(new Error('Test Error'))
    });
}

const doSomehing = async () => {
    const something = await doSomehingAsync();
    console.log(something);
}

console.log('Before');
doSomehing();
console.log('After');

const anotherFunction = async () => {
    try{
        const something = await doSomehingAsync();
        console.log(something)
    } catch (error){
        console.error(error)
    }
}   

console.log('Before 1');
anotherFunction();
console.log('After 1');