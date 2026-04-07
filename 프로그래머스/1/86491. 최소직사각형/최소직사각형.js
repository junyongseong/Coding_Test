function solution(sizes) {
    let ar1 =[];
    let ar2 =[];
    
    for(let a of sizes){
        a.sort((a,b)=>(b-a))
        ar1.push(a[0]);
        ar2.push(a[1]);
    }
    return Math.max(...ar1)*Math.max(...ar2);
}