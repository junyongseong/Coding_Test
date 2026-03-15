function solution(bridge_length, weight, truck_weights) {
    //다리길이 = bridge_length, 최대 무게 = weight, 배열= truck_weights , 시간 = time으로
    //다리를 q처럼 ex) 다리길이 5면 배열 5짜리
    const bridge = Array(bridge_length).fill(0);
    let nowWeight=0;
    let time =0;
    //트럭의 무게랑 현재 무게가 0보다 클떄 동안
    while(truck_weights.length>0 || nowWeight>0){
        time++;//0->1->2~~~
        nowWeight -= bridge.shift(); //맨 앞 제거
        if(truck_weights.length>0 && nowWeight +truck_weights[0]<=weight){
            const truck = truck_weights.shift();
            bridge.push(truck);
            nowWeight += truck;
        }else
            bridge.push(0)
    }
    return time;
}