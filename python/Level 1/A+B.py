
""" Level 1. A + B """

import sys

def solution():
    input = sys.stdin.readline

    T = int(input())
    for t in range(T):

        A, B = map(int, input().split())

        print("Case #{0}: {1}".format(t+1, A+B))

solution()