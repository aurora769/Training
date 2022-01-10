function getArray12<T>(items: T[]):T[]{
    return new Array<T>().concat(items);
}
let myNumArr12=getArray12<number>([100,200,300]);
let myStrArr12=getArray12<string>(["Hello","World"]);
myNumArr12.push(400);
myStrArr12.push("Hello TypeScript");
//myNumArr12.push("hi");//Compiler Error
//myStrArr12.push(400);//Compiler Error
console.log(myNumArr12);
console.log(myStrArr12);