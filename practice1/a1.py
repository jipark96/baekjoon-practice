# A,B = input().split()
# print(int(A) + int(B))
# print(int(A) - int(B))
# print(int(A) * int(B))
# print(int(A) // int(B))
# print(int(A) % int(B))

# 18108번
# a= input()
# print(int(a)-543)

# 3003번
# a = [1,1,2,2,2,8]
# b= list(map(int,input().split()))
# for i in range(6):
#   print(a[i]-b[i],end=' ')

# 10430번
# A,B,C = map(int, input().split())
# print((A+B)%C)
# print(((A%C)+(B%C))%C)
# print((A*B)%C)
# print(((A%C)*(B%C))%C)

# 2588번
# a= int(input())
# b=input()

# print(a*int(b[2]))
# print(a*int(b[1]))
# print(a*int(b[0]))
# print(a*int(b))

# 25083번
# print("         ,r\'\"7")
# print("r`-_   ,\'  ,/")
# print(" \\. \". L_r\'")
# print("   `~\\/")
# print("      |")
# print("      |")

#1330번
# A,B = map(int, input().split())
# if(A>B):
#   print(">")
# elif(A<B):
#   print("<")
# else:
#   print("==")

#9498번
# a = int(input())
# if(a%4==0 and a%100 !=0 or a%400==0):
#   print(1)
# else:
#   print(0)

#14681번
# a = int(input())
# b = int(input())

# if(a>0 and b>0):
#   print(1)
# elif(a<0 and b>0):
#   print(2)
# elif(a<0 and b<0):
#   print(3)
# elif(a>0 and b<0):
#   print(4)

# 2884번
# a,b = map(int,input().split())
# if(b>=45):
#   print(a,b-45)
# else:
#   if(a==0):
#     a=23
#     print(a, b+15)
#   else:
#     print(a-1,b+15)

# 2525번
H,M = map(int,input().split())
T = int(input())

H += T//60
M += T%60

if(M>=60):
  H = H+1
  M = M-60
elif(H>=24):
  H= H-24
print(H,M)
