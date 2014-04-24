import sys
import numpy

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    if test:
        vals = test[test.find(';')+1:].split(',')
        chk = numpy.zeros(int(test[:test.find(';')]))
        for val in vals:
            if chk[int(val)] == 1:
                #print val
                print int(val)
            elif chk[int(val)] == 0:
                chk[int(val)] = 1
test_cases.close()