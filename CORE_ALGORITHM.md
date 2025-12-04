### 백준 1260번 — DFS와 BFS 정리
#### 문제 요약

정점 N개, 간선 M개가 주어진 무방향 그래프에서
시작 정점 V부터 DFS와 BFS를 수행한 방문 순서를 출력하는 문제.
정점 번호가 작은 것을 우선 방문해야 하므로 인접 리스트 정렬이 필요하다.

그래프 표현 방식
인접 리스트(Adjacency List)를 사용한다.

ArrayList<Integer>[] graph = new ArrayList[N+1];
for (int i = 1; i <= N; i++) {
    graph[i] = new ArrayList<>();
}


graph[i]는 i번 정점과 연결된 정점들의 리스트
간선 입력 시 양방향으로 추가
graph[a].add(b); graph[b].add(a);

방문 순서를 보장하기 위해 각 리스트를 오름차순 정렬
Collections.sort(graph[i]);
DFS (Depth-First Search)
재귀를 사용하여 깊게 파고드는 방식.

boolean[] visited = new boolean[N+1];

void dfs(int node) {
    visited[node] = true;
    System.out.print(node + " ");

    for (int next : graph[node]) {
        if (!visited[next]) {
            dfs(next);
        }
    }
}


특징:

한 방향으로 끝까지 탐색

재귀 호출을 이용

BFS (Breadth-First Search)

Queue를 사용하여 가까운 정점부터 탐색하는 방식.

void bfs(int start) {
    Queue<Integer> q = new LinkedList<>();
    visited[start] = true;
    q.add(start);

    while (!q.isEmpty()) {
        int cur = q.poll();       // 맨 앞 요소를 꺼내고 삭제
        System.out.print(cur + " ");

        for (int next : graph[cur]) {
            if (!visited[next]) {
                visited[next] = true;
                q.add(next);
            }
        }
    }
}


핵심:

FIFO 방식(Queue)
poll()을 사용하여 노드 처리
peek()는 제거하지 않기 때문에 BFS에 사용하면 안 됨

전체 흐름 요약
1) N, M, V 입력
2) 그래프 배열 생성
3) 간선 입력 (양방향)
4) 각 리스트 정렬
5) visited 초기화 후 DFS(V)
6) visited 초기화 후 BFS(V)

패턴 요약

DFS = 재귀 + 인접 리스트 + visited 체크
BFS = 큐 + 인접 리스트 + visited 체크
인접 리스트 정렬하면 문제의 “작은 번호 우선 방문” 조건 해결
visited는 DFS와 BFS 각각 별도로 초기화해야 함