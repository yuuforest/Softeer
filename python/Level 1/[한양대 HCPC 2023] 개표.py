
""" Level 1. [한양대 HCPC 2023] 개표 """

import sys

def solution():
    input = sys.stdin.readline

    T = int(input())
    for _ in range(T):
        N = int(input())
        print("++++ " * (N // 5) + "|" * (N % 5))

solution()