
""" Level 1. 주행거리 비교하기 """

import sys

def solution():
    input = sys.stdin.readline

    A, B = map(int, input().split())

    if A > B:
        print("A")
    elif A < B:
        print("B")
    else:
        print("same")

solution()