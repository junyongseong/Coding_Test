function solution(arr)
{
    const stack =[];
    for(const a of arr){
        if(stack[stack.length-1] !==a)
            stack.push(a)
    }
    return stack;
    
}