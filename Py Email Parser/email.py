import sys
import re
test_cases = open(sys.argv[1], 'r')
#rex="'([\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7})'"
rex="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"
for test in test_cases:
    if test:
        if re.match(rex, test.lower()):
            print 'true'
        else:
            print 'false'

test_cases.close()