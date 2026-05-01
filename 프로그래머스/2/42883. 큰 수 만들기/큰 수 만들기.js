function solution(number, k) {
    var answer = 0;
    const stack =[]
    for(const count of number){
        while(stack[stack.length -1]<count && answer<k){
            stack.pop();
            answer++;
        }
        stack.push(count);
    }
    while(answer <k){
        stack.pop()
        answer++;
        
    }
    console.log(stack)
    return stack.join('');
}