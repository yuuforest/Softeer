
""" Level 1. [한양대 HCPC 2023] Tren del Fin del Mundo """

import sys

def solution():
    input = sys.stdin.readline

    N = int(input())

    coor = []
    
    for _ in range(N):
        x, y = map(int, input().split())
        coor.append((x, y))

    answer = min(coor, key=lambda x:x[1])
    print(answer[0], answer[1])
    
solution()