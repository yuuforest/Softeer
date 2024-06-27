
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
    while weight > 0 and gold:

        P, M = heappop(gold)

        answer += ((-P * M) if M <= weight else (-P * weight))
        weight -= M

    print(answer)
        
solution()