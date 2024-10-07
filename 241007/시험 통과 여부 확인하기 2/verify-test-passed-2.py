student_num = int(input())
pass_cnt=0
for _ in range(student_num):
    score_list = list(map(int, input().split()))
    avg = sum(score_list) / len(score_list)
    if avg >=60:
        print("pass")
        pass_cnt+=1
    else:
        print("fail")
print(pass_cnt)