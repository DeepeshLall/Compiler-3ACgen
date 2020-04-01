import sys
import pdb
import SymbolTable


global ST
ST = SymbolTable.SymbolTable()


class TAC:

    def __init__(self):
        self.labelCount = 0
        self.code = []
        # self.tempNo = [0]*500 #0 implies available
        self.tempNo = 0

    def getTemp(self):
        # ind = 0
        # while self.tempNo[ind]!=0:
        #     ind = ind + 1
        # self.tempNo[ind]=1 #mark this index as occupied
        self.tempNo+=1
        # name = 'temp' + str(ind)
        name = 'temp' + str(self.tempNo)
        #self.Add('variables',name,0,type,None) Not adding temporaries t SymbolTable
        return name

    def newLabel(self):
        label = "l" + str(self.labelCount)
        self.labelCount += 1
        return label

    def emit(self, lhs, rhs, rhs1, operator):
        rhs = str(rhs)
        rhs1 = str(rhs1) # Currently only declared variable is increasing offset for Function in Symbol Table, 
                        # need to be revised for function entry point for BeginFunc for "temp" as well
        self.code.append([lhs,rhs,rhs1,operator])
        # if 'temp' == rhs[0:5]:
        #     ind = int(rhs[4])
        #     ST.tempNo[ind] = 0 #Free this temporary
        # if 'temp' in rhs1[0:5]:
        #     ind = int(rhs1[4])
        #     ST.tempNo[ind] = 0 #Free this temporary


    def backpatch(self,list1,label):
        #pdb.set_trace()
        for x in list1:
            self.code[x][3] = label
