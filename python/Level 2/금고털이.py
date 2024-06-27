
""" Level 2. 금고털이 """

import sys
from heapq import heappush, heappop

def solution():
    input = sys.stdin.readline

    W, N = map(int, input().split()) 

    gold = []
    for _ in range(N):
        M, P = map(int, input().split())
        heappush(gold, (-P, M))

    weight = W
    answer = 0
    while weight and gold:

        P, M = heappop(gold)

        if M <= weight:
            answer += (-P * M)
            weight -= M
        else:
            answer += (-P * weight)
            weight = 0

    print(answer)
        
solution()