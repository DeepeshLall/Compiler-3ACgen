def checkCompatiability(a,b):
    print(a,b)
    if a==b:
        print(a," is compatiable with ",b)
        return
    if a=="int":
        if b=="float":
            print(a," can be typecasted to ",b)
            return
        else:
            print("Typecasting not possible")
            return
    if a=="float":
        if b=="int":
            print("Typecasting not possible")
            return 
    if a=="char":
        print("Typecasting not possible")
        return
    if a=="string":
        if b=="char":
            print(a," can be typecasted to ",b)
            return
        else:
            print("Typecasting not possible")
            return
    if a=="boolean":
        print("Typecasting not possible")
        return
    if a=="null":
        print("Typecasting not possible")
        return