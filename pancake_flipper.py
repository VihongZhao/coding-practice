def pancake_flipper():
    case_line=input().split()
    s=list(case_line[0])
    k=int(case_line[1])
    flips=0
    for i in range(len(s)-k+1):
        if s[i]=="-":
            flips+=1
            for j in range(i,i+k):
                s[j]=flip(s[j])
    if all_happy(s):
        return flips
    else:
        return "IMPOSSIBLE"
        
def flip(c):
    if c=="+":
        return "-"
    elif c=="-":
        return "+"
        
def all_happy(s):
    for i in range(len(s)):
        if s[i]!="+":
            return False
    return True
    
t = int(input())  # read a line with a single integer
for i in range(1, t + 1):
    print("Case #{}: {}".format(i, pancake_flipper()))
