class Car{
    Speed:number=12;
    RPrice:number=123;
    Color:string="Red"
    constructor(i:number,n:number,s:string){
        this.Speed=i;
        this.RPrice=n;
        this.Color=s;
    }
    Car(){

    }
    display()
    {
        console.log(this.Speed);
        console.log(this.RPrice);
        console.log(this.Color);
    }
}
function getSalePrice(prdPrice) {
    var totalPrice =(prdPrice/100)+prdPrice*0.18;
    
    return totalPrice
    
    }



console.log(getSalePrice(230));